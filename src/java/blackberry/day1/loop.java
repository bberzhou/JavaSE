package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/23/19 19:26
 * Create By IntelliJ IDEA
 */
public class loop {
    public static void main (String[] args) {
        for (int i = 1 ; i < 150 ; i++) {
            if (i % 3 == 0) {
                System.out.print ("foo" + i);
            }
            if (i % 5 == 0) {
                System.out.print ("biz" + i);

            }
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print ("baz");
            }
            System.out.println ();

        }
    }

    /*
        1：格式
            1）初始化条件
            2）循环条件
            3）迭代部分
            4）循环体




       for(1;2;3){
            4
       }


       1
       while(2){
        3;
        4;
       }

       1
       do{
            4;
            3;
        }while 2;

        注意：1。不同的循环体结构之间可以互相转换
            2。while和do-while的区别：do-while至少会执行一次。

            3。嵌套循环：循环结构还可以声明循环，让外层循环控制行数，内层控制列数




     */
}
