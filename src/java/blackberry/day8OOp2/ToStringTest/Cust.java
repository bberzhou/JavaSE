package blackberry.day8OOp2.ToStringTest;

import java.util.Objects;

/**
 * @Description: Cust类
 * @author: bberzhou@gmail.com
 * @date: 4/21/20 14:03
 * Create By IntelliJ IDEA
 */
public class Cust {
    private String name;
    private int age;

    //  构造器
    public Cust () {

    }

    public Cust (String name, int age) {
        this.name = name;
        this.age = age;
    }
    //  重写equals()方法


    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Cust cust = (Cust) o;
        return age == cust.age &&
            Objects.equals (name, cust.name);
    }

    //  重写toString()方法
    @Override
    public String toString () {
        return "Cust[ name = " + name + ", age = " + age + "]";
    }


    public void setAge (int age) {
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }
}
