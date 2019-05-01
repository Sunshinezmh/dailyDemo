package Padapter;

/**
 * @Class_NAME ThreePinSoketAmerica 实现一个具体的 adaptee
 * @Auther 张明慧
 * @Date 2019/4/1 16:51
 */
public class ThreePinSoketAmerica implements ThreePinSoket {
    @Override
    public void chargeWithThreePin() {
        System.out.println("美国标准的三孔的插座");
    }

    @Override
    public int voltage() {
        // 美国电压是110伏
        return 110;
    }
}
