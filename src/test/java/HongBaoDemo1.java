import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Class_NAME HongBaoDemo1
 * @Auther 侯旭日
 * @Date 2019/2/1 17:21
 */
public class HongBaoDemo1
{
    @Test
    public static HashMap<Integer, Double> randPackage(Double money, int num){

        HashMap<Integer,Double>map=new HashMap<>(num);
        money*=100;

        if (1==num){
            map.put(0,money);
            return map;
        }

        int i=0;
        while (num-1>0){
            Integer aa=(int) (Math.random()*(money-1)+1);
            Double random = Double.parseDouble(aa.toString());
            if (map.containsValue(random)){
                continue;
            }
            map.put(i,random);
            i++;
            num--;
        }
        return map;
    }
    public static void main(String[] args) {
//        HashMap<Integer,Integer>a=new HashMap<>();
        int num=8;
        double money=0.1;
        HashMap<Integer, Double> map = randPackage(money , num);
        HashMap<Integer, Double> m = (HashMap<Integer, Double>)map.clone();

        List<Integer> list=new ArrayList<>();
        //根据value排Key
        int k=0;
        while (!m.isEmpty()){
            if (!m.containsKey(k)){
                k++;
                continue;
            }
            Double max=m.get(k);
            Integer key=k;

            for (Integer kk:m.keySet()){
                if (max>=m.get(kk)){
                    max=m.get(kk);
                    key=kk;
                }
            }
            list.add(key);
            m.remove(key);
            k=0;
        }

        m.put(list.get(0),map.get(list.get(0))/100);
        m.put(num-1,(money*100-map.get(list.get(list.size()-1)))/100);
        for (int i=1;i<list.size();i++){
            int log=list.get(i);
            double aaa=map.get(log)-map.get(list.get(i-1));
            m.put(log,aaa/100);
        }

        for (Integer i:list){
            System.out.println(i+1+"："+map.get(i));
        }

        System.out.println("map内容是：-------");
        int i=0;
        Double mon=0.0;
        for (Integer key:m.keySet()){
            Double a=m.get(key);
            Double d=Double.parseDouble(a.toString());
            mon+=d;
            System.out.println("第"+(i+1)+"个人抽到红包金额为："+d.toString());
            i++;
        }

        System.out.println("总金额为："+mon);

    }
}
