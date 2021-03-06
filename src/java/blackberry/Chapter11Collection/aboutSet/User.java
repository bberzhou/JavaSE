package blackberry.Chapter11Collection.aboutSet;

import java.util.Objects;

public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //  重写equals方法

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals()...方法");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    //  对象的比较方法，首先实现comparable 接口，然后重写compareTo(),在compareTo()这个方法里面可以指定该类对象的排序方式

//    @Override
//    public int compareTo(Object o) {
//        //  首先判断是否为该类的对象（实例）
//        if (o instanceof User){
//            User user = (User) o;   //  然后进行强转
//            return this.name.compareTo(user.name);  //  然后按照两个对象的姓名进行比较
//        }else {
//            throw  new RuntimeException("输入的类型不匹配。");
//        }
//    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof User){
            User user = (User) o;
            return this.name.compareTo(user.name);
        }else {
            throw new RuntimeException("错误信息");
        }
    }
}
