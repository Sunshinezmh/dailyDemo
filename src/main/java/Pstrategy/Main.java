package Pstrategy;

/**
 * @Class_NAME Main
 * @Auther 张明慧
 * @Date 2019/4/1 17:38
 */
public class Main {
    public static void main(String[] args) {
        Context context=new Context(new MD5Strategy());
        context.encrypt();
    }

}
