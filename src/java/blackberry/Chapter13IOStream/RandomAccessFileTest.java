package blackberry.Chapter13IOStream;

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
        随机存取文件流RandomAccessFile的使用：
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

            7、可以通过相关的操作，test5就用RandomAccessFile实现"插入"数据的效果


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
            //  移动游标，将指标调到角标为3的位置（第四个元素）
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

    //  利用seek在文件内容后面追加
    @Test
    public void test4RandomAccessSeekAppend(){
        RandomAccessFile randomAccessFile = null;
        try {
            //  造文件
            File file = new File ("test.txt");
            //  造随机访问流
            randomAccessFile = new RandomAccessFile (file,"rw");
            //  利用seek移动角标到文件末尾
            randomAccessFile.seek (file.length ());

            //  追加新的内容
            randomAccessFile.write ("追加的内容".getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                //  关闭流
                if (randomAccessFile != null) {
                    randomAccessFile.close ();
                }
            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }
    //  使用RandomAccessFile的seek来实现插入操作，但是不覆盖掉元素
    @Test
    public void test5RandomAccessSeekCopy() throws IOException {
        //  思路：先将需要插入位置后面的所有元素保存起来，插入之后，再将这些元素写进去
        RandomAccessFile randomAccessFile = new RandomAccessFile (new File ("test.txt"),"rw");

        //  利用seek将指针调到角标为3的位置，（实际是第四个元素，第三个元素后面）
        randomAccessFile.seek (3);

        //  保存指针3后面的所有数据到StringBuilder里面
        //  因为在test文件里面需要插入位置的后面还有很多元素，所以需要全部读出来。
        //  同时为了读取有多行数据，在每次读取之后可以追加到字符串后面，这里就可以就可以使用StringBuilder动态的追加数据
        //  同时还要保证这个动态字符串的长度不超过原来的file
        StringBuilder stringBuilder = new StringBuilder ((int) new File ("test.txt").length ());
        byte[] buffer = new byte[10];
        int len;
        while ((len = randomAccessFile.read (buffer)) != -1){
            //  转换为字符串
            String str= new String (buffer,0,len);
            //  追加到stringBuilder里面
            stringBuilder.append (str);
        }

        //  调回指针，写入需要写入的数据"利用指针插入不覆盖元素"
        randomAccessFile.seek (3);;
        //  getBytes方法，
        //  Encodes this String into a sequence of bytes using the given charset,
        //  storing the result into a new byte array.
        randomAccessFile.write ("利用指针插入不覆盖元素".getBytes(StandardCharsets.UTF_8));

        //  再将StringBuilder里面的内容写入到文件末尾，将字符数组转换为字节写入
        randomAccessFile.write (stringBuilder.toString ().getBytes(StandardCharsets.UTF_8));


        randomAccessFile.close ();


        //  思考：可以将StringBuilder替换为ByteArrayOutputStream

    }
}
