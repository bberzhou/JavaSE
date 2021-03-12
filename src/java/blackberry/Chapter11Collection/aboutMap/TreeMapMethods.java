package blackberry.Chapter11Collection.aboutMap;

import blackberry.Chapter11Collection.aboutSet.User;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethods {
    /**
     *  TreeMap相关的方法：向TreeMap中添加key-value,要求key必须是同一个类创建的对象
     *  因为要按照key进行排序：自然排序和定制排序
     *
     */

    @Test
    public void test(){
        //  自然排序
        TreeMap treeMap = new TreeMap();
        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",13);
        User u3 = new User("Jack",20);
        User u4 = new User("Kobe",24);
        treeMap.put(u1,98);
        treeMap.put(u2,78);
        treeMap.put(u3,76);
        treeMap.put(u4,97);
        Set entryKey = treeMap.entrySet();
        Iterator iterator = entryKey.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // User{name='Jack', age=20}=76
        //User{name='Jerry', age=13}=78
        //User{name='Kobe', age=24}=97
        //User{name='Tom', age=23}=98
        //  输出结果是按照name属性的从大到小进行排列的
    }

    //  定制排序
    @Test
    public void test1(){

        //  定制排序
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }
                throw new ClassCastException();
            }
        };

        TreeMap treeMap = new TreeMap(comparator);
        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",13);
        User u3 = new User("Jack",20);
        User u4 = new User("Kobe",24);
        treeMap.put(u1,98);
        treeMap.put(u2,78);
        treeMap.put(u3,76);
        treeMap.put(u4,97);
        Set set = treeMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //  这里按照key(对象)的age属性进行从小到大排序，这里不能对value进行排序
        //User{name='Jerry', age=13}=78
        //User{name='Jack', age=20}=76
        //User{name='Tom', age=23}=98
        //User{name='Kobe', age=24}=97
    }

}
