package ast;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import libs.Node;
import java.util.ArrayList;

public class INFO extends Node {

    private List<SECTION> sections = new ArrayList<SECTION>();

    public static SECTION getSECTION() {
        if (tokenizer.checkToken("Section")) {
            return new SECTION();
        } else return null;
    }

    @Override
    public void parse() {


    }

    @Override
    public String evaluate() throws FileNotFoundException, UnsupportedEncodingException {
        for (SECTION s : sections) {
            s.evaluate();}
            return null;
        }

    }

