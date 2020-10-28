package blackberry.day9OOP1.DesignPattern;

/**
 * @Description: 单例模式之饿汉式
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 22:50
 * Create By IntelliJ IDEA
 */
public class SingletonTest4 {
    public static void main (String[] args) {
        Ban b1 = Ban.instance;
        //  这样做的一个缺陷就是
//        Ban.instance = null;  将static的属性instance赋值为null

        Ban b2 = Ban.instance;
        System.out.println (b1 == b2);   //   true

    }

}

class Ban {
    //  私有化构造器
    private Ban () {

    }

    //  此时直接将new的Ban()赋值给静态变量instance，这样创建Ban对象就是相同的实例，
    public static Ban instance = new Ban ();


}
