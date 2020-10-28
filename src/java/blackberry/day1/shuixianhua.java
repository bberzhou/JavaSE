package blackberry.day1;

/**
 * @author bberzhou@gmail.com
 * @date 7/23/19 19:35
 * Create By IntelliJ IDEA
 */
public class shuixianhua {
    //    水仙花数是一个三位数，各个位上数字立方和等于其本身
    public static void main (String[] args) {
        for (int i = 100 ; i < 1000 ; i++) {
            int num1 = i / 100;    // 百位数
            int num2 = (i - num1 * 100) / 10;   //十位数
//            int num3 = i-num1*100-num2*10;  //个位数
            int num3 = i % 10;
            int k = num1 * num1 * num1 + num2 * num2 * num2 + num3 * num3 * num3;
            if (k == i) {
                System.out.println ("这是一个水仙花数" + i);
            }


        }
    }
}
