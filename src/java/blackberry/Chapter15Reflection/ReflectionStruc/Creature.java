package blackberry.Chapter15Reflection.ReflectionStruc;

import java.io.Serializable;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/11/21 21:45
 * Create By IntelliJ IDEA
 */
public class Creature<T> implements Serializable {
    //  带泛型的父类还实现了Serializable接口
    private char gender;
    public double weight;
    private void breath(){
        System.out.println ("生物呼吸");
    }
    public void est(){
        System.out.println ("生物吃东西");
    }
}
