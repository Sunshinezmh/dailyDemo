package encryptPassword; /**
 * @Class_NAME password
 * @Auther 张明慧
 * @Date 2019/3/15 10:56
 */

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource.Util;
import org.junit.Test;


public class password {

    @Test
    public void encryptPassword() {
        String userCode="77777777777";
        String password="6";
        String pass= (new SimpleHash("sha-512", password, Util.bytes(userCode), 1024)).toHex();
        System.out.println(pass);
    }
}
