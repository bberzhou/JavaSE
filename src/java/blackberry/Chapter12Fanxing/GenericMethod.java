package blackberry.Chapter12Fanxing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethod {
    /**
     *  泛型方法：
     *      Collection接口里面的   <T> T[] toArray(T[] a);这就是泛型方法
     *      泛型方法跟是不是在泛型类或泛型接口里面无关，只跟自己是否带有泛型有关
     *
     *   泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
     *              换句话说，泛型方法所属的类是不是泛型类都没有关系
     *            泛型方法，可以声明为静态的，泛型参数是在调用方法时确定的，并非在实例化类时确定的
     */

    public <E> List<E> copyArrayToList(E[] arr){
        //  将数组复制成为list
        ArrayList<E> list = new ArrayList<>();
        //  遍历数组添加到list里面
        for (E e :
                arr) {
            list.add(e);
        }
        return list;
    }

    public static void main(String[] args){
        GenericMethod genericMethod = new GenericMethod();
        Integer[] arr = new Integer[]{1,2,4,5};
        //  根据传入的形参是Integer，此时返回的泛型类型就是List<Integer>
        //  泛型方法在调用的时候，指明泛型参数的类型
        List<Integer> integers = genericMethod.copyArrayToList(arr);
        for (Integer i :
                integers) {
            System.out.println(i);
        }
    }
}
