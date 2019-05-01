package Pdecorator;

/**
 * @Class_NAME TeaMilk
 * @Auther 张明慧
 * @Date 2019/4/2 15:40
 */
public class TeaMilk extends Beverage {
    public TeaMilk(){
        //饮料的描述
        description="奶茶";
    }


    @Override
    public double cost() {
        //奶茶一杯三块钱
        return 3.0;
    }
}
