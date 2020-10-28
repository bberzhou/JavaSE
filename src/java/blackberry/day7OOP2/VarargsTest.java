package blackberry.day7OOP2;

/**
 * @Description: varargs
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 22:10
 * Create By IntelliJ IDEA
 */
public class VarargsTest {
    /*
        可变个数的形参：
        1。JDK5中提供了Varargs（variable number of arguments）
           允许直接定义能和多个实参相匹配的形参。从而可以更简单的传递个数可变的参数，可以是0个
        2。可变个数形参的格式： 数据类型...变量名
        3。可变个数形参的方法与本类中方法名相同，但是形参不同的方法之间构成重载
        4。可变个数形参的方法与本类中方法名相同，形参类型也相同的数组之间不构成重载，
          比如public void show(String[] strings)和public void show(String ... strings)
        5。可变个数形参在方法中必须放在参数列表的末尾，且最多只能声明一个可变形参
     */
    public static void main (String[] args) {
        VarargsTest varargsTest = new VarargsTest ();
        varargsTest.show (12);
        varargsTest.show ("hello");
        //此时传入的就是多个参数匹配的就是多个参数的
        varargsTest.show ("hello", "word");  //  show strings

        varargsTest.show (new String[]{"AAA,DDD,FFF"});//   AAA,DDD,FFF
    }

    public void show (int i) {

    }

    //  此时注释掉之后，varargsTest.show ("hello");调用的是show(String ... strings)
    public void show (String str) {
        System.out.println ("show str");
    }

    public void show (String... strings) {
        //  这里可以把可变参数看成是一个数组，遍历方式和数组相同
        System.out.println ("show strings");
        for (int i = 0 ; i < strings.length ; i++) {
            System.out.println (strings[i]);
        }
    }
    //  这样声明就会报错，这是JDK5以前的定义可变参数的方法
//    public void show(String[] strings){
//
//    }
    //  会报错
//    public void show (String ... strings,int i){
//
//    }
}
