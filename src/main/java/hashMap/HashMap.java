package hashMap;

/**
 * @Class_NAME HashMap
 * @Auther 张明慧
 * @Date 2019/3/19 17:12
 */
public class HashMap<K,V> implements Map<K,V> {

    private Entry<K,V>[] table=null;
    private static int defaultLength=16;   //默认数组的容量
    private static double defaultLoader=0.75d;  //需要扩容的加载因子
    int size=0;

    public HashMap(){
        this(defaultLength,defaultLoader);
    }

    public HashMap(int length,double loader){
        defaultLength=length;
        defaultLoader=loader;
        table=new Entry[defaultLength];
    }

    @Override
    public V put(K k, V v) {
        int index=hash(k);
        Entry<K, V> entry=table[index];
        if (entry == null) {
            table[index]=addEntry(index,k,v,null);
            size++;
        }else{
            table[index]=addEntry(index,k,v,entry);
        }
        return table[index].getValue();
    }

    private Entry addEntry(int hash,K k,V v,Entry next){
        //return new Entry<>(k,v,next,hash);
        return next;
    }

    public int hash(K k){
        int i = k.hashCode()%(defaultLength-1);
        return Math.abs(i);
    }

    @Override
    public V get(K k) {
        Entry<K,V> entry=getEntry(k);
        //return entry==null?entry.getValue();

        return null;
    }

    private Entry<K,V> getEntry(K key){
        if (size==0){
            return null;
        }
        int index=hash(key);
        for (Entry e=table[index];e!=null;e=e.next){
            if(e.hash==index && (key)==e.getKey() || key.equals(e.getKey())){
                return e;
            }
        }
        return null;
    }


    @Override
    public int size() {
        return size;
    }
    class Entry<K,V> implements Map.Entry{
        K k;
        V v;
        Entry<K,V> next;
        int hash;

        public Entry(K k, V v, Entry<K, V> next, int hash) {
            this.k = k;
            this.v = v;
            this.next = next;
            this.hash = hash;
        }

        @Override
        public K getKey() {
            return k;
        }

        @Override
        public V getValue() {
            return v;
        }
    }
}
