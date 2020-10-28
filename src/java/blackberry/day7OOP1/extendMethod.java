package blackberry.day7OOP1;

/**
 * @author bberzhou@gmail.com
 * @date 8/27/19 09:21
 * Create By IntelliJ IDEA
 */
public class extendMethod {
    /*
        Person类称为超类(super class)，（基类  base class），
        student(称为子类，subclass 扩展类extended class);
        java 里面只允许一个class继承自一个类，一个类有且仅有一个父类，只有Object没有父类
        继承之后，子类无法访问父类的private字段,protected关键字可以把字段和方法的访问权限控制在继承树内部，
        一个protected字段和方法可以被其子类，以及子类的子类所访问

        如果父类没有默认的构造方法，子类就必须显式调用super(),
        并给出参数以便让编译器定位到父类的一个合适的构造方法。
        子类不会继承任何父类的构造方法。子类默认的构造方法是编译器自动生成的，不是继承的。
     */
    public static void main (String[] args) {
        Student student = new Student ("aa", 10, "sdsd", "sss");
        System.out.println (student.toString ());
        Student student1 = new Student ("aa", 10, "sdsd", "sss");
        //  因为Student继承自Person，它拥有Person的全部功能。
        //  Person类型的变量，如果指向Student类型的实例，完全可以对它进行操作，这称之为向上转型(upcasting)
        //  向上转型实际上是把一个子类型安全地变为更加抽象的父类型：
        Person p = new Student ("aa", 10, "sdsd", "sss");

        //  和向上转型相反，如果把一个父类类型强制转型为子类类型，就是向下转型（downcasting
        //  这里需要类型的强转，向下转型很可能会失败。失败的时候，Java虚拟机会报ClassCastException
        //  为了避免向下转型出错，Java提供了instanceof操作符，可以先判断一个实例究竟是不是某种类型
        Student student2 = (Student) new Person ();
        System.out.println (student2 instanceof Person);    // true
        System.out.println (student instanceof Student);     // true
        //  instanceof实际上判断一个变量所指向的实例是否是指定类型，或者这个类型的子类
        //  所以在向下转型的时候可以先判断一下
        Person person = new Student ();
        if (person instanceof Student) {
            //  强转
            Student s = (Student) person;
        }

        //  继承是is 关系，组合是has 关系


    }

}

class Student extends Person {
    private String address;

    public void Hello () {
        System.out.println (this.name);
    }

    public Student (String name, int age, String email, String address) {
//        因为在Java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。
//        如果没有明确地调用父类的构造方法，编译器会帮我们自动加一句super();
//        所以，Student类的构造方法实际上是这样：
        super (name, age, email);

//        super();  如果是调用无参的父类的构造方法，那么子类也不能正确获取字段
        this.address = address;
    }

    public Student () {

    }


    @Override
    public String toString () {
        return "Student{" +
            "address='" + address + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            ", email='" + email + '\'' +
            '}';
    }
}

class Person {
    protected String name;
    protected Integer age;
    protected String email;

    public Person (String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Person () {

    }

}