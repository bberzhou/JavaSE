package blackberry.day6DArray;

/**
 * @Description: Search
 * @author: bberzhou@gmail.com
 * @date: 4/7/20 09:38
 * Create By IntelliJ IDEA
 */
public class Array2TestSearch {
    /*
        数组的线性查找
     */
    public static void main (String[] args) {
        String[] arr = new String[]{"AA", "GG", "MM", "DD", "BB", "JJ"};
        //  需要匹配的字符串
        String dest = "BB";
        boolean isFlag = false;
        //  定义一个flag
        for (int i = 0 ; i < arr.length ; i++) {
            if (dest.equals (arr[i])) {
                System.out.println ("当前字符串在数组中的位置为" + (i + 1));
                //  如果找到之后就将flag置为true
                isFlag = true;
                //  如果找到之后就不继续执行，直接break跳出循环
                break;
            }
        }
        if (isFlag) {
            System.out.println ("在字符串中未找到！");
        }
    }
}
