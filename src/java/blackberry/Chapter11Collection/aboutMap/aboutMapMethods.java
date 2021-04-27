package blackberry.Chapter11Collection.aboutMap;

import org.junit.Test;

import java.util.*;

public class aboutMapMethods {
    /**
     *  Map中定义的方法：
     *      以HashMap为例：
     *      添加、删除、修改操作：
     *      Object put(Object key, Object value)：将指定key-value添加到（或修改）当前map对象中
     *      void putAll(Map m)：将m中的所有key-value对存放到当前map中
     *      Object remove(Object key)：移除指定Key的Key-value对，并返回value
     *      void clear():清空当前map中的所有数据
     *
     *      元素查询的操作:
     *      Object get(Object key)：获取指定key对应的value
     *      boolean containsKey( Object key)：是否包含指定的key
     *      boolean containsValue(Object value)：是否包含指定的value值
     *      int siz() ：返回map中key-value对的个数
     *      boolean equals(Object obj)：判断当前map和参数对象obj是否相等
     *
     *      元视图操作的方法：
     *      Set keySet()：return a set view of the keys contained in this map
     *      Collection values()：return a view of the values contained in this map
     *      set entrySet()：return a set view of the mappings contained in this map
     *
     */
    @Test
    public void test1(){
        /**
         *          添加、删除、修改操作：
         *           Object put(Object key, Object value)：将指定key-value添加到（或修改）当前map对象中
         *           void putAll(Map m)：将m中的所有key-value对存放到当前map中
         *           Object remove(Object key)：移除指定Key的Key-value对，并返回value
         *           void clear():清空当前map中的所有数据
         */
        Map map = new HashMap();
        map.put("AA",456);
        map.put("BB",7899);
        map.put("CC",88);
        map.put(45,889);

//        map.put("AA",7878);   当添加相同key的元素时，就会把前一个相同key的value值替换掉。
        System.out.println(map);
        //  {AA=456, BB=7899, CC=88, 45=889}


        //  void putAll(Map m)：将m中的所有key-value对存放到当前map中
        Map map1 = new HashMap();
        map1.put("CCC",456);
        map1.put("AA",48);
        map.putAll(map1);
        System.out.println(map);
        //  添加一个map，{AA=48, BB=7899, CC=88, CCC=456, 45=889}


        //  Object remove(Object key)：移除指定Key的Key-value对，并返回value

        Object obj = map.remove("CCC");
        System.out.println(obj);    //  返回指定删除key的value值，456
        System.out.println(map);    //  删除之后的map；里面的元素 {AA=48, BB=7899, CC=88, 45=889}


        //  void clear():清空当前map中的所有数据
        map.clear();    //  注意这个与map = null不同，
        System.out.println(map);
        System.out.println(map.size());
        //  清除之后，就为空，size也为0
        //  {}
        //  0





    }
    @Test
    public void test2(){
        /**
         *   Object get(Object key)：获取指定key对应的value
         *   boolean containsKey( Object key)：是否包含指定的key
         *     boolean containsValue(Object value)：是否包含指定的value值
         */
        Map map = new HashMap();
        map.put("AA",456);
        map.put("BB",7899);
        map.put("CC",88);
        map.put(45,889);
        //  Object get(Object key)：获取指定key对应的value
        System.out.println(map.get(45));    //  889

        //  boolean containsKey( Object key)：是否包含指定的key
        boolean b = map.containsKey(45);
        System.out.println(b);      //  true
        boolean isExit = map.containsValue(456);
        System.out.println(isExit);
//        map.clear();;
//        System.out.println(map.isEmpty());  //  true

        //  测试equals()方法
        Map map1 = new HashMap();
        map1.put("AA",456);
        map1.put("BB",7899);
        map1.put("CC",88);
        map1.put(45,889);
        System.out.println(map.equals(map1));   //  true


    }

    //  Map元素的遍历操作
    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA",456);
        map.put("BB",7899);
        map.put("CC",88);
        map.put(45,889);
        //  一、keySet方法获取当前map的或有key值
//        Set key = map.keySet();
//        Iterator iterator = key.iterator();
//        //  遍历所有的键值
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }



        //  二、遍历map中所有的 key-value 键值对,实体，返回值是Set类型
        Set entryKey = map.entrySet();
        Iterator iterator1 = entryKey.iterator();


        //  写法一、迭代器遍历
//        while (iterator1.hasNext()){
////              entryKey集合里面每个元素都是entry
//            System.out.println(iterator1.next());
//        }

        //  写法二、增强for循环
//        for (Object obj :
//                entryKey) {
//            System.out.println(obj);
//        }

        //  写法三、使用entry的内部类

//        while (iterator1.hasNext()){
//            Object obj = iterator1.next();
//            Map.Entry entry = (Map.Entry) obj;
//            //  调用内部类entry的get方法
//            System.out.println(entry.getKey()+"---->"+entry.getValue());
//        }


        //  写法四、通过方法一已经获得key来获取对应的value进行拼凑
        Set set = map.keySet();
        Iterator iterator = set.iterator();
       while (iterator.hasNext()){
           //   利用一、里面获取的key集合，来获取对应的value值
           Object obj = iterator.next();
           //   使用get方法获取对象的value值
           Object value = map.get(obj);

           //   拼接成相应的key-value键值对
           System.out.println(obj+"------->"+value);
       }









        //  三、遍历map中所有的value值，map.values()方法返回值是Collection
        Collection col = map.values();
        Iterator iterator2 = col.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
