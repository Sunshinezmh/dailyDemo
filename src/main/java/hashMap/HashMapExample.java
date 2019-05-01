package hashMap;

/**
 * @Class_NAME HashMapExample
 * @Auther 张明慧
 * @Date 2019/3/19 21:34
 */
public class HashMapExample {
    static HashMap map=new HashMap();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    map.put(String.valueOf(i),String.valueOf(i));
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1000; i <2000 ; i++) {
                    map.put(String.valueOf(i),String.valueOf(i));
                }
            }
        }).start();

        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <2000 ; i++) {
            System.out.println(map.get(String.valueOf(i)));
        }
    }
}
