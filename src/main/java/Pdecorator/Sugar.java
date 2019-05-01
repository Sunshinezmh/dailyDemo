package Pdecorator;

/**
 * 糖，继承自调味品抽象类
 * @Class_NAME Sugar
 * @Auther 张明慧
 * @Date 2019/4/2 15:47
 */
public class Sugar extends CondimentDecorator {

    // 用一个变量记录饮料，也就是被装饰者
    Beverage beverage;

    // 把被装饰者记录到实例变量中
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // 描述加糖的饮料
        return "加糖" + beverage.getDescription();
    }

    @Override
    public double cost() {
        // 计算加了糖的饮料的价钱
        return 1.0 + beverage.cost();
    }
}
