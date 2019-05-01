package dingding;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * @Class_NAME DingdingDemo
 * @Auther 张明慧
 * @Date 2019/2/1 21:27
 */
public class GetAccessToken {
    /**
     * 功能描述:获取accesstoken
     *
     * @param:
     * @return:
     * @auther: 张明慧
     * @since: 1.0.0 2018/12/5 20:22
     */
    public static String getAccessToken() {
        //CorpID是大米时代在钉钉中的标识
        String CORPID="dingcd4bc165e90fa56335c2f4657eb6378f";
        //企业凭证密钥
        String CORPSECRET="nZfTeNaCPBI7_iQnWkAc1kO0QbrK46Ws8gYjdUALDc5Dz7-6t5wsNoaZ4DCC2R4B";
        JSONObject accesstoken = null;
        String accesstoken2 = "";
        String urlaccesstoken = "https://oapi.dingtalk.com/gettoken?corpid=" + CORPID + "&corpsecret=" + CORPSECRET;
        System.out.println("打印的地址" + urlaccesstoken);

        accesstoken = httpGet(urlaccesstoken);
        JSONObject accesstoken1 = new JSONObject(accesstoken);
        //调用接口得到的access_token
        accesstoken2 = (String) accesstoken1.get("access_token");
        return accesstoken2;
    }

    public static JSONObject httpGet(String url) {
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        RequestConfig requestConfig = RequestConfig.custom().
                setSocketTimeout(2000).setConnectTimeout(2000).build();
        httpGet.setConfig(requestConfig);
        try {
            response = httpClient.execute(httpGet, new BasicHttpContext());
            System.out.println(response.getStatusLine().getStatusCode());
            if (response.getStatusLine().getStatusCode() != 200) {

                System.out.println("request url failed, http code=" + response.getStatusLine().getStatusCode() + ", url=" + url);
                return null;
            }
            HttpEntity entity = response.getEntity();
            System.out.println(entity);
            if (entity != null) {
                String resultStr = EntityUtils.toString(entity, "utf-8");
                System.out.println(resultStr);

                JSONObject result = JSON.parseObject(resultStr);
                if (result.getInteger("errcode") == 0) {
                    return result;
                } else {
                    System.out.println("request url=" + url + ",return value=");
                    System.out.println(resultStr);
                    int errCode = result.getInteger("errcode");
                    String errMsg = result.getString("errmsg");
                }
            }
        } catch (IOException e) {
            System.out.println("request url=" + url + ", exception, msg=" + e.getMessage());
            e.printStackTrace();
        } finally {
            if (response != null) try {
                response.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}
