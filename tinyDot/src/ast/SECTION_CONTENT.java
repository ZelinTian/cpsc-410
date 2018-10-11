package ast;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zelin on 2018/10/9.
 */
public class SECTION_CONTENT extends STATEMENT {

    private String content;
    private String contentId;
    private List<SECTION> subsection = new ArrayList<SECTION>();
    @Override
    public void parse() {
        tokenizer.getNext();
        tokenizer.getNext();
        content = tokenizer.getNext();
        System.out.println("string content :" + content);
//        tokenizer.getAndCheckNext("Called");
        tokenizer.getNext();
        tokenizer.getNext();
        tokenizer.getNext();
        contentId = tokenizer.getNext();
        System.out.println("id" + contentId);
    }

    @Override
    public String evaluate() throws FileNotFoundException, UnsupportedEncodingException {


        return  null;
    }
}
