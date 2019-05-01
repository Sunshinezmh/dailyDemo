package Pdecorator;

/**
 * @Class_NAME ConcreteDecoratorA
 * @Auther 张明慧
 * @Date 2019/4/2 11:20
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void Operation() {
      super.Operation();
      addedState="New State";
        System.out.println("具体装饰对象A的操作");
    }

}
