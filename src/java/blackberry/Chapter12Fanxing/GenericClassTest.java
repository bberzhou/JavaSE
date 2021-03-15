package blackberry.Chapter12Fanxing;

import org.junit.Test;

public class GenericClassTest {
    /**
     *  泛型类的测试：
     *  如何自定义泛型结构：泛型类、泛型接口、泛型方法
     *      1、关于自定义泛型类、泛型接口：
     */
    @Test
    public void test1(){
        //  如果定义了泛型类，在实例化的时候没有指明类的泛型，
        //  则认为此泛型类型为Object类型，例如此时的setOrderT()方法的参数类型就是Object类型的
//        GenericClass genericClass = new GenericClass();
//        genericClass.setOrderT();

        //  要求：如果定义了类是带泛型的，建议在实例化的时候就要指明类的泛型
        //  建议：在实例化的时候指明类的泛型
        GenericClass<String> genericClass = new GenericClass<>();
        genericClass.setOrderT("AAA");
        //  指明之后，如果不按照泛型的格式就会在编译时报错
//        genericClass.setOrderT(14654);    //  报错


    }
    @Test
    public void test2(){
        //  使用泛型的子类 SubGenericClass
        SubGenericClass subGenericClass = new SubGenericClass();
        // 由于子类在继承带泛型的父类时，指明了泛型类型，所以在实例化子类对象的时候，可以不再需要指明泛型，
        // 但是由于
//        subGenericClass.setOrderT();

        //  使用泛型的子类SubGenericClass1，这个子类本身也带着泛型,这样在实例化的时候，
        //  就能够指定子类的类型，不用完全按照父类的类型

        SubGenericClass1<String > stringSubGenericClass1 = new SubGenericClass1<>();
        stringSubGenericClass1.setOrderT("AAAA");   //  这里就是字符串类型的了

    }
}
