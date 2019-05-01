package canReliveObj;

import org.junit.Test;

import java.util.HashMap;

/**
 * @Class_NAME PrintThread
 * @Auther 张明慧
 * @Date 2019/3/27 14:49
 */
public class PrintThread extends Thread{
        public static final long starttime=System.currentTimeMillis();
        @Override
        @Test
        public void run(){
            try{
                while(true){
                    long t=System.currentTimeMillis()-starttime;
                    System.out.println("time:"+t);
                    Thread.sleep(100);
                }
            }catch(Exception e){

            }
        }

    HashMap<Long,byte[]> map=new HashMap<Long,byte[]>();

        @Test
    public void run1(){
        try{
            while(true){
                if(map.size()*512/1024/1024>=450){
                    System.out.println("=====准备清理=====:"+map.size());
                    map.clear();
                }

                for(int i=0;i<1024;i++){
                    map.put(System.nanoTime(), new byte[512]);
                }
                Thread.sleep(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
