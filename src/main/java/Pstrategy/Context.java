package Pstrategy;

/**
 * @Class_NAME Context
 * @Auther 张明慧
 * @Date 2019/4/1 17:36
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt(){
        strategy.encrypt();
    }

}
