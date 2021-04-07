package blackberry.Chapter13IOStream.File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class FileIntro1 {
    /**
     *  File类的判断功能
     *      public Boolean isDirectory()：判断是否是文件目录
     *      public boolean isFile()：判断是否是文件
     *      public boolean exists()：判断是否存在
     *      public boolean canRead()：判断是否可读
     *      public boolean canWrite()：判断是否可写
     *      public boolean isHidden()：判断是否隐藏
     *
     *
     *  File类的创建功能：
     *      public boolean createNewFile()：创建文件，若文件存在，则不创建，返回false
     *      public boolean mkdir()：创建文件目录，如果此文件目录存在就不创建
     *                              如果此文件目录的上层目录不存在，也不创建
     *      public boolean mkdirs()：创建文件目录，如果上层文件目录不存在，就一并创建
     *  File类的删除功能
     *      public boolean delete()：删除文件或者文件夹,删除的时候要注意，如果该文件有子文件或者子目录就不能删除成功
     *
     *      删除的注意事项：
     *          Java中删除不走回收站，要删除一个文件目录，要注意该文件目录内不能包含文件或文件目录
     *
     *
     *  总结：
     *      File类的使用：
     *          1、File类的对象，代表一个文件或者一个文件目录（文件夹）
     *          2、File类声明在Java.io包下面
     *          3、File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法
     *              并未涉及到写入或读取文件内容的操作，如果需要读取或写入文件内容，就需要使用IO流来完成
     *          4、后续File类的对象常会作为参数传递到流的构造器中，指明读取或写入的”终点“
     *
     */
    @Test
    public void test1(){
        File file = new File("hello.txt");
        System.out.println(file.isDirectory());

        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());
        //false
        //true
        //true
        //true
        //true
        //false
        System.out.println("-------------");
        File file1 = new File("D:\\IO");
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
        //true
        //false
        //true
        //true
        //true
        //false
    }

    //  public boolean createNewFile()：创建文件，若文件存在，则不创建，返回false
    @Test
    public void test2() throws IOException {
        File file = new File("hi.txt");
        //  文件不存在则创建
        if (!file.exists()){
            file.createNewFile();
            System.out.println("创建成功");
        }else {
            //  文件存在时，测试删除方法
            file.delete();
            System.out.println("删除成功！");

        }
    }

    //  public boolean mkdir()：创建文件目录，如果此文件目录存在就不创建
    @Test
    public void test3(){
        //  文件目录创建
        File file = new File("D:\\IO\\io1");
        boolean mkdir = file.mkdir();
        if (mkdir){
            System.out.println("创建成功1！");
        }

        File file1 = new File("D:\\IO\\io2");
        boolean mkdirs = file1.mkdirs();
        if (mkdirs){
            System.out.println("创建成功2！");
        }
        //  当上层目录都有时，两个方法没有区别
    }

    //  创建目录，当没有上层目录的时候
    @Test
    public void test4(){
        //  创建IO文件夹下，io1下面的io3文件夹，io1文件实际并没有
        File file = new File("D:\\IO\\io1\\io3");
        boolean mkdir = file.mkdir();
        if (mkdir){
            System.out.println("创建成功1！");
        }
        // 创建IO文件夹下，io1下面的io4文件夹，io1文件实际并没有
        File file1 = new File("D:\\IO\\io1\\io4");
        boolean mkdirs = file1.mkdirs();
        if (mkdirs){
            System.out.println("创建成功2！");
        }

        //  这种上层目录没有时，只有mkdirs才能创建上层io1，mkdir则无法创建成功上层文件夹io1

    }
}
