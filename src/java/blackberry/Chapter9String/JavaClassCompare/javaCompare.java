package blackberry.Chapter9String.JavaClassCompare;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/25/20 19:29
 * Create By IntelliJ IDEA
 */
public class javaCompare {
    /**
     *  java比较器
     *  一：Java对象之间的比较，Java实现对象排序的方式有两种,这两个都是接口
     *      正常情况下，只能进行比较：==或者 != 不能使用 > < 如何进行对象的大小比较？
     *      自然排序：java.lang.Comparable
     *      定制排序：java.util.Comparator
     *
     *  二：Comparable接口与Comparator的使用的对比：
     *      Comparable接口的方式一旦一定，保证Comparable接口实现类的对象在任何位置都可以比较大小
     *      Comparable接口属于临时性的比较
     *
     *
     */


    /**
     *   Comparable接口的使用举例：自然排序
     *   1。像String、包装类等实现了Comparable接口，重写了compareTo()方法，给出了比较两个对象大小的方法
     *   2。像String、包装类重写compareTo方法以后，进行了从小到大的排列
     *      实现了Comparable接口的对象列表（和数组），可以通过Collections.sort或者Arrays.sort()进行自动排序
     *   3。重写compareTo(Object obj)方法的规则：
     *      如果当前对象this大于形参对象obj,则返回正整数，
     *      如果当前对象this小于形参对象obj,则返回负整数，
     *      如果当前对象this等于形参对象obj,则返回零
     *   4。对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，
     *      重写CompareTo方法，在compareTo(obj)方法中指明如何排序。-------->自然排序
     *
      */


    @Test
    public void test(){
        //  String 里面实现Comparable()接口，重写compareTo()方法,就可以使用sort()
        String[] arr = new String[]{"AA","BB","MM","GG"};
        //  Arrays.sort(Object[] a) :Object类型的对象数组，因为String类型的数组，相当于Object的子类，有一个多态
        Arrays.sort (arr);  //  排序，默认是从小到大排序
        //  因为String类实现Comparable（）接口，重写了compareTo()方法，比较两个字符串的大小
        System.out.println (Arrays.toString (arr)); //  [AA, BB, GG, MM] 排序成功
    }


    //  自定义类实现Comparable()接口----->自然排序

    @Test
    public void test1(){
        //  比较Goods对象:指明商品比较大小的方式：按照价格从低到高,如果价格一样，在按照产品名称从低到高排序
        //  这个类实现了Comparable()接口，并且重写了compareTo()方法
        Goods[] goods = new Goods[5];
        goods[0] = new Goods ("lenovo",34);
        goods[1] = new Goods ("dell",50);
        goods[2] = new Goods ("Apple",70);
        goods[3] = new Goods ("xiaomi",84);
        goods[4] = new Goods ("mi",84);
        //  在Goods类里面已经重写了方法
        Arrays.sort (goods);    //  告诉sort传入的goods数组排序方式按照Goods类里面的来
        System.out.println (Arrays.toString (goods));
        //  输出结果[Goods{name='lenovo', price=34}, Goods{name='dell', price=50}, Goods{name='Apple', price=70}, Goods{name='mi', price=84}, Goods{name='xiaomi', price=84}]
        //  goods[3] 和goods[4]的价格相同，但是 name 4 大于3 所以Goods{name='mi', price=84}在前面
        //  使用name 从高到低时，输出为，[Goods{name='lenovo', price=34}, Goods{name='dell', price=50}, Goods{name='Apple', price=70}, Goods{name='xiaomi', price=84}, Goods{name='mi', price=84}]

    }




    //  定制排序---------Comparator   直接new一个匿名对象
    @Test
    public void test3(){
        /**
         *  Comparator接口的使用：定制排序
         *  1。背景：
         *      当元素的类型没有实现java.lang.Comparable接口而又不方便修改代码
         *      或者实现了java.lang.Comparable接口的排序规则不适合当前操作；
         *      那么就可以考虑使用comparator的对象来排序
         *  2。重写compare(Object 01,Object 02)方法，比较o1和o2的大小
         *      如果返回正整数，则表示o1大于o2;
         *      如果返回0，表示相等；
         *      如果返回负整数，表示o1小于o2；
         *
         */

        String[] arr = new String[]{"AA","BB","MM","GG"};
        //  <String>泛型，按照字符串从大到小的顺序排列
        Arrays.sort (arr, new Comparator<String> () {
            @Override
            public int compare (String o1, String o2) {
//                return o1.compareTo (o2); 这是从小到大

                //  compareTo()默认是从小到大,所以需要加个-
                return -o1.compareTo (o2);
            }
        });

        System.out.println(Arrays.toString (arr));      //  [MM, GG, BB, AA]
    }


    @Test
    public void test4(){
        //  比较Goods对象,指明商品比较大小的方式：按照产品名称从低到高排序,再按照价格名称从高到低排序
        Goods[] goods = new Goods[5];
        goods[0] = new Goods ("lenovo",34);
        goods[1] = new Goods ("dell",50);
        goods[2] = new Goods ("Apple",70);
        goods[3] = new Goods ("xiaomi",84);
        goods[4] = new Goods ("xiaomi",74);

        //  采用从大到小的排序,这里重写Comparator方法时，会有范型，但是这里还没有讲，还是先比较类
//        Arrays.sort (goods, new Comparator<Goods> () {
//            @Override
//            public int compare (Goods o1, Goods o2) {
//                return 0;
//            }
//        });

        Arrays.sort (goods, new Comparator () {
            //  指明商品比较大小的方式：按照产品名称从低到高排序，再按照价格从高到低排序
            @Override
            public int compare (Object o1, Object o2) {
                //  先检查对象
                if (o1 instanceof Goods && o2 instanceof Goods){
                    //  做一个强转
                    Goods g1 = (Goods) o1;
                    Goods g2 = (Goods) o2;
                    if (g1.getName ().equals (g2.getName ())){
                        return -Double.compare (g1.getPrice (),g2.getPrice ());
                        /**
                         *  Double类里面的compare()方法，因为要从高到低排序，所以需要再前面加个负号
                         *  if (d1 < d2)
                         *      return -1;           // Neither val is NaN, thisVal is smaller
                         *   if (d1 > d2)
                         *      return 1;            // Neither val is NaN, thisVal is larger
                         */

                    }else {
                        //  如果名称不同，就直接比较name，默认名称就是从低到高排序
                        return g1.getName ().compareTo (g2.getName ());
                    }

                }
                throw new RuntimeException ("输入数据有错误！");
            }
        });
        System.out.println(Arrays.toString (goods));
    }










}
