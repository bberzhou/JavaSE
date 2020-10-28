package blackberry.day7OOP2;

/**
 * @Description: valueTransferTest2
 * @author: bberzhou@gmail.com
 * @date: 4/9/20 23:29
 * Create By IntelliJ IDEA
 */
public class ValueTransferTest2 {
    /*
        对于引用类型的值传递
        如果变量是引用数据类型，此时赋值的是变量所保存的数据的地址值

     */
    public static void main (String[] args) {
        Data data = new Data ();
        data.m = 10;
        data.n = 20;
        System.out.println ("交换前：" + "m=" + data.m + ",n=" + data.n); //  交换前：m=10,n=20
        ValueTransferTest2 valueTransferTest2 = new ValueTransferTest2 ();
        valueTransferTest2.swap (data);
        //  交换m和n的值
//        int temp = data.n;
//        data.n = data.m;
//        data.m = temp;
        System.out.println ("交换后：" + "m=" + data.m + ",n=" + data.n);//   交换后m=20,n=10


    }

    public void swap (Data data) {
        int temp = data.n;
        data.n = data.m;
        data.m = temp;
    }

}

class Data {
    int m;
    int n;
}