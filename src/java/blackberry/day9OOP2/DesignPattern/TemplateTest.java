package blackberry.day9OOP2.DesignPattern;

import blackberry.day8OOP1.instanceofKeyword.Man;

/**
 * @Description: 模版方法
 * @author: bberzhou@gmail.com
 * @date: 4/29/20 22:22
 * Create By IntelliJ IDEA
 */
public class TemplateTest {
    /*
        抽象类的应用：模版方法的设计模式
     */
    public static void main (String[] args) {
        Template t = new SubTemplate ();
        //  此处子类对象调用spendTime()，里面调用code()方法时，
        //  执行的是子类重写的code()方法，而不是父类的code()抽象方法
        t.spendTime ();

    }

}

//  模版类
abstract class Template {
    //  此方法计算某段执行耗费的时间
    public void spendTime () {
        long start = System.currentTimeMillis ();
        //  执行这段代码
        this.code ();    //  此部分代码就是不变的，易变的
        long end = System.currentTimeMillis ();
        System.out.println ("花费的时间为：" + (end - start));
    }

    public abstract void code ();
}

class SubTemplate extends Template {

    //  重写父类的抽象方法
    @Override
    public void code () {
        //  在SubTemplate类中此code方法计算1000以内的质素
        int count = 0;
        for (int i = 2 ; i < 1000 ; i++) {
            //  定一个flag,用于判断是否为质素
            boolean isFlag = true;
            for (int j = 2 ; j <= Math.sqrt (i) ; j++) {
                if (i % j == 0) {
                    //  能除尽的情况，将flag置为false
                    isFlag = false;
                    //  能除尽的情况，直接退出内层循环
                    break;

                }
            }
            //  当isFlag为 true时，表明内层循环都不能整除
            if (isFlag) {
                System.out.println ("质素：" + i);
                count++;
            }

        }
        System.out.println ("1000以内的质素个数：" + count);

    }
}
