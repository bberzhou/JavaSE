package blackberry.Chapter11Collection.CollectionMethod;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForeachTest {
    /**
     *  JDK5.0新增的的foreach循环，用于遍历集合、数组
     */
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);  //  自动装箱成Integer
        coll.add(456);
        coll.add(new java.lang.String("Tom"));

        coll.add(false);    //会自动装箱为 Boolean类型的值
        //  使用foreach来遍历，for(集合中元素的类型 局部变量 ：集合对象)
        for (Object o :
                coll) {
            System.out.println(o);

        }
        //  数组也可以使用foreach进行遍历，for(数组中元素的类型 局部变量 ：数组对象)
//        int[] arr = new int[]{4,4,5,76,4546,7,7,45};
//        for (int o :
//                arr) {
//            System.out.println(o);
//        }
    }
    @Test
    public void test2(){
        String[] str = new String[]{"MM","DD","KK"};
        //  方式一：普通for循环赋值
        for (int i = 0; i < str.length; i++) {
            str[i] = "GG";
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
//GG
//GG
//GG


        //  方式二：增强for循环，foreach循环
//        for (String s:
//             str) {
//            s = "GGG";
//
//        }
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
    }
    //  是哟个foreach遍历时候，再赋值的话，赋值给得是局部变量s，不会影响原来得数组
//    MM
//DD
//KK
}
