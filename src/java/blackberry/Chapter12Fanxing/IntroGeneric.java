package blackberry.Chapter12Fanxing;

import org.junit.Test;

import java.util.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/2/20 20:57
 * Create By IntelliJ IDEA
 */
public class IntroGeneric {
    /**
     *  泛型：
     *  1、为什么要有泛型？
     *      类似标签<>
     *      集合容器类在设计阶段、声明阶段不能确定这个容器到底实际存的是什么类型的对象
     *      在JDK5.0之前只能把元素设计欸Object类型的，JDK5.0之后就用泛型来解决这个问题
     *
     *      所谓泛型就是允许定义类、接口时通过一个标识表示类中某个属性的类型或某个方法
     *      的返回值以及参数类型。这个类型参数将在使用时（例如：继承或实现这个接口，用这个类型声明变量、创建对象的时候）确定
     *      （即传入实际的参数类型，也称为类型实参）
     *
     *      与直接使用Object相比有什么优点
     *          1、解决元素存储的安全性问题，有了标签不容易出错
     *          2、解决获取数据元素时，需要类型强制转换的问题，
     *
     *
     *  2、在集合中使用泛型。
     *      总结：①集合接口或集合类在JDK5.0时都修改为带泛型的结构
     *           ②在实例化集合类的时候，可以指明具体的泛型类型
     *           ③指明完以后，在集合类或接口中凡是定义类或接口时，内部结构（比如：方法、构造器、属性等）使用到类的泛型的位置，都指定为实例化的泛型类型
     *              比如：add(Object e)---->实例化以后：add(Integer i)
     *           ④注意点：泛型的类型必须是一个类，不能是基本数据类型，需要用到基本数据类型的地方，都要拿包装类替换掉
     *           ⑤ArrayList arrayList = new ArrayList();这样使用在IDEA中没有报错，在实例化的时候没有指明
     *              泛型，默认类型就是java.lang.Object类型的
     *           ⑥JDK7开始有一个新的特性：ArrayList<Integer> arrayList = new ArrayList<Integer>()
     *              类型推断，可以简写成为：ArrayList<Integer> arrayList = new ArrayList<>()
     *
     *  3、如何自定义泛型结构
     *      泛型类；
     *      泛型接口
     *      泛型方法
     *      参见：GenericClassTest
     *
     *      注意点：1、泛型类可能有多个参数，此时应将多个参数一起放在尖括号内，比如<E1,E2,E3>
     *             2、泛型类的构造器如下所示：public GenericClass(){};
     *                                  public GenericClass<T>(){};,这种方式是错误的，构造器不带泛型
     *             3、实例化之后，操作原来泛型位置的结构必须与指定的泛型类型一致
     *             4、泛型不同的引用不能相互赋值，举例：ArrayList<String> list1 = null;
     *                                            ArrayList<String> list2 = null; 不能把list1赋值给list2
     *             5、泛型如果不指定，将会被擦除，泛型对应的类型均按照Object处理，但是不等价于Object。
     *                  经验：泛型要使用就一直都使用，如果不使用就一直不使用。
     *             6、如果泛型是一个接口或抽象类，则不创建泛型类的对象
     *             7、JDK1.7，泛型的简化操作：ArrayList<> list = new Arraylist<>();
     *             8、泛型的指定不能使用基本数据类型，可以使用包装类替换。
     *             9、在类或者接口上声明的泛型，在本类或本接口中即代表某种类型，可以作为非静态属性的类型
     *                  非静态方法的参数类型、非静态方法的返回值类型。但在静态方法中不能使用类的泛型。
     *             10、异常类不能是泛型，
     *             11、父类有泛型，子类可以选择保留泛型也可以选择指定的泛型类型：
     *                  ①：子类不保留父类的泛型：按需实现
     *                      -->没有类型 擦除
     *                      -->具体类型
     *                  ②：子类保留父类的泛型：泛型子类
     *                      -->全部保留
     *                      -->部分保留
     *                  子类除了指定或保留父类的泛型，还可以增加自己的泛型
     *                  举例：
     *                  Class father<T1, T2>{}
     *                  子类不保留父类的类型
     *                  1）没有类型 擦除
     *                    class son1 extends father{} 等价于 class son1 extends father<Object, Object>
     *                  2)具体类型
     *                    class son2 extends father<String, Integer>{}
     *                  子类保留父类的类型
     *                  1)全部保留
     *                    class son3<T1,T2> extends father<T1,T2>
     *                  2)部分保留
     *                    class son4<T2> extends father<T1,T2>
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *  4、泛型在继承上的使用
     *
     *  5、通配符的使用
     */

    @Test
    public void test(){
        //  在集合中使用泛型的之前情况
        ArrayList arrayList = new ArrayList();
        //  需求：存放学生的成绩
        arrayList.add("78");
        arrayList.add("88");
        arrayList.add("89");
        arrayList.add("75");
        arrayList.add("99");
        arrayList.add("98");
        //  问题一：但是由于add()方法没有做任何限制，形参是Object类型的，
        //  所以即使添加错误类型的参数，也不会报错。-------》类型不安全
        arrayList.add("KKK");


        for (Object o :
                arrayList) {
//            int stuScore = (int ) o;
            //  问题二：如果在已知是整数类型的参数时，想要输出分数score，此时就会报错
            //  强转时就出现类型转换异常
            //  java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
            System.out.println(o);
        }

    }
    @Test
    public void test2(){

        //  在集合中使用泛型
        //  ArrayList<int> arrayList = new ArrayList<int>();
        //  不能这样写，在使用泛型的时候，这个泛型是一个类型，并且不能是基本数据类（8大基本数据类型）
        //  需要使用包装类

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        //  此时的add(Integer i)方法的形参就是Integer类型的
        arrayList.add(78);
        arrayList.add(89);
        arrayList.add(99);
        arrayList.add(88);
        arrayList.add(86);
        //  解决问题一：使用泛型之后，在编译阶段就会做类型检查相关的，防止添加了不同类型的数据

//        arrayList.add("sdas");
//
//        for (Integer i :
//                arrayList) {
//            //  解决问题2：由于加入泛型，所以在遍历输出元素的时候，就可以指定他的类型，同时还避免了强转的操作
//
//            System.out.println(i);
//        }
        //  使用迭代器的方式
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            //78
            //89
            //99
            //88
            //86
            //输出结果
        }
    }

    @Test
    public void test3(){
        /**
         *  在HashMap中使用泛型
         *
         */
        //  在声明的时候，显式类型参数字符串，整数可以替换为<>
        HashMap<String ,Integer> hashMap = new HashMap<String ,Integer>();
        hashMap.put("AA",89);
        //  如果不按照声明的类型添加数据在编译的时候就会报错
//        hashMap.put("AB","DF");
        hashMap.put("CC",98);
        //  entrySet()方法返回的set也是带有类型的，并且类型跟HashMap声明的泛型类型是一致的
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        //  泛型的嵌套,并且这里Map.Entry，是因为Entry是一个内部的接口，没有显式的暴露到外面
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String ,Integer> entry= iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key="+key+","+"value="+value);

        }



    }

}
