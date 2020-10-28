package blackberry.day10.InnerClassTest1;

/**
 * @Description: 内部类练习
 * @author: bberzhou@gmail.com
 * @date: 6/25/20 18:24
 * Create By IntelliJ IDEA
 */
public class InnerClassTest1 {


    //  返回一个实现了Comparable接口的类的对象
    public Comparable getComparable () {
//        //  方式一：创建一个实现Comparable接口的类：局部内部类
//        class MyComparable implements Comparable{
//            @Override
//            public int compareTo (Object o) {
//                return 0;
//            }
//        }
//        //  返回一个对象
//        return new MyComparable ();
//    }

        //  方式二：匿名实现类的匿名对象
        return new Comparable () {
            @Override
            public int compareTo (Object o) {
                return 0;
            }
        };
    }
}
