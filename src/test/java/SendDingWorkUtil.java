import com.dingtalk.open.client.api.model.corp.MessageBody;
import com.dingtalk.open.client.api.model.corp.MessageType;
import dingding.GetAccessToken;
import dingding.LightAppMessageDelivery;
import dingding.MessageHelper;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 发送个人消息
 * @Class_NAME: SendDingWorkUtil
 * @Auther: 张明慧
 * @Date: 2018/12/5 21:02
 * @Description:
 */
public class SendDingWorkUtil {
    private static SimpleDateFormat sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void sendWorkMessage() throws Exception {
        String AGENTID="206442173";
        String toUsers="manager2793";
        String timeStr= sdfTime.format(new Date()).toString();
        String time=timeStr.substring(11,16);
        //获取accesstoken
        String accessToken = GetAccessToken.getAccessToken();
        MessageBody.LinkBody linkBody = new MessageBody.LinkBody();
        linkBody.setMessageUrl("https://dmsdbj.com/integral/");
        linkBody.setPicUrl("@lALOACZwe2Rk");
        linkBody.setTitle("今目标考勤异常 "+ time);
        linkBody.setText("亲，您的今目标没有打卡信息,系统已经向纪委发送通知消息，请您及时联系纪委哦！");

        //部门id列表，多个接收者用|分隔，TO_USER和TO_PARTY二者有一个必填
        String TO_PARTY = "";
        //发送微应用消息
        LightAppMessageDelivery lightAppMessageDelivery = new LightAppMessageDelivery(toUsers,TO_PARTY, AGENTID);

        //发送普通消息
        lightAppMessageDelivery.withMessage(MessageType.LINK, linkBody);
        MessageHelper.send(accessToken, lightAppMessageDelivery);
        System.out.println("成功发送文本消息");
    }
}
