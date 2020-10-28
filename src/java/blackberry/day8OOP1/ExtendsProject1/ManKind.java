package blackberry.day8OOP1.ExtendsProject1;

/**
 * @Description: 人类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 15:23
 * Create By IntelliJ IDEA
 */
public class ManKind {
    //  性别
    int sex;
    //  薪资
    int salary;

    //  无参的构造器
    public ManKind () {

    }

    //  带参数的构造器
    public ManKind (int sex, int salary) {
        this.salary = salary;
        this.sex = sex;
    }

    //  man == 0 woman == 1
    public void manOrWoman () {
        if (sex == 1) {
            System.out.println ("man");
        } else if (sex == 0) {
            System.out.println ("woman");
        }

    }

    //  salary==0 就是 no job,
    public void employed () {
        if (salary == 0) {
            System.out.println ("no job");
        } else {
            System.out.println ("JOb");
        }
    }

    public void setSalary (int salary) {
        this.salary = salary;
    }

    public void setSex (int sex) {
        this.sex = sex;
    }

    public int getSalary () {
        return salary;
    }

    public int getSex () {
        return sex;
    }
}
