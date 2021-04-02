package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 3/29/21 10:08 PM
 * Create By IntelliJ IDEA
 */
public class StandardStream {
    /*
        其他流的使用：
            1、标准输入输出流：
            2、打印流
            3、数据流

     */
    public static void main(String[] args) throws IOException {
        /*
            1、标准的输入、输出流
             1.1 System.in：标准的输入流，默认从键盘输入
                System.out：标准的输出流，默认从控制台输出
             1.2
                System类的setIn(InputStream is )和setOut(PrintStream ps)方式可以重新指定输入和输出的流

             1.3练习：
                从键盘输入字符串，要求将读取到的整行字符串转换成大写输出，然后继续进行输入操作
                直至当输入"e"或者"exit"的时候，退出程序

                方法一：使用Scanner来实现,调用next()返回一个字符串
                方法二：使用System.in来实现。System.in---->转换流------->BufferedReader的ReadLine()方法
         */

        //  转换流，从键盘输入
        InputStreamReader inputStreamReader = new InputStreamReader (System.in);
        BufferedReader bufferedReader = new BufferedReader (inputStreamReader);

        while (true){
            System.out.println ("请输入字符串：");
            String data = bufferedReader.readLine ();
            //  为了避免空指针异常
//            if (data.equalsIgnoreCase ("e")|| data.equalsIgnoreCase ("exit")){
//                break;
//            }
            if ("e".equalsIgnoreCase (data) || "exit".equalsIgnoreCase (data)){
                break;
            }else {
                String uppercase = data.toUpperCase ();
                System.out.println (uppercase);
            }

        }
        bufferedReader.close ();

    }

    /*
        2、打印流：PrintStream和PrintWriter
            2.1提供了一系列重载的print()和println()方法

     */
    @Test
    public void test(){
        
    }

    /*
        3、数据流
            3.1 DataInputStream和DataOutputStream
                用于读取或写出基本数据类型的变量或者字符串
     */

    @Test
    public void test3(){
//        DataOutputStream dataOutputStream = new DataOutputStream (new FileOutputStream (""))
    }
}
