package Pdecorator;

/**
 * @Class_NAME Decorator
 * @Auther 张明慧
 * @Date 2019/4/2 11:16
 */
public abstract  class Decorator extends Component {
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    @Override
    public void Operation() {
        if (component != null) {
            component.Operation();
        }
    }
}
