package blackberry.Chapter10EnumAndAnnotation.ClassEnum;

import org.junit.Test;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/30/20 21:09
 * Create By IntelliJ IDEA
 */
public class aboutEnum {
    /**
     *  枚举类的使用：
     *  如何自定义枚举类型
     *  如何使用关键字enum定义枚举类型
     *  Enum类的主要方法
     *  实现接口的枚举类
     *
     *
     *   一、 注意：
     *      1。枚举类的理解：类的对象只有有限个，确定的，我们称此类为枚举类
     *      2。当需要定义一组常量时，强烈建议使用枚举类型
     *      3。如果枚举类中只有一个对象，则可以作为单例模式的实现方式
     *   二、如何定义枚举类
     *   方式一：jdk5.0之前，自定义枚举类
     *   方式二：jdk5.0，可以使用enum关键字定义枚举类
     *
     *   三、Enum类的主要方法：
     *       values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值
     *       valueOf(String str)：可以把一个字符串转为对应的枚举类对象，要求字符串必须是枚举类对象的"名字"
     *       toString():返回当前枚举类对象常量的名称
     *
     *
     *   四：使用enum关键字定义的枚举类实现接口的情况
     *      情况一：实现接口，在enum类中实现抽象方法
     *      情况二：
     *
     *
     */

    @Test
    public void test(){
        //  自定义枚举类

    }
}
