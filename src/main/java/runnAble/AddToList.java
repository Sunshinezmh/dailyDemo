package runnAble;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Class_NAME AddToList
 * @Auther 张明慧
 * @Date 2019/3/28 14:32
 */
public class AddToList implements Runnable{

    public  List<Integer> numberList =new ArrayList<Integer>();

    int startnum=0;
    public AddToList(int i){}

    //public AddToList(int startnumber){
    //    startnum=startnumber;
    //}
    @Test
    @Override
    public void run() {
        int count=0;
        while(count<1000000){
            numberList.add(startnum);
            startnum+=2;
            count++;
        }
    }

}
