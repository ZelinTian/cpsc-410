package ast;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

/**
 * Created by zelin on 2018/9/18.
 */
public class AUTHOR extends STATEMENT {
    String name;
    @Override
    public void parse() {
//        tokenizer.getAndCheckNext("connect");
//        //some shape string
        tokenizer.getNext();
        tokenizer.getNext();
        name = tokenizer.getNext();
        tokenizer.getNext();
        tokenizer.getNext();

        System.out.println("!!!" + name);
//        //"called"
//        tokenizer.getAndCheckNext("to");
//        //some name string
//        name2 = tokenizer.getNext();
//        //"please"
//        tokenizer.getAndCheckNext("please");
    }

    // (red){ fsdfdsfdsf }
    @Override
    public String evaluate() throws FileNotFoundException, UnsupportedEncodingException {


        return  null;
    }
}
