package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/14/21 19:05
 * Create By IntelliJ IDEA
 */
public class Chapter10R3 {
    /*
        第2019个质数
     */
    public static void main (String[] args) {
        int count = 0;
        int num = 0;
        for (int i = 2 ; i < 1000000 ; i++) {
            boolean flag = true;
            //  注意
            for (int j =2 ; j <= Math.sqrt (i); j++) {
                //  如果能被整除就跳出
                if ((i % j)== 0){
                    flag = false;
                    break;
                }
            }
            if (flag ){
               count++;
               num = i;
            }
            if (count == 2019){
                System.out.println (num);
                break;
            }
        }


    }
}
