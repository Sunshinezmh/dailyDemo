package oOM;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Class_NAME ConstantPoolOOMTest
 * @Auther 张明慧
 * @Date 2019/3/29 10:44
 */
public class ConstantPoolOOMTest {
    /**
     * VM Args:-XX:PermSize=10m -XX:MaxPermSize=10m
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i=1;
        try {
            while(true){
                list.add(UUID.randomUUID().toString().intern());
                i++;
            }
        } finally {
            System.out.println("运行次数："+i);
        }
    }


}
