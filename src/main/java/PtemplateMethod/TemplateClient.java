package PtemplateMethod;

/**
 * @Class_NAME TemplateClient
 * @Auther 张明慧
 * @Date 2019/3/31 19:37
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractClass abstractClass;

        abstractClass=new ConcreteClassA();
        abstractClass.TemplateMethod();

        abstractClass=new ConcreteClassB();
        abstractClass.TemplateMethod();

        System.out.println("客户端方法执行结束");

    }
}
