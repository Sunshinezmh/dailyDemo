package oOM;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class_NAME OutOfMemoryError 堆溢出
 * @Auther 张明慧
 * @Date 2019/3/29 10:35
 */
public class OutOfMemoryError {

    /**
     * 堆溢出
     * @param args -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
     */
     public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        int i=0;
        while(true){
            list.add(new byte[5*1024*1024]);
            System.out.println("分配次数："+(++i));
        }
    }

}
