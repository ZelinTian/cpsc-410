package ast;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by zelin on 2018/10/10.
 */
public class SET extends STATEMENT {
//    private Title codeTitle;
    private AUTHOR codeAuthor;
    private SECTION_TITLE codeSectionTitle;
    private DATE codeDate;
    private TITLE codeTitle;
    @Override
    public void parse() {
        tokenizer.getAndCheckNext("Set");
        String target = tokenizer.getNext();
        String a = tokenizer.getNext();
//        String s1 = tokenizer.getNext();
        if (a.equals("the title of")){
            codeSectionTitle = new SECTION_TITLE();
            codeSectionTitle.parse();
        } else if (a.equals("Author")){
            codeAuthor = new AUTHOR();
            codeAuthor.parse();
        } else if (a.equals("Date")){
            codeDate = new DATE();
            codeDate.parse();
        } else if (a.equals("Title")){
            codeTitle = new TITLE();
            codeTitle.parse();
        }
    }

    @Override
    public String evaluate() throws FileNotFoundException, UnsupportedEncodingException {


        return  null;
    }
}
