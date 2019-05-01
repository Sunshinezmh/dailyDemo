package Pdecorator;

/**
 * @Class_NAME ConcreteComponent
 * @Auther 张明慧
 * @Date 2019/4/2 11:16
 */
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体对象的操作");
    }
}
