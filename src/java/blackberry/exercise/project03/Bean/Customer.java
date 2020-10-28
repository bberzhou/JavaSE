package blackberry.exercise.project03.Bean;

/**
 * @Description: customer
 * @author: bberzhou@gmail.com
 * @date: 4/12/20 11:32
 * Create By IntelliJ IDEA
 */
public class Customer {
    //customer 相关的属性
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public char getGender () {
        return gender;
    }

    public void setGender (char gender) {
        this.gender = gender;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public String getPhone () {
        return phone;
    }

    public void setPhone (String phone) {
        this.phone = phone;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    //  无参的构造器
    public Customer () {
    }

    //  带参的构造器
    public Customer (String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}
