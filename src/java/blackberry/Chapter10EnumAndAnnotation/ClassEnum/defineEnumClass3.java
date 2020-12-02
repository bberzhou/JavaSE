package blackberry.Chapter10EnumAndAnnotation.ClassEnum;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/30/20 22:15
 * Create By IntelliJ IDEA
 */
public class defineEnumClass3 {
    /**
     *
     */
    public static void main (String[] args) {
        Season1 winter = Season1.WINTER;
        //  枚举类的对象就可以直接调用重写了的接口方法
        winter.show ();     //  这是一个季节

        winter.show ();     //  这是冬天   此时输出就是定制的
    }
}

//  定义一个接口
interface Info{
    //  定义一个show 方法
    void show();
}
//  自定义枚举类,实现接口
enum Season1 implements Info{
//    //  1.提供当前枚举类的对象，多个对象之间用"，"隔开，末尾用分号"；"结束，默认就是 public static final
//    SPRING("Spring","春暖花开"),
//    SUMMER("SUMMER","烈日炎炎"),
//    AUTUMN("AUTUMN","秋风落叶"),
//    WINTER("WINTER","白雪皑皑");
//
//    // 2.声明Season对象的属性，private final修饰
//    String seasonName;
//    String seasonDesc;
//
//    // 3.私有化类的构造器，并给对象属性赋值
//    private Season1 (String seasonName,String seasonDesc) {
//        this.seasonName = seasonName;
//        this.seasonDesc = seasonDesc;
//
//    }
//
//    //  4.其他诉求1：获取枚举类对象的属性
//
//    public String getSeasonName () {
//        return seasonName;
//    }
//
//    public String getSeasonDesc () {
//        return seasonDesc;
//    }
//
////      4.其他诉求2：重写toString方法
//
//    @Override
//    public String toString () {
//        return "Season{" +
//            "seasonName='" + seasonName + '\'' +
//            ", seasonDesc='" + seasonDesc + '\'' +
//            '}';
//    }
//
//
//
//    //  重写接口的方法
//    @Override
//    public void show () {
//        System.out.println("这是一个季节");
//    }


    // 情况二：每一个枚举类对象都实现抽象方法
    //  1.提供当前枚举类的对象，多个对象之间用"，"隔开，末尾用分号"；"结束，默认就是 public static final

    //  每个对象单独定制
    SPRING("Spring","春暖花开"){
        @Override
        public void show () {
            System.out.println("这是春天");
        }
    },
    SUMMER("SUMMER","烈日炎炎"){
        @Override
        public void show () {
            System.out.println("这是夏天");
        }
    },
    AUTUMN("AUTUMN","秋风落叶"){
        @Override
        public void show () {
            System.out.println("这是秋天z");
       }
    },
    WINTER("WINTER","白雪皑皑"){
        @Override
        public void show () {
            System.out.println("这是冬天");
        }
    };


    // 2.声明Season对象的属性，private final修饰
    String seasonName;
    String seasonDesc;

    // 3.私有化类的构造器，并给对象属性赋值
    private Season1 (String seasonName,String seasonDesc) {
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

//      4.其他诉求2：重写toString方法

    @Override
    public String toString () {
        return "Season{" +
            "seasonName='" + seasonName + '\'' +
            ", seasonDesc='" + seasonDesc + '\'' +
            '}';
    }



//    //  重写接口的方法
//    @Override
//    public void show () {
//        System.out.println("这是一个季节");
//    }
}

