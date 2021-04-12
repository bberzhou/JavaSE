package blackberry.Chapter10EnumAndAnnotation.aboutAnnotation;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 12/1/20 10:50
 * Create By IntelliJ IDEA
 */
public class about {
    /**
     * 一、
     *   JDK5。0开始，Java增加了对元数据（MetaData）的支持，也就是Annotation
     *   Annotation其实就是代码里面的特殊标记，
     *   Annotation可以像修饰符一样被使用，用于修饰包，类，构造器，方法，成员变量，参数，局部变量的声明
     *   框架 = 注解+反射+设计模式
     *
     *
     * 二、
     *     常见的注解示例：
     *      示例一：生成文档相关的注解
     *      @Description:
     *      @author: bberzhou@gmail.com
     *      @date: 12/1/20 10:50
     *
     *      示例二：在编译时进行格式检查（JDK内置的三个基本注解）
     *      @override：重写父类
     *      @Deprecated: 用于表示所修饰的元素已过时。
     *      @SuppressWarnings：抑制编译器警告
     *
     *      示例三：跟踪代码依赖性，实现替代配置文件功能
     *
     *三、如何自定义注解：参照@SuppressWarnings 来声明，
     *      1）注解声明为：@interface
     *      2）内部定义成员：通常用value();来表示
     *      3）也可以指定成员的默认值，使用default定义
     *      4）如果自定义注解没有成员，表明是一个标识作用
     *
     *
     *    如果注解有成员，在使用注解时，需要指明成员的值，如果有默认值也可以不需要
     *    自定义注解必须配上注解的信息处理流程（使用反射）才有意义
     *    自定义注解通常都会指明两个元注解：Retention、Target
     *
     *四、JDK提供的四种元注解，JDK中的元Annotation用于修饰其他Annotation定义
     *      元注解：对现有的注解进行解释说明的注解
     *      Retention：指定所修饰的Annotation的生命周期：SOURCE（默认行为）、CLASS（默认行为）、RUNTIME
     *      Target：用于指定被修饰的Annotation能用于修饰哪些程序元素
     *      下面两个出现频率较低
     *      Document：表示所修饰的注解在被Javadoc解析时，保留下来
     *      Inherited：被它修饰的Annotation将具有继承性
     *
     *
     *  五、通过反射获取注解信息------到反射内容时系统讲解
     *
     *  六、JDK8中注解的新特性：可重复注解、类型注解
     *      6。1 可重复注解，1）在MyAnnotation上声明@Repeatable ()，成员值为MyAnnotations.class
     *                    2）MyAnnotation的Target和Retention和MyAnnotations相同
     *      6。2 类型注解：
     *          ElementType.TYPE_PARAMETER 表示该注解能写在类型变量的声明语句中，
     *          ElementType.TYPE_USE  表示该注解能写在使用类型的任何语句中
     *
     *
     *
     */


}
