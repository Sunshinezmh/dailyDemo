package Padapter;

/**
 *  target(适配目标) ———— 我的荣耀手机充电器是两个插头，所以需要两个插孔的插座
 * @Class_NAME TwoPinSocket
 * @Auther 张明慧
 * @Date 2019/4/1 16:52
 */
public interface TwoPinSocket {
    public void chargeWithTwoPin();
    public int voltage();
}
