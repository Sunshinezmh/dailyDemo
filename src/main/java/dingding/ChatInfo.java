package dingding;

import java.io.Serializable;
import java.util.List;

/**
 * @Class_NAME: ChatInfo
 * @Auther: 张明慧
 * @Date: 2018/12/2 16:55
 * @Description:
 */
public class ChatInfo implements Serializable {
    public static final long serialVersionUID = 1L;
    public String name;
    public String owner;
    public List<String> useridlist;
    public String agentid;

    public ChatInfo(String name,String owner,List<String> useridlist,String agentId){
        this.name=name;
        this.owner=owner;
        this.useridlist=useridlist;
        this.agentid=agentId;

    }

}
