package blackberry.Chapter10EnumAndAnnotation.ClassEnum;

/**
 * @Description: enum关键字定义枚举类
 * @author: bberzhou@gmail.com
 * @date: 11/30/20 21:32
 * Create By IntelliJ IDEA
 */
public class defineEnumClass2 {
    /**
     * 自定义枚举类2：使用enum关键字来定义
     *  说明：
     *      定义的枚举类默认继承于java.lang.Enum类，所以直接打印对象时，不是一个地址值，而是对象名
     *
     *  Enum类的主要方法：
     *      values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值
     *      valueOf(String str)：可以把一个字符串转为对应的枚举类对象，要求字符串必须是枚举类对象的"名字"
     *      toString():返回当前枚举类对象常量的名称
     *
      */

    public static void main (String[] args) {
        Season summer = Season.SUMMER;
        System.out.println(summer);         //  SUMMER
        System.out.println(summer.getClass ()); //  class blackberry.Chapter10EnumAndAnnotation.ClassEnum.Season
        System.out.println(Season.class.getSuperclass ());  //  class java.lang.Enum

        //  重写toString()方法
        System.out.println (summer);    //  Season{seasonName='SUMMER', seasonDesc='烈日炎炎'}
        System.out.println("_________________");

        // enum类的几个方法测试
        //  enum的toString()方法
        System.out.println(summer.toString ()); //  SUMMER

        //  values()方法
        Season[] values = Season.values ();
        //  就是枚举类里面定义的常量
        for (int i = 0 ; i < values.length ; i++) {
            System.out.println(values[i]);
        }
        //SPRING
        //SUMMER
        //AUTUMN
        //WINTER

        //  valueOf(String objName):根据提供的objName,返回枚举类中与objName同名的对象
        Season winter = Season.valueOf ("WINTER");
        System.out.println(winter);
        //  如果没有objName的枚举类对象，没找到就会报错： java.lang.IllegalArgumentException: No enum constant


    }

}

//  利用enum关键字定义枚举类
enum Season{
    //  1.提供当前枚举类的对象，多个对象之间用"，"隔开，末尾用分号"；"结束，默认就是 public static final
     SPRING("Spring","春暖花开"),
     SUMMER("SUMMER","烈日炎炎"),
     AUTUMN("AUTUMN","秋风落叶"),
     WINTER("WINTER","白雪皑皑");

     // 2.声明Season对象的属性，private final修饰
     String seasonName;
     String seasonDesc;

     // 3.私有化类的构造器，并给对象属性赋值
    private Season (String seasonName,String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;

    }

    //  4.其他诉求1：获取枚举类对象的属性

    public String getSeasonName () {
        return seasonName;
    }

    public String getSeasonDesc () {
        return seasonDesc;
    }

    //  4.其他诉求2：重写toString方法

//    @Override
//    public String toString () {
//        return "Season{" +
//            "seasonName='" + seasonName + '\'' +
//            ", seasonDesc='" + seasonDesc + '\'' +
//            '}';
//    }
}
