package Pproxy;

/**
 * @Class_NAME Proxy
 * @Auther 张明慧
 * @Date 2019/4/2 09:14
 */
public class Proxy extends Subject {

    RealSubject realSubject;

    @Override
    public void Request() {
        if (realSubject == null) {
            realSubject=new RealSubject();
        }
        realSubject.Request();
    }
}
