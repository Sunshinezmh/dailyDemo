package oOM;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @Class_NAME DirectMemoryOOMTest
 * @Auther 张明慧
 * @Date 2019/3/29 10:50
 */
public class DirectMemoryOOMTest {
    /**
     * VM Args:-Xms20m -Xmx20m -XX：MaxDirectMemorySize=10m
     * @param args
     */
    public static void main(String[] args) {
        int i=0;
        try {
            Field field = Unsafe.class.getDeclaredFields()[0];
            field.setAccessible(true);
            Unsafe unsafe = (Unsafe) field.get(null);
            while(true){
                unsafe.allocateMemory(1024*1024);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("分配次数："+i);
        }
    }
}
