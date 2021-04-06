package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.*;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/6/21 20:22
 * Create By IntelliJ IDEA
 */
public class ObjectSerializableTest {
    //  先将自定义类序列化存进文件
    @Test
    public void testObjectOutput(){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream (new FileOutputStream ("Object.dat"));
            objectOutputStream.writeObject (new String ("String类型"));
            objectOutputStream.flush ();
            objectOutputStream.writeObject (new PersonSerializable ("黎明",89));
            objectOutputStream.flush ();
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                assert objectOutputStream != null;
                objectOutputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }
    //  反序列化读取文件中的自定义类对象和基本数据类型
    @Test
    public void testObjectInput(){
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream (new FileInputStream ("Object.dat"));
            //  注意这里在反序列化读取的时候，就按照写入的时候那个顺序进行读取
            Object o1 = objectInputStream.readObject ();
            String str  = (String) o1;
            Object o2 = objectInputStream.readObject ();
            PersonSerializable p = (PersonSerializable) o2;
            System.out.println (str);
            System.out.println(p.toString ());
            //  如果name属性加上static之后就不能序列化PersonSerializable{name='null', age=89}
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace ();
        } finally {
            try {
                assert objectInputStream != null;
                objectInputStream.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }



    }
}
