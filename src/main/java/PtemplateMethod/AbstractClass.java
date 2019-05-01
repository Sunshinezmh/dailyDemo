package PtemplateMethod;

/**
 * @Class_NAME AbstractClass
 * @Auther 张明慧
 * @Date 2019/3/31 19:33
 */
public abstract class AbstractClass {

    public abstract void PrimitiveOperation1();
    public abstract void PrimitiveOperation2();

    public void TemplateMethod(){
        PrimitiveOperation1();
        PrimitiveOperation2();
        System.out.println("抽象方法");
    }
}
