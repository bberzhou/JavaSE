package blackberry.day8OOP1.ExtendsProject1;

/**
 * @Description: 小孩类
 * @author: bberzhou@gmail.com
 * @date: 4/14/20 15:25
 * Create By IntelliJ IDEA
 */
public class Kids extends ManKind {
    //  继承Mankind类
    private int yearsOld;

    //  无参的构造器,提供的这个构造器，方便创建类的对象，属性值再通过set方法来设置值
    public Kids () {

    }

    //  带参的构造器
    public Kids (int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge () {
        System.out.println ("I am " + yearsOld + " years old");
    }

    public void setYearsOld (int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld () {
        return yearsOld;
    }
    //  重写employed方法


    @Override
    public void employed () {
        System.out.println ("kids should study and no job");
    }
}
