package blackberry.Chapter12Fanxing.Exercise1;

import java.util.*;

public class DAO <T>{
    /**
     *  练习题：
     *      定义一个泛型类DAO<T>，在其中定义一个Map成员变量，Map得键为String类型，值为T类型。
     *      分别创建以下方法：
     *      public void save(String id, T entity)：保存T类型的对象到Map成员变量中
     *      public T get(String id)：从map中获取id对应的对象
     *      public void update(String id, T entity)：替换map中key为id的内容，改为entity对象
     *      public List<T> list()：返回map中存放的所有T对象
     *      public void delete(String id)：删除指定id的对象
     */
//    定义一个Map成员变量，Map得键为String类型，值为T类型。
            //  如果这里不加new HashMap<>()，就会报空指针异常的错误
    public Map<String ,T > map = new HashMap<>();
//    保存T类型的对象到Map成员变量中
    public void save(String id, T entity){
        map.put(id,entity);

    };
    //  从map中获取id对应的对象
    public T get(String id){
        return map.get(id);
    };
    //  替换map中key为id的内容，改为entity对象
    public void update(String id, T entity){
//        map.put(id,entity);
        //这里修改的时候要注意，如果原来map里面没有该id，就需要先判断，如果此id有则替换，如果没有就不添加
        if (map.containsKey(id)){
            //  有的话再修改
            map.put(id,entity);
        }
    }
    //  返回map中存放的所有T对象
    public Collection<T> list(){
        //  错误的写法
//        Collection<T> values = map.values();
//        return (List<T>)values;//   强转

        //  返回所有的value值
//        Set<Map.Entry<String, T>> entries = map.entrySet();
//        List list = new ArrayList<>();
//        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String, T> next = iterator.next();
//            list.add(next.getValue());
//        }
//        return  list;

        //  首先取出每个value值，然后添加到list中，最后返回
        Collection<T> values = map.values();
        List<T> list = new ArrayList<>();
        for (T t :
                values) {
            list.add(t);
        }
        return list;
    }
    //  删除指定id的对象
    public void delete(String id){
        //  判断是否存在该id，存在再删除
        if (map.containsKey(id)){
            map.remove(id);
        }
    }
}
