package com.example.sisrlab1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.IOException;

public class Controller {
    @FXML
    private Button transferButton;
    @FXML
    private TextArea inTextArea, outTextArea;
    @FXML
    public void onTransferButtonAction(ActionEvent event) throws IOException{
        String inText = inTextArea.getText();
        StringBuilder outText = new StringBuilder();
        CPPLexer CPPLexer = new CPPLexer(new ANTLRInputStream(inText));
        Token token;
        String format = "%-25s %-25s %-25s\n";
        outText.append(String.format(format, "Текст", "Токен", "Рядок"));
        while ((token = CPPLexer.nextToken()).getType() != Token.EOF) {
            outText.append(String.format(format, token.getText(), CPPLexer.getVocabulary().getSymbolicName(token.getType()), token.getLine()));
        }
        outTextArea.setText(String.valueOf(outText));
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