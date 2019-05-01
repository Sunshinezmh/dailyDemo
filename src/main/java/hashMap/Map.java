package hashMap;

/**
 * @Class_NAME HashMap
 * @Auther 张明慧
 * @Date 2019/3/19 17:10
 */
public interface Map<K,V> {
    public V put(K k,V v);
    public V get(K k);
    public int size();

    interface Entry<K,V>{
        public K getKey();
        public V getValue();
    }

}
