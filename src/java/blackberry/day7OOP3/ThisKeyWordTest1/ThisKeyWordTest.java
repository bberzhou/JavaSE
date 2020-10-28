package blackberry.day7OOP3.ThisKeyWordTest1;

/**
 * @Description: thiskeywordTest
 * @author: bberzhou@gmail.com
 * @date: 4/10/20 23:54
 * Create By IntelliJ IDEA
 */
public class ThisKeyWordTest {

}

class Boy {
    private String name;
    private int age;

    //  无参构造器
    public Boy () {

    }

    //  带两个参数的构造器
    public Boy (String name, int age) {
        this.name = name;
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

    public void setAge (int age) {
        this.age = age;
    }

    public void marry (Girl girl) {
        System.out.println ("我想取个女孩:" + girl.getName ());
    }

    public void shout () {
        if (this.age >= 22) {
            System.out.println ("可以结婚");
        } else {
            System.out.println ("先谈恋爱");
        }
    }
}

class Girl {
    private String name;
    private int age;

    public Girl () {

    }

    public Girl (String name, int age) {
        this.name = name;
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

    public void setAge (int age) {
        this.age = age;
    }

    //  当前女孩对象调用marry方法，并传入一个boy对象
    public void marry (Boy boy) {
        System.out.println ("我想嫁给:" + boy.getName ());
        //  boy对象调用其marry方法，同时将当前的这个女孩对象传入boy的marry方法中
        boy.marry (this);
    }

    //  同类的不同的对象排序，实际上是比较的对象的属性

    /**
     * @return 返回一个int 类型的数字，如果是正数，当前对象比较大，如果返回一个负数，就是传入的对象大，0：当前对象和形参对象相等
     * @Author bberzhou@gmail.com
     * @Description 比较两个对象的大小
     * @Date 09:21 4/11/20
     * @Param 传入一个对象
     */


    public int compare (Girl girl) {
//        if (this.age>girl.age){
//            //  返回正数表示当前对象大
//            return 1;
//        }else if (this.age<girl.age){
//            return -1;
//        }else {
//            //  两个一样大的时候返回0
//            return 0;
//        }
        //  直接通过差值来返回
        return this.age - girl.age;
    }
}
