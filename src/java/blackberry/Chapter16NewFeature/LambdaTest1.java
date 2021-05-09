package blackberry.Chapter16NewFeature;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 5/9/21 9:08 AM
 * Create By IntelliJ IDEA
 */
public class LambdaTest1 {
    /*
        Lambda表达式的使用
            1.举例：(o1,o2) -> Integer.compare(o1,o2);
            2.格式：
                -> :Lambda操作符 或 箭头操作符
                ->左边：Lambda表达式的形参列表，（其实就是接口中的抽象方法的形参列表
                ->右边：Lambda体，其实就是重写的抽象方法的方法体

            3. Lambda表达式的使用：分为6种情况
                语法格式一：无参数，无返回值的情况
                   Runnable r1 = () -> {System.out.println("hello,world");};
                语法格式二：Lambda需要一个参数，但是没有返回值
                    Consumer<String> con = (String str) ->(System.out.println(str););
                语法格式三：数据类型可以省略，因为可以由编译器推断得出，称为"类型推断"
                    Consumer<String> con = (str) ->(System.out.println(str););
                语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
                     Consumer<String> con = str -> (System.out.println(str));
                语法格式五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
                    Comparator<Integer> con = (x,y)->{System.out.println("实现函数式接口方法！")}；
                    return Integer.compare(x,y);};
                语法格式六：当Lambda体只有一条语句时，return与大括号若有，都可以省略
                    Comparator<Integer> com = (x,y) -> Integer.compare(x,y);


            4.Lambda表达式的本质：作为接口的一个实例（即对象），同时接口还有一个特点只有一个抽象方法，
                                    函数式接口

            5.总结：
                ->左边：Lambda形参列表的参数类型可以省略（类型推断），如果lambda形参列表只有一个参数
                        其一对()也可以省略
                ->右边：lambda体应该使用一对{}包裹，如果lambda体只有一条执行语句（可能是return语句）；
                        就可以省略外层的{}和return关键字。


     */
    @Test
    public void test1(){
        //    语法格式一：无参数，无返回值的情况
        //    Runnable r1 = () -> {System.out.println("hello,world");};
        Runnable runnable = () -> {System.out.println ("hello Lambda");};
        runnable.run ();
    }
    @Test
    public void test2(){
        //  语法格式二：Lambda需要一个参数，但是没有返回值
        //  Consumer<String> con = (String str) ->(System.out.println(str););
        Consumer<String> con1 = new Consumer<String> () {
            @Override
            public void accept (String s) {
                System.out.println (s);
            }
        };
        con1.accept ("Lambda测试2");

        //
        System.out.println ("*******************");
        Consumer<String> con2 = (String s) -> System.out.println (s);
        con2.accept ("Lambda表达式，带参数的情况");

        //  这里还可以更简洁，方法引用
        System.out.println ("*******************");
        Consumer<String> con3 = System.out::println;
        con3.accept ("Lambda表达式，带参数的情况");
    }
    @Test
    public void test3(){
        //  语法格式三：数据类型可以省略，因为可以由编译器推断得出，称为"类型推断"
        //  Consumer<String> con = (str) ->(System.out.println(str););
        System.out.println ("*******************");
        //  这因为签名Consumer的泛型里面写了String，后面就可以省略掉
        Consumer<String> con2 = ( s) -> System.out.println (s);
        con2.accept ("Lambda表达式，带参数的情况");

        //  类型推断的例子
        ArrayList<String > arrayList = new ArrayList<> ();  //  前面指定为String之后，后面就可以不用写

        int[] arr = {1,2,3,4};
        int[] arr1 = new int[]{1,2,3,4};    //  这两个等效的
    }
    @Test
    public void test4(){
        //  语法格式四：Lambda若只需要一个参数时，参数的小括号可以省略
        //  Consumer<String> con = str -> (System.out.println(str));
        Consumer<String> con1 = s -> System.out.println (s);
        con1.accept ("一个参数时，省略小括号");
    }
    @Test
    public void test5(){
        //  语法格式五：Lambda需要两个或以上的参数，多条执行语句，并且可以有返回值
        //  Comparator<Integer> con = (x,y)->{System.out.println("实现函数式接口方法！")}；
        //  return Integer.compare(x,y);};
        Comparator<Integer> comparator1 = (x,y) ->{
            System.out.println ("多个参数，多条执行语句");
            return Integer.compare (x,y);
        };
        int compare = comparator1.compare (19, 2);
        System.out.println (compare);

    }
    @Test
    public void test6(){
        //语法格式六：当Lambda体只有一条语句时，return与大括号若有，都可以省略
        //Comparator<Integer> com = (x,y) -> Integer.compare(x,y);

        //  开始有return 和大括号的情况。
//        Comparator<Integer> com1 = (x,y) ->{
//            return Integer.compare (x,y);
//        };

        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        int compare = com.compare (12, 13);
        System.out.println (compare);
    }
}
