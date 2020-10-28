package blackberry.day7OOP1;

/**
 * @author bberzhou@gmail.com
 * @date 8/28/19 10:49
 * Create By IntelliJ IDEA
 */
public class StaticMethod {
    /*
        静态字段，被static修饰的字段，
        实例字段在每个实例中都有自己的一个独立“空间”，
        但是静态字段只有一个共享“空间”，所有实例都会共享该字段。
        因为interface是一个纯抽象类，所以它不能定义实例字段。
        但是，interface是可以有静态字段的，并且静态字段必须为final类型：

     */


    public static void main (String[] args) {
        People people = new People ("kang");
        People people1 = new People ("kk");
        people.num = 1000;
        people1.num = 2000;

        System.out.println (people.num);
        System.out.println (people1.num);
        //  2000
        //  2000,所有实例对象都是共享一个静态字段的，不推荐用实例变量.静态字段去访问静态字段，
//        用类名来访问静态字段。可以把静态字段理解为描述class本身的字段（非实例字段）。
        People.num = 3000;
//         class来调用静态方法访问静态字段
        People.setName (30);


//        静态方法经常用于工具类。例如：
//        Arrays.sort()
//        Math.random()


    }
}

class People {
    public static int num;
    private String name;

    public People (String name) {
        this.name = name;

    }

    //  因为静态方法属于class而不属于实例，因此，静态方法内部，无法访问this变量，
//  也无法访问实例字段，它只能访问静态字段。
    public static void setName (int val) {
        num = val;
    }
}