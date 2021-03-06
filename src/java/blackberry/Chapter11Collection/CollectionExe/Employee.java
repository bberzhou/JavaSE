package blackberry.Chapter11Collection.CollectionExe;

import java.util.Objects;

public class Employee implements Comparable {
    private String name;
    private int age;
    private MyDate myDate;

    public Employee() {
    }

    public Employee(String name, int age, MyDate myDate) {
        this.name = name;
        this.age = age;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    //  重写toString()方法
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myDate=" + myDate +
                '}';
    }

    //  重写equals()方法
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age &&
                Objects.equals(name, employee.name) &&
                Objects.equals(myDate, employee.myDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, myDate);
    }

    //  Employee类实现Comparable接口，重写compareTo()方法，按照name属性进行排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee employee = (Employee) o;
            return this.name.compareTo(employee.name);
        }else {
            throw new RuntimeException("输入错误");
        }
    }
}
