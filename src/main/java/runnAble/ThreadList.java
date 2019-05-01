package runnAble;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Class_NAME ThreadList
 * @Auther 张明慧
 * @Date 2019/3/28 16:06
 */
public class ThreadList {

    //public static void main(String[] args) throws InterruptedException {
    //    List<Integer> numberList =new ArrayList<Integer>();
    //    Thread t1=new Thread(new AddToList(0));
    //    Thread t2=new Thread(new AddToList(1));
    //    t1.start();
    //    t2.start();
    //    while(t1.isAlive() || t2.isAlive()){
    //        Thread.sleep(1);
    //    }
    //    System.out.println(numberList.size());
    //}


    public static List<Integer> numberList =new Vector<Integer>();
    public static void main(String[] args) throws InterruptedException {
        long begin=System.currentTimeMillis();
        int count=0;
        int startnum=0;
        while(count<10000000){
            numberList.add(startnum);
            startnum+=2;
            count++;
        }
        long end=System.currentTimeMillis();
        System.out.println(end-begin);
    }

}
