package blackberry.Chapter11Collection;

public class ChapterQ2 {
    /**
     *  1、Map存储数据的特点是什么？并指明key,value,entry存储数据的特点。
     *      Map存储的是双列数据（key-value）：
     *      key：无序的，不可重复的-----用set存储所有的key
     *      value：无序的、可重复的-----》Collection
     *      key-value：entry，无序的、不可重复的
     *
     *  2、描述HashMap的底层实现原理（JDK8）
     *      数组和链表的组合
     *
     *  3、Map中常用的实现类有哪些？各自有什么特点？
     *           以HashMap为例：
     *            添加、删除、修改操作：
     *            Object put(Object key, Object value)：将指定key-value添加到（或修改）当前map对象中
     *            void putAll(Map m)：将m中的所有key-value对存放到当前map中
     *            Object remove(Object key)：移除指定Key的Key-value对，并返回value
     *            void clear():清空当前map中的所有数据
     *
     *            元素查询的操作:
     *            Object get(Object key)：获取指定key对应的value
     *            boolean containsKey( Object key)：是否包含指定的key
     *            boolean containsValue(Object value)：是否包含指定的value值
     *            int siz() ：返回map中key-value对的个数
     *            boolean equals(Object obj)：判断当前map和参数对象obj是否相等
     *
     *            元视图操作的方法：
     *            Set keySet()：return a set view of the keys contained in this map
     *            Collection values()：return a view of the values contained in this map
     *            set entrySet()：return a set view of the mappings contained in this map
     *
     *  4、如何遍历Map中的key-value对，
     *              //  一、keySet方法获取当前map的或有key值
     * //        Set key = map.keySet();
     * //        Iterator iterator = key.iterator();
     * //        //  遍历所有的键值
     * //        while (iterator.hasNext()){
     * //            System.out.println(iterator.next());
     * //        }
     *
     *
     *
     *         //  二、遍历map中所有的 key-value 键值对,实体，返回值是Set类型
     *         Set entryKey = map.entrySet();
     *         Iterator iterator1 = entryKey.iterator();
     *
     *
     *         //  写法一、迭代器遍历
     * //        while (iterator1.hasNext()){
     * ////              entryKey集合里面每个元素都是entry
     * //            System.out.println(iterator1.next());
     * //        }
     *
     *         //  写法二、增强for循环
     * //        for (Object obj :
     * //                entryKey) {
     * //            System.out.println(obj);
     * //        }
     *
     *         //  写法三、使用entry的内部类
     *
     * //        while (iterator1.hasNext()){
     * //            Object obj = iterator1.next();
     * //            Map.Entry entry = (Map.Entry) obj;
     * //            //  调用内部类entry的get方法
     * //            System.out.println(entry.getKey()+"---->"+entry.getValue());
     * //        }
     *
     *  5、Collection和Collections的区别？
     *      Collection是创建集合的接口，Collections是工具类
     *      Collections是操作Collection和Map的工具类，Collection是存储单列数据的接口
     *
     *  6、HashMap底层典型属性的说明：
     *
     *  7、LinkedHashMap的底层实现原理
     *
     *  8、TreeMap的使用
     *      TreeMap相关的方法：向TreeMap中添加key-value,要求key必须是同一个类创建的对象
     *      因为要按照key进行排序：自然排序和定制排序
     *
     *  9、使用Properties读取配置文件
     *
     *
     *
     */
}
