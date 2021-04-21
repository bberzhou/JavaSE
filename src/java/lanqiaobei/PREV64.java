package lanqiaobei;

import java.util.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/15/21 22:02
 * Create By IntelliJ IDEA
 */
public class PREV64 {
    /*
        成绩分析
     */
    public static void main (String[] args) {
        Scanner in = new Scanner (System.in);

        //  人数
        int len = in.nextInt ();
//        ArrayList<Integer> arrayList = new ArrayList<Integer> ();
//        for (int i = 0 ; i < len ; i++) {
//            int score = in.nextInt ();
//            if (score > 0 && score <=100){
//                arrayList.add (score);
//            }
//        }
//        Comparator<Integer> comp = new Comparator() {
//            @Override
//            public int compare (Object o1, Object o2) {
//                if ((int) o1> (int ) o2){
//                    return 1;
//                }
//                else return -1;
//            }
//        };
//        //  参数1：List,参数2：排序方式
//        Collections.sort (arrayList,comp);
//        System.out.println (arrayList.get (len-1));
//        System.out.println (arrayList.get (0));
//        int sum = 0;
//        for (Integer integer : arrayList) {
//            sum += integer;
//
//        }
//        double aver = (double) sum/arrayList.size ();
//        System.out.printf ("%.2f%n",aver);
        int[] arr = new int[len];
        int sum = 0;
        for (int i = 0 ; i < len ; i++) {
            int score = in.nextInt ();
            if (score >0 && score <=100){
                arr[i] = score;
                sum+=score;
            }
        }
        Arrays.sort (arr);
        //  最大值
        System.out.println (arr[len-1]);
        //  最小值
        System.out.println (arr[0]);
        //  均值
        double i = (double) sum / len;
        System.out.printf ("%.2f%n",i);
    }
}
