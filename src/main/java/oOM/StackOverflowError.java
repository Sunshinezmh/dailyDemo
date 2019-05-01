package oOM;

import java.util.Stack;

/**
 * @Class_NAME StackOverflowError
 * @Auther 张明慧
 * @Date 2019/3/29 10:39
 */
public class StackOverflowError {

    /**
     * 栈溢出
     * @param args
     */
    public static void main(String[] args){
        new StackOverflowError().test();
    }

    public void test(){
        test();
    }

}
