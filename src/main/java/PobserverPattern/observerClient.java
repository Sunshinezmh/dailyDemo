package PobserverPattern;

/**
 * @Class_NAME observerClient
 * @Auther 张明慧
 * @Date 2019/3/30 20:32
 */
public class observerClient {
    public static void main(String[] args) {
           ConcreteSubject subject=new ConcreteSubject();

           subject.attach(new ConcreteObserver(subject, "X"));
           subject.attach(new ConcreteObserver(subject, "Y"));
           subject.attach(new ConcreteObserver(subject, "Z"));

           subject.SubjectState="ABC";
           subject.notify1();
    }
}
