package ast;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by shuibo on 2018/10/11.
 */
public class TITLE extends STATEMENT {
    String name;
    @Override
    public void parse() {
        tokenizer.getNext();
        tokenizer.getNext();
        name = tokenizer.getNext();
        tokenizer.getNext();
        tokenizer.getNext();

        System.out.println("!!!" + name);
    }

    @Override
    public String evaluate() throws FileNotFoundException, UnsupportedEncodingException {
        return  null;
    }
}
