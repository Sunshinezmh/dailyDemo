package Pdecorator;

/**
 * @Class_NAME Beverage
 * @Auther 张明慧
 * @Date 2019/4/2 15:36
 */
public abstract class Beverage {
    // 饮料的描述
    protected String description;

    public Beverage() {
        this.description = "饮料的抽象类";
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
