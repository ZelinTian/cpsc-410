package ast;

import libs.Node;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by zelin on 2018/10/10.
 */
public class CREATE extends STATEMENT {
    private SECTION_CONTENT codeSectionContent;
    private SECTION codeSection;

    @Override
    public void parse() {
        tokenizer.getAndCheckNext("Create");
        String target = tokenizer.getNext();
        String a = tokenizer.getNext();
//        String s1 = tokenizer.getNext();
        if (a.equals("called")){
            codeSection = new SECTION();
            codeSection.parse();
        } else if (a.equals("String")){
            codeSectionContent = new SECTION_CONTENT();
            codeSectionContent.parse();
        }
    }

    @Override
    public String evaluate() throws FileNotFoundException, UnsupportedEncodingException {
        return null;
    }
}
