package blackberry.Chapter10EnumAndAnnotation.ClassEnum;

/**
 * @Description: 自定义枚举类
 * @author: bberzhou@gmail.com
 * @date: 11/30/20 21:18
 * Create By IntelliJ IDEA
 */
public class defineEnumClass1 {
    // 1.声明defineEnumClass对象的属性
    private final String seasonName;    //  季节名称
    private final String seasonDesc;    //  季节描述


    //  2。私有化类的构造器,并给对象属性赋值
    private defineEnumClass1 (String seasonName, String seasonDesc) {
        {
            this.seasonName = seasonName;
            this.seasonDesc = seasonDesc;
        }

    }

    //  3。提供当前枚举类的多个对象，因为是final的，所以一般变量名大写
    public static final defineEnumClass1 SPRING  = new defineEnumClass1 ("Spring","春暖花开");
    public static final defineEnumClass1 SUMMER  = new defineEnumClass1 ("SUMMER","烈日炎炎");
    public static final defineEnumClass1 AUTUMN  = new defineEnumClass1 ("AUTUMN","秋风落叶");
    public static final defineEnumClass1 WINTER  = new defineEnumClass1 ("WINTER","白雪皑皑");

    //  4。其他需求1，获取枚举类对象的属性

    public String getSeasonDesc () {
        return seasonDesc;
    }

    public String getSeasonName () {
        return seasonName;
    }

    //  4。其他需求2,toString()方法


    @Override
    public String toString () {
        return "defineEnumClass{" +
            "seasonName='" + seasonName + '\'' +
            ", seasonDesc='" + seasonDesc + '\'' +
            '}';
    }
}
