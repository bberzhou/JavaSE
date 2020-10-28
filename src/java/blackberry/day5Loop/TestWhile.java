package blackberry.day5Loop;

/**
 * @author bberzhou@gmail.com
 * @date 3/29/20 10:23
 * Create By IntelliJ IDEA
 */
public class TestWhile {
    /*
    for和while循环的总结：
        1、开发中，基本上都会从for和while中进行选择，实现循环结构
        2、for循环和while循环是可以相互转换的
            区别：for循环和while循环的初始化条件部分的作用范围不同
        3、避免死循环的出现



        循环结构的四个要素：
        1、初始化条件
        2、循环条件 ---》是boolean类型
        3、循环体
        4、迭代条件

        while(2){
            3
            4;
            }
            执行过程：1-》2-》3-》4-》2-》3-》4
            while和for 可以互相转换
     */
    public static void main (String[] args) {
        //  遍历100以内的偶数
        int i = 2;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println (i);
            }
            // 循环迭代条件，容易导致死循环8
            i++;
        }
    }

}
