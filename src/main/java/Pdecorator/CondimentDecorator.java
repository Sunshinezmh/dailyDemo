package Pdecorator;

/**
 * @Class_NAME CondimentDecorator
 * @Auther 张明慧
 * @Date 2019/4/2 15:38
 */
public abstract  class CondimentDecorator extends Beverage {
    public CondimentDecorator() {
        description = "调味品的抽象类";
    }

    @Override
    public abstract String getDescription();//所有的调料品装饰者必须重写getDescription()方法

    @Override
    public abstract double cost();//所有的调料品装饰者必须重写cost()方法

}
