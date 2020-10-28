package blackberry.day9OOP2.DesignPattern;

/**
 * @Description: 模版方法测试
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 22:43
 * Create By IntelliJ IDEA
 */
public class TemplateTest1 {
    public static void main (String[] args) {
        BankTemplateMethod bankTemplateMethod = new DrawMoney ();
        bankTemplateMethod.process ();
        BankTemplateMethod bankTemplateMethod1 = new ManageMoney ();
        bankTemplateMethod1.process ();
        /*
            输出结果：不能子类对transact()方法重写的不同，就类似一个钩子，
            取号排队：
            取钱操作
            反馈评分。

            取号排队：
            理财操作
            反馈评分。
         */

    }
}

//  抽象类
abstract class BankTemplateMethod {
    //  父类的具体方法
    public void takeNumber () {
        System.out.println ("取号排队：");
    }

    public abstract void transact ();

    public void evaluate () {
        System.out.println ("反馈评分。");
    }

    //  模版方法，将基本操作组合到一起将process()方法声明为final的，让子类不能重写此方法
    public final void process () {
        //  整个流程是不可变的。
        this.takeNumber ();
        //  transact()方法是抽象的，像一个钩子，具体执行时，挂到哪个子类，就执行哪个子类的此方法

        this.transact ();
        this.evaluate ();
    }
}

class DrawMoney extends BankTemplateMethod {
    //  重写父类的抽象方法
    @Override
    public void transact () {
        System.out.println ("取钱操作");
    }
}

class ManageMoney extends BankTemplateMethod {
    //  重写父类的抽象方法

    @Override
    public void transact () {
        System.out.println ("理财操作");
    }
}
