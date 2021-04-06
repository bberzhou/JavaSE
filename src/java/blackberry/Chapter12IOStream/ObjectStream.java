package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/6/21 19:27
 * Create By IntelliJ IDEA
 */
public class ObjectStream {
    /*
        对象流的使用：
            ObjectInputStream和ObjectOutputStream
            用于存储和读取基本数据类型数据或者对象的处理流，可以将java中的对象写入到数据源中，也可以把对象从数据源中还原回来

            序列化：用ObjectOutputStream类保存基本类型数据或对象的机制
            反序列化：用ObjectInputStream类读取基本类型数据或对象的机制

            注意：ObjectInputStream和ObjectOutputStream不能序列化static和transient修饰的成员变量

            对象的序列化：
            对象的序列化机制允许把内存中的java对象转换成平台无关的二进制流，从而允许把这种二进制流持久地保存在磁盘上
            或通过网络将这种二进制流传输到另外一个网络节点。---序列化的过程
            当其他程序获取这种二进制流，就可以恢复成原来的java对象---- 反序列化的过程

            序列化的好处在于可将任何实现了Serializable接口的对象转换为字节数据，使其在保存和传输时可以被还原
            序列化是RMI（Remote Method Invoke-远程方法调用）过程的参数和返回值都必须实现的机制，
            而RMI是javaEE的基础，因此序列化机制是JavaEE平台的基础

            如果需要让某个对象支持序列化机制，则必须让对象所属的类及其属性是可序列化的，为了让某个类是可序列化的，
            该类必须实现如下两个接口之一。否则会抛出NotSerializableException异常


     */

    /*
        序列化过程：将内存中的Java对象保存到磁盘中或通过网络传输出去
        使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream (new FileOutputStream ("Object.dat"));
            //  这里就是通过序列化的方式将一个String类型的对象给存入到内存中去
            objectOutputStream.writeObject (new String ("测试持久化对象"));
            objectOutputStream.flush ();    //  刷新操作
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }


    /*
        反序列化的过程：将磁盘文件中的对象还原为内存中的一个Java对象
        使用ObjectInputStream来实现
     */

    @Test
    public void testObjectInputStream(){
        //  造流
        ObjectInputStream objectInputStream = null;
        Object  o = null;
        try {
            //  读取文件
            objectInputStream = new ObjectInputStream (new FileInputStream ("Object.dat"));
            o = objectInputStream.readObject ();
            //  强转
            String str = (String) o;
            //  输出字符串
            System.out.println (str);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace ();
        } finally {
            try {
                assert objectInputStream != null;
                //  关闭流
                objectInputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }


    }





















}
