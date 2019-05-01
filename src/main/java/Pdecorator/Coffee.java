package Pdecorator;

/**
 * @Class_NAME Coffee
 * @Auther 张明慧
 * @Date 2019/4/2 15:41
 */
public class Coffee extends Beverage {
    public Coffee() {
        //饮料的描述
        description="咖啡";
    }

    @Override
    public double cost() {
        //咖啡一杯四块钱
        return 4.0;
    }
}
