package PobserverPattern;

/**
 * @Class_NAME ConcreteObserver
 * @Auther 张明慧0
 * @Date 2019/3/29 19:23
 */
public class ConcreteObserver extends Observer {

    private String name;
    private String observerState;
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject,String name){
        this.subject=subject;
        this.name=name;
    }

    @Override
    public void update(){
        observerState=subject.SubjectState;
    }
}
