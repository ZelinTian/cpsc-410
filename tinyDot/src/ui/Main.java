package ui;

import ast.PROGRAM;
import ast.SECTION;
import libs.Tokenizer;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        List<String> literals = Arrays.asList("Hello!","Thanks!","please","make me a", "called", "connect","to","Set","Author","Create","String","Called", "the title of","\"");
        Tokenizer.makeTokenizer("input.tdot",literals);
        PROGRAM p = new PROGRAM ();
        p.parse();
        p.evaluate();
        System.out.println("Completed successfully!!!!!");
    }

}
