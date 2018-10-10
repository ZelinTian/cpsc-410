package ast;

import libs.Node;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class SECTION extends Node{
    private String  sectionId;

    @Override
    public void parse() {
        sectionId = tokenizer.getNext();
        System.out.println("section id " + sectionId);
    }

    @Override
    public String evaluate() throws FileNotFoundException, UnsupportedEncodingException {


        return  null;
    }
}
