package blackberry.day7OOP2;

/**
 * @Description: methodArgs
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 23:12
 * Create By IntelliJ IDEA
 */
public class ValueTransferTest1 {
    /*
        方法里面的形参的传递机制：值传递
        1。形参：方法定义时，声明的小括号内的参数
           实参：方法在调用是，实际传递给形参的数据
        2。Java中参数传递的机制：值传递机制
           如果参数是基本数据类型，此时实参赋给形参的是，实参的真实存储的数据值
     */
    public static void main (String[] args) {
        //  交换两个变量的值的操作
        int m = 10;
        int n = 20;
//        int temp = m;
//        m = n;
//        n = temp;


        ValueTransferTest1 methodArgs = new ValueTransferTest1 ();
        //  这里传入的实际参数
        methodArgs.swap (m, n);
        System.out.println ("m=" + m + ",n=" + n);  //m=10,n=20
    }

    public void swap (int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println ("m=" + m + ",n=" + n);  //m=20,n=10

    }
}
