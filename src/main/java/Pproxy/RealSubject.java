package Pproxy;

/**
 * @Class_NAME RealSubject
 * @Auther 张明慧
 * @Date 2019/4/2 09:13
 */
public class RealSubject extends Subject {

    @Override
    public void Request() {
        System.out.println("真实的请求");
    }
}
