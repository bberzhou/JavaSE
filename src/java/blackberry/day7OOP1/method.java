package blackberry.day7OOP1;

/**
 * @author bberzhou@gmail.com
 * @date 8/26/19 19:50
 * Create By IntelliJ IDEA
 */
public class method {
    public static void main (String[] args) {
        Teacher t1 = new Teacher ();
        t1.age = 10;


        System.out.println (t1.age);

    }

}

class Teacher {
    String name;
    Integer age;
    //  当成员变量是private的时候，就不能使用  t1.address = 方式赋值，
    //  而是使用set get方法

    private String address;

    public String getAddress () {
        return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    //  默认构造函数
    public Teacher () {

    }

    //  带参数的构造方法
    public Teacher (String name, String address) {

    }
}

