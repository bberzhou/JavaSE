package blackberry.exercise.Project05Team.Service;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 10/2/20 16:55
 * Create By IntelliJ IDEA
 */
//public class Status {
//    /**
//     * 表示员工的状态，声明了三个对象属性，分别表示成员的状态
//     * 这里的设计模式有点类似day9 的单例模式
//     */
//    private final String NAME;
//
//    //  私有构造器
//    private Status (String name) {
//        this.NAME = name;
//
//    }
//
//    //  三个final对象
//    public static final Status FREE = new Status ("FREE");
//    public static final Status BUSY = new Status ("BUSY");
//    public static final Status VOCATION = new Status ("VOCATION");
//
//    //  get方法获取name
//    public String getNAME () {
//        return NAME;
//    }
//
//    @Override
//    public String toString () {
//        return NAME;
//    }
//}


//  使用枚举类型来实现这个类
public enum Status{

    //  1.定义三个对象
    FREE("FREE"),
    BUSY("BUSY"),
    VOCATION ("VOCATION");

    // 2。 声明属性
    String statusName;

    //  3。私有化构造器
    private Status (String statusName) {
        this.statusName = statusName;
    }

    //  4。get方法，

    public String getNAME() {
        return statusName;
    }

    //  5。重写toString()方法
//    @Override
//    public String toString () {
//        return "Status{" +
//            "statusName='" + statusName + '\'' +
//            '}';
//    }
}