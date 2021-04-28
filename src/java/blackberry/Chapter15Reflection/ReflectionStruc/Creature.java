package blackberry.Chapter15Reflection.ReflectionStruc;

import java.io.Serializable;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/11/21 21:45
 * Create By IntelliJ IDEA
 */

//  Creature类是Pop类的父类
public class Creature<T> implements Serializable {
    //  带泛型的父类还实现了Serializable接口
    //  char类型的性别
    private char gender;
    //  double类型的体重
    public double weight;
    //  void类型的方法
    private void breath(){
        System.out.println ("生物呼吸");
    }
    public void est(){
        System.out.println ("生物吃东西");
    }
}
