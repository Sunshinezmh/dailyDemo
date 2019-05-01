package Pdecorator;

/**
 * @Class_NAME ConcreteDecoratorB
 * @Auther 张明慧
 * @Date 2019/4/2 11:23
 */
public class ConcreteDecoratorB extends Decorator{

    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior(){}

}
