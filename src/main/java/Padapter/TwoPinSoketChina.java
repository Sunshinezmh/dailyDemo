package Padapter;

/**
 * client(具体的adaptee) ———— 这个就是我在中国的墙上的两个插孔的插座，我充电只能用这个
 * @Class_NAME TwoPinSoketChina
 * @Auther 张明慧
 * @Date 2019/4/1 16:53
 */
public class TwoPinSoketChina implements TwoPinSocket {
    @Override
    public void chargeWithTwoPin() {
        System.out.println("中国标准的两孔的插座");
    }

    @Override
    public int voltage() {
        // 中国电压是220伏
        return 220;
    }
}
