package PobserverPattern;

import java.util.ArrayList;

/**
 * @Class_NAME Subject   抽象主题
 * @Auther 张明慧
 * @Date 2019/3/29 17:58
 */
public abstract class Subject {

    protected ArrayList<Observer> observers = new ArrayList();

    //增加观察者
    public void attach(Observer observer){
        observers.add(observer);
    }

    //移除观察者
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void notify1(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
