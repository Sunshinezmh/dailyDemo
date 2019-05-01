package Padapter;

/**
 * @Class_NAME RongYaoClient
 * @Auther 张明慧
 * @Date 2019/4/1 16:57
 */
public class RongYaoClient {
    TwoPinSocket twoPinSocket;

    public RongYaoClient(){}

    public void setTwoPinSocket(TwoPinSocket twoPinSocket) {
        this.twoPinSocket = twoPinSocket;
    }

    public void chargeRequest(){
        System.out.println("华为荣耀手机， " + twoPinSocket.voltage() + " 伏特充电中\n");
    }
}
