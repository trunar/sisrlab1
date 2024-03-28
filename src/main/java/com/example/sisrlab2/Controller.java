package com.example.sisrlab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Controller {
    @FXML
    private Button transferButton;
    @FXML
    private TextArea inTextArea, tokenTextArea, symbolTableTextArea;
    @FXML
    public void onTransferButtonAction(ActionEvent event) throws IOException {
        String inText = inTextArea.getText();
        StringBuilder outText = new StringBuilder();
        StringBuilder symbolTable = new StringBuilder();
        HashMap<String, Integer> symbolTableMap = new HashMap<>();
        HashSet<String> usedVariables = new HashSet<>();
        HashSet<String> declaredFunctions = new HashSet<>();

        CPPLexer CPPLexer = new CPPLexer(new ANTLRInputStream(inText));
        Token token;

        String format = "%-25s %-25s %-25s\n";
        outText.append(String.format(format, "Текст", "Токен", "Рядок"));
        symbolTable.append("Таблиця символів:\n");
        symbolTable.append(String.format("%-25s %-25s\n", "Символ", "Рядок"));

        boolean inVariableDeclaration = false;
        String currentVariableName = null;
        String currentFunctionName = null;  

        while ((token = CPPLexer.nextToken()).getType() != Token.EOF) {
            String tokenText = token.getText();
            String tokenName = CPPLexer.getVocabulary().getSymbolicName(token.getType());
            int tokenLine = token.getLine();

            outText.append(String.format(format, tokenText, tokenName, tokenLine));

            if (tokenName.equals("TYPES")) {
                inVariableDeclaration = true;
            } else if (inVariableDeclaration && tokenName.equals("IDENTIFIER")) {
                currentVariableName = tokenText;
                if (symbolTableMap.containsKey(currentVariableName)) {
                    System.out.println("Помилка: Повторення змінної '" + currentVariableName + "' на рядку " + tokenLine);
                } else {
                    symbolTableMap.put(currentVariableName, tokenLine);
                    symbolTable.append(String.format("%-25s %-25s\n", currentVariableName, tokenLine));
                }
                inVariableDeclaration = false;
            } else if (tokenName.equals("FUNCTION")) {
                currentFunctionName = tokenText;
                if (declaredFunctions.contains(currentFunctionName)) {
                    System.out.println("Помилка: Повторення функції '" + currentFunctionName + "' на рядку " + tokenLine);
                } else {
                    declaredFunctions.add(currentFunctionName);
                    symbolTableMap.put(currentFunctionName, tokenLine);
                    symbolTable.append(String.format("%-25s %-25s\n", currentFunctionName, tokenLine));
                }
            } else if (tokenName.equals("IDENTIFIER")) {
                String identifierName = tokenText;
                if (!symbolTableMap.containsKey(identifierName) && !declaredFunctions.contains(identifierName)) {
                    System.out.println("Помилка: Використання невизначеної змінної або функції '" + identifierName + "'");
                }
                usedVariables.add(identifierName);
            } else if (tokenName.equals("SEMI")) {
                inVariableDeclaration = false;
                currentVariableName = null;
            } else if (tokenName.equals("IDENTIFIER")) {
                String currentIdentifier = tokenText;
                usedVariables.add(currentIdentifier);

                Token nextToken = CPPLexer.nextToken();
                if (nextToken.getType() != CPPLexer.INTEGER_LITERAL && !nextToken.getText().equals("[")) {
                    System.out.println("Помилка: Індекс масиву повинен бути числовим на рядку " + tokenLine);
                }
            } else if (tokenName.equals("SEMI")) {
                inVariableDeclaration = false;
            }
        }

        for (String variable : symbolTableMap.keySet()) {
            if (!usedVariables.contains(variable) && !declaredFunctions.contains(variable)) {
                System.out.println("Попередження: Змінна або функція '" + variable + "' оголошена, але не використовується у програмі");
            }
        }

        tokenTextArea.setText(String.valueOf(outText));
        symbolTableTextArea.setText(String.valueOf(symbolTable));
    }



    @FXML
    public void onTransferButtonMouseEntered(MouseEvent event) throws IOException{
        transferButton.setStyle("-fx-background-color:#FEFAE0; -fx-background-radius:50px;");
    }
    @FXML
    public void onTransferButtonMouseExited(MouseEvent event) throws IOException{
        transferButton.setStyle("-fx-background-color:#4CAF50; -fx-background-radius:50px");
    }
}