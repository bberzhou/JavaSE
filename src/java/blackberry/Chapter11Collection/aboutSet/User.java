package blackberry.Chapter11Collection.aboutSet;

import org.junit.Test;

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

    //重写User类的CompareTo()方法，按照姓名从小到大，字母A-Z，a-z，进行排序

    //  见 TreeSet类里面第4个测试

//    @Override
//    public int compareTo(Object o) {
//        //  首先判断是否为该类的对象（实例）
//        if (o instanceof User){
//            User user = (User) o;   //  然后进行强转
//            return -this.name.compareTo(user.name);  //  然后按照两个对象的姓名进行比较
//        }else {
//            throw  new RuntimeException("输入的类型不匹配。");
//        }
//    }



    //  重写User类的CompareTo()方法，按照姓名从小到大，字母A-Z，a-z，进行排序,然后年龄再从小到大排列
    //  见 TreeSet里面第5个和第6个测试
    @Override
    public int compareTo(Object o) {
        //  1、首先判断形参o是不是User类的实例对象
        if (o instanceof User){
            User user = (User) o;
            //  2、先判断两个对象的姓名属性是否相等，
            int compare = -this.name.compareTo(user.name);
            if (compare != 0){
                //  3、如果返回值不为0，则表明两个对象姓名不相等，就可以直接插入
                return compare;
            }else {
                //  4、如果两个对象的姓名相等，就要继续比较两个对象的年龄属性是否相等
                return Integer.compare(this.age,user.age);
            }
        }else {
            throw new RuntimeException("错误信息");
        }
    }

}
