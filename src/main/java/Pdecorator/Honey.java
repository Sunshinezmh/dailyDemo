package Pdecorator;

/**
 * 蜂蜜，继承自调味品抽象类
 *
 * @Class_NAME Honey
 * @Auther 张明慧
 * @Date 2019/4/2 15:42
 */
public class Honey extends CondimentDecorator {

    // 记录饮料的变量，是被装饰者
    Beverage beverage;

    // 让被装饰者记录到实例变量中
    public Honey(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 描述调味品和饮料
        return "蜂蜜" + beverage.getDescription();
    }

    @Override
    public double cost() {
        // 加蜂蜜一块钱，计算加了蜂蜜的饮料的价钱
        return 1.0 + beverage.cost();
    }

}
