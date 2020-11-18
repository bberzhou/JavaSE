package blackberry.Chapter9String.StringClass;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/15/20 21:39
 * Create By IntelliJ IDEA
 */
public class Person {
    String name;
    int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person () {

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

    public void setAge (int age) {
        this.age = age;
    }
}
