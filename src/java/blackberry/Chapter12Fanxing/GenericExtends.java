package blackberry.Chapter12Fanxing;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericExtends {
    /**
     *  1、泛型在继承方面的体现：
     *      类A是类B的父类：G<A> 和G<B>二者不具备子父类关系，二者是并列关系
     *      补充：类A是类B的父类，A<G>和B<G>二者具备有子父类关系，A<G>是B<G>的父类
     *
     *  2、通配符的使用
     *      通配符：？
     *      有限制的通配符：
     *          通配符指定上限
     *              上限extends：使用时指定的类型必须时继承某个类，或者实现某个接口，即<=
     *
     *          通配符指定下限
     *              下限super: 使用时指定的类型不能小于操作的类，即>=
     *      举例：
     *          <? extends Number>（无穷小，NUmber）
     *          只允许泛型为Number以及Number子类的引用调用
     *          <?super Number> （Number，无穷大）
     *          只允许泛型为Number以及Number父类的引用调用
     *          <? extends Comparable>
     *          只运行泛型为实现Comparable接口的实现类的引用调用
     *
     *    3、有条件的通配符使用
     *
     */

    @Test
    public void test1(){

        Object obj = null;
        String str = null;
        //  由于继承的关系，就可以把str赋值给obj
        obj = str;

        Object[] ar = null;
        String[] arr = null;
        //  由于继承的关系，所以对于数组而言也是可以的
        ar = arr;

        List<Object> list = null;
        List<String> list1 = null;
        //这里就会报错，因为list1是String类型的，而list泛型是Object类型的，类型不一致
        //  编译不通过
//        list = list1;
        //  此时的list和list1的类型不具备子父类关系

        /**
         *  反证法:
         *      假设能够赋值那么：list = list1
         *                  list.add(123)；  就会导致混入非String类型的元素，出错
         *
         */


        List<String> list2 = null;
        ArrayList<String > list3 = null;
        //  这种写法就可以编译通过，因为这两个类的泛型类型一致，并且ArrayList是List的子类
        list2 = list3;
    }


    //-------------------------------------------------------------------------

    /**
     *  通配符的使用, 通配符：？
     *      类A是类B 的父类，G<A>和G<B>是没有关系的，二者共同的父类是G <?>
     */
    @Test
    public void test2(){
        //  通配符的使用, 通配符：？
        List<Object> list1 = null;
        List<String > list2 = null;
        //  此时List<?>就相当于变成了上面两个的通用父类
        List<?> list = null;
        list = list1;
        list = list2;
        //  这里就可以调用print()方法进行遍历，在遍历的时候，会根据list里面的具体类型进行相应的转换
        print(list);
        print(list);
    }
    public void print(List<?> list){
        //  遍历List
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            //  不管List里面的具体类型是什么，都是Object的子类，所以方便各种类型元素的遍历
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }

    /**
     *  使用通配符之后的数据操作
     */
    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;
        List<?> list = null;
        list = list1;
        list = list2;

        //  创建一个String类型的List3
        List<String> list3 = new ArrayList<>();
        //  添加字符元素
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");

        //  将list3赋值给list
        list = list3;
        //  Flow capture of ? E
        // 添加（写入）： 使用占位符，对于List<？>就不能向其内部添加数据了
        //  除了 NULL，
//        list.add(?);
        //  之所以能添加null，是因为所有的类类型都可以赋值为null
        list.add(null);

        // 获取（读取）：允许读取数据，读取的数据类型为Object
        Object o = list.get(0);
        System.out.println(o);  //  输出结果：AA

    }

    //-------------------------------------------------------------------

    // 3、有限制条件的通配符的使用

    /**
     *  ？ extends Person,可以把extends看成是小于等于，那么？就表示是Person类或者它的子类
     *
     *  ? super Person，可以把super看成是大于等于，那么？就表示Person类的父类或者Person类
     *
     *      ? extends A: G<? extends A>，可以作为G<A>和G<B>的父类，其中B是A的子类
     *      ？ super A ：G<? super A>，可以作为G<A>和G<B>的父类，其中B是A的父类
     *
     *  ？就可以理解为一个无穷
     */

    @Test
    public void test(){
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;

        List<Student> list3 = new ArrayList<>();
        List<Person> list4 = new ArrayList<>();
        List<Object> list5 = new ArrayList<>();

        //  分别赋值给list1
        list1 = list3;
        list1 = list4;
        //  因为list5是Object类型的，范围超出Person类了，所以报错
//        list1 = list5;

        //同理？表示是大于等于Person类的，所以list2泛型Student是Person的子类所以，报错
//        list2 = list3;
        list2 = list4;
        list2 = list5;

        //  读取数据：
        list1 = list3;
        //  这里最小也是Person类型的，因为list1是 <=Person，不会超过person的，所以可以写成Person，当然也可以写成Object
        Person person = list1.get(0);
//        Student student = list1.get(0);   这里就不能写成Student，至少也得是Person

        //  list2 是 >=Person，所以list2.get()返回的类型至少得是Object类型才能包含到，因为返回类型是大于等于Person得
        list2 = list4;
        //  编译不通过
//        Person o = list2.get(0);

        //  编译不通过
//        list1.add(new Student());

        //  Person和person 得子类是可以往里面放的
        list2.add(new Person());
        list2.add(new Student());

    }


}
