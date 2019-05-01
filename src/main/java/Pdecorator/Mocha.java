package Pdecorator;

/**
 * 摩卡，继承自调味品装饰者
 * @Class_NAME Mocha
 * @Auther 张明慧
 * @Date 2019/4/2 15:45
 */
public class Mocha extends CondimentDecorator {

    // 用一个变量记录饮料，也就是被装饰者
    Beverage beverage;

    // 把被装饰者记录到实例变量中
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 描述调味品和饮料
        return "摩卡" + beverage.getDescription();
    }

    @Override
    public double cost() {
        // 加摩卡一块钱，计算加了摩卡的饮料的价钱
        return 1.0 + beverage.cost();

    }
}
