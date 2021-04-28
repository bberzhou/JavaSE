package blackberry.Chapter15Reflection.ReflectionStruc;


/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/11/21 21:44
 * Create By IntelliJ IDEA
 */

    //  Pop类在继承泛型类的时候，可以有多种选择，具体看泛型那章节的介绍，IntroGeneric.java
//public class Pop<T> extends Creature<T> implements Comparable<T>{
//
//
//
//    @Override
//    public int compareTo (T o) {
//        return 0;
//    }
//}


    //  这里继承父类的泛型指定具体的类型，还可以添加注解，注解修饰类
@myAnnotation(value = "hi")
public class Pop extends Creature<String> implements Comparable<String>,myInterface{
    //  不同权限大小的属性
    private String name;
    int age;
    public int id;
    //  空参构造器
    public Pop(){

    }

    //  带参构造器
    //  注解修饰构造器
    @myAnnotation(value = "abc")
    public Pop(String name){
        this.name = name;
    }
     private Pop(String name,int age ){
        this.name = name;
        this.age = age;
    }
    @myAnnotation(value = "show")
    private String  show(String nation){
        System.out.println ("我的国籍是："+nation);
        return nation;
    }
    @myAnnotation(value = "display")
    public String display(String interest,int age) throws RuntimeException,ClassCastException{
        return interest+age;

    }
    //  静态方法
    private static void showDesc(){
        System.out.println ("我是一个静态的方法");
    }
    //  实现两个接口里面的方法
    @Override
    public void info () {
        System.out.println ("我是一个人");
    }

    @Override
    public int compareTo (String o) {
        return 0;
    }
}