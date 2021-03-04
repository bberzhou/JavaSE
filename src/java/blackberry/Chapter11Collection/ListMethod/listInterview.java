package blackberry.Chapter11Collection.ListMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class listInterview {
    /**
     *  关于list的面试题:
     *
     */
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);   //  [1, 2], 注意这里的updateList()方法里面是remove (int index)
    }
    public static void updateList(List list){
//        list.remove(2);   //按照索引删除的是 index =2
        list.remove(new Integer(2));    //  这样就是删除的值为2的元素   //[1, 3]
    }
}
