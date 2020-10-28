package blackberry.day7OOP3;

/**
 * @Description: thiskeyword
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 22:27
 * Create By IntelliJ IDEA
 */
public class ThisKeyWord {
    /*
        this关键字的使用：
            1。this可以用来修饰或调用：属性、方法、构造器
            2。this可以理解为当前对象或者当前正在创建的对象(即在构造器中)
            3。在类的方法中，可以使用"this.属性"或者"this.方法"的方式，调用当前对象的属性或者方法，
               通常情况下都省略了，但是当方法的形参和属性同名时，就要使用this.属性 来表明是类的属性而不是方法中的那个形参
            4。 在类的构造器中，可以使用"this.属性"或者"this.方法"的方式，调用当前正在创建的对象的属性或者方法，
               通常情况下都省略了，但是当方法的形参和属性同名时，就要使用this.属性 来表明是类的属性而不是方法中的那个形参

            5。this来调用构造器
                1）在类的构造器中，可以显式的使用"this(形参列表)"的方式，来调用本类中指定的其他构造器，不可以调用自己本身的构造器
                2）构造器中不能通过"this(形参列表)"方式调用自己
                3）即使调用多个构造器，但是都是同一个对象，不是多个对象
                4）不能互相调用形成一个环，即只能单向的，n个构造器，最多n-1个构造器调用
                5）规定："this(形参列表)"调用的时候，必须放在构造器中的首行
                6）构造器内部，最多只能声明一个"this(形参列表)",只能调用一个，不能在内部调用多个构造器

            它在方法的内部使用，即表示这个方法所属的对象
            它在构造器内部使用，表示该构造器正在初始化的对象

            this表示当前对象，可以调用类的属性、方法和构造器
     */


    public static void main (String[] args) {
        Peron peron = new Peron ();
        peron.setAge (3);
        System.out.println (peron.getAge ());    //  0       3

        Peron peron1 = new Peron ("kang", 98);
        //  98，这里获取的当前对象的age属性，实际上是77行形参传递给44行this所调用的构造器为当前对象的age属性的赋值
        System.out.println (peron1.getAge ());

    }
}

//  定义一个Peron类来测试this关键字
class Peron {
    private String name;
    private int age;

    //  无参的构造器
    public Peron () {
        //  假设还有40行代码需要执行
    }

    public Peron (int age) {
        String info = "通过this来执行的调用构造器假设还有40行代码需要执行";
        System.out.println (info);
        this.age = age;
        //  假设还有40行代码需要执行
    }

    //    public void setAge(int a){
//        age = a;
//
//    }
    //  此时就无法区分，方法里面的age就会采用就近原则选取的是形参里面的age，而不是Peron类的age属性
    //  构造器里面有this关键字,此时就是表示正在创建的对象的属性name
    public void Peron (String name) {
        this.name = name;
        this.age = age;
        //  调用当前正在创建的对象的eat方法
        this.eat ();

        //  假设还有40行代码需要执行
    }

    //  三、使用this关键字来调用构造器
    public Peron (String name, int age) {
        //  通过this(age);就会调用44行的带一个int类型参数的构造器，这样传入的age就会赋值给当前创建的对象，所以下面的this.age =age 就可以省略

        this (age);
        this.name = name;
//        this.age = age;

        //  假设还有40行代码需要执行，此时上面一个构造器也需要执行40行代码，
        //  这一个构造器也需要执行，就可以通过调用构造器来解决冗余的代码
    }

    public void setAge (int age) {
        //  所以这里就用this来区分属性的age和形参的age,这里可以把this理解为当前对象，
        //  一、即是为当前对象的age 赋值为形参传入的age值
        this.age = age;
    }

    public int getAge () {
        return this.age;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        //  谁调用这个方法，就返回当前这个对象的name属性的值是多少
        return this.name;
    }


    //  二、通过this来调用方法
    public void eat () {
        System.out.println ("人吃饭");
        //  方法里面调用方法,即是表示谁调用eat这个方法，就用这个对象继续调用sleep()方法
        this.sleep ();
    }

    public void sleep () {
        System.out.println ("人睡觉");
    }
}