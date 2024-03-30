package com.example.sisrlab2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class CPPToAssemblyTransformer {

    public String transform(String input) {
        CharStream charStream = CharStreams.fromString(input);
        CPPLexer lexer = new CPPLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPPParser parser = new CPPParser(tokens);

        ParseTree tree = parser.program();

        CPPToAssemblyListener listener = new CPPToAssemblyListener();

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree);

        String assemblyCode = listener.getAssemblyCode();

        return assemblyCode;
    }
}
