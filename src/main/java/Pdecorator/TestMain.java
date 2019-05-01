package Pdecorator;

/**
 * @Class_NAME TestMain
 * @Auther 张明慧
 * @Date 2019/4/2 15:49
 */
public class TestMain {
    public static void main(String[] args) {
        // 点一杯蜂蜜摩卡咖啡
        Beverage beverage=new Coffee(); // 定义咖啡对象
        beverage=new Mocha(beverage); // 用摩卡装饰
        beverage = new Honey(beverage);// 用蜂蜜装饰

        System.out.println("顾客点了（" + beverage.getDescription() + "）\n价格是："
                + beverage.cost() + "元");

        // 点一杯加糖奶茶
        Beverage beverage2 = new TeaMilk();// 定义奶茶对象
        beverage2 = new Sugar(beverage2);// 用糖装饰

    }
}
