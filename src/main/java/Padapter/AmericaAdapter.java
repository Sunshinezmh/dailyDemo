package Padapter;

/**
 * 实现Target, 组合Adaptee
 * 去美国旅游，必须带上一个“美国适配器”：实现两孔插座，组合三孔插座。用来给我的荣耀手机充电
 * @Class_NAME AmericaAdapter
 * @Auther 张明慧
 * @Date 2019/4/1 16:54
 */
public class AmericaAdapter implements TwoPinSocket {
    ThreePinSoket threePinSoket; // 组合三孔插座(adaptee)

    public AmericaAdapter(ThreePinSoket threePinSoket){
        this.threePinSoket=threePinSoket;
    }


    @Override
    public void chargeWithTwoPin() {
        threePinSoket.chargeWithThreePin();
    }

    @Override
    public int voltage() {
        // 适配器把电压从 110V 升到 220V
        return threePinSoket.voltage()* 2 ;
    }
}
