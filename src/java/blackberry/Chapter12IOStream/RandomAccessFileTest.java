package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/6/21 21:14
 * Create By IntelliJ IDEA
 */
public class RandomAccessFileTest {
    /*
        随机存取文件流：
           1、 RandomAccessFile类声明在Java.io包下，但直接继承于java.lang.Object类，并且它实现了
               DataInput、DataOutput这两个接口，
           2、 也就意味着这个类既可以读也可以写，就是既可以输入流也可以输出流
           3、 RandomAccessFile类支持"随机访问"的方式，程序可以直接跳到文件的任意地方来读、写文件
                支持只访问文件的部分内容
                可以向已存在的文件后追加内容

           4、 RandomAccessFile对象包含一个记录指针，用来标示当前读写处的位置
           5、RandomAccessFile类对象可以自由移动记录指针：
                long getFilePointer()：获取文件记录指针的当前位置
                void seek(long pos)：将文件记录指针定位到pos位置

           6、如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建；
                如果写出到的文件存在，则会对原有文件内容进行覆盖操作，（默认情况下，是从头开始覆盖，）
                例如：test2里面的  ： 覆盖之后：xyst class； 原来的内容：test class

            7、


     */
    @Test
    public void test1(){
        /*
           构造器：
                public RandomAccessFile(File file, String mode)
                public RandomAccessFile(String name, String mode)

            创建RandomAccessFile类实例需要指定一个mode参数，该参数指定RandomAccessFile的访问模式
                r：以只读方式打开
                rw：打开以便读取和写入
                rwd：打开以便读取和写入；同步文件内容的更新
                rws：打开以便读取和写入；同步文件内容和元数据的更新


             如果模式为只读r。则不会创建文件，而是会去读取一个已经存在的文件，
             如果读取的文件不存在则会出现异常。
             如果模式为rw读写，如果文件不存在则会创建文件，如果不存在就不会创建


         */
        //  分别测试不同的mode，r和rw
        RandomAccessFile randomAccessFile = null;
        RandomAccessFile randomAccessFile1 = null;
        try {
            //  1
            randomAccessFile = new RandomAccessFile (new File ("Photo.jpg"),"r");
            randomAccessFile1 = new RandomAccessFile (new File ("PhotoAccess.jpg"),"rw");
            //  因为RandomAccessFile可以做输入输出流
            byte[] buffer= new byte[1024];
            int len;
            //  2、字节流
            while ((len = randomAccessFile.read (buffer)) != -1){
                randomAccessFile1.write (buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                //  3、
                assert randomAccessFile1 != null;
                randomAccessFile1.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
            try {
                randomAccessFile.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
    }


    //  测试对文件的覆盖或者文件内容的追加
    @Test
    public void test2RandomAccess(){
        RandomAccessFile randomAccessFile = null;
        try {
            //  因为test1.txt文件不存在，所以在执行的时候会自动创建这个文件，并将数据写入进去
//            randomAccessFile = new RandomAccessFile (new File ("test1.txt"),"rw");

            //  测试当文件存在的时候的情况，
            randomAccessFile = new RandomAccessFile (new File ("test.txt"),"rw");
            //  往test1.txt文件里面写入数据
            //  在Java中，String的getBytes()方法是得到一个操作系统默认的编码格式的字节
            randomAccessFile.write ("xys".getBytes(StandardCharsets.UTF_8));
            //  覆盖之后：xyst class； 原来的内容：test class

        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
        //  关闭流

    }

    //  seek方法测试()
    @Test
    public void test3RandomAccessSeek(){
        //  实现在test.txt文件里面的内容，第三个字符后面开始覆盖内容
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile (new File ("test.txt"),"rw");
            //  移动游标
            randomAccessFile.seek (3);  //  将指针掉到角标为3的位置再进行覆盖

            randomAccessFile.write ("xyza".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                assert randomAccessFile != null;
                randomAccessFile.close ();
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }
        //  覆盖之后的结果：xysxyzaass
    }
}
