package lanqiaobei;
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //  输入数组长度
        int n = in.nextInt();
        //  判断是否符合要求
        if (n >=1 && n <=200){
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                int temp = in.nextInt();
                if (Math.abs(temp)< 10000){
                    //  给数组元素赋值
                    a[i]=temp;
                }else {
                    return;
                }
            }
            //  对数组进行从小到大排序
            for(int j=0; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(a[j]>a[k]){
                        int tt = a[k];
                        a[k] = a[j];
                        a[j] = tt;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+ " ");
            }
        }
    }
}

