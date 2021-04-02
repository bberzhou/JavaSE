package blackberry.Chapter12IOStream.File;

import org.junit.Test;

import java.io.File;
import java.util.Date;

public class FileIntro {
    /**
     * File类的使用:
     * 1、File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
     * 2、File类声明在Java.io包下
     */
          /*
            1、如何创建file类的实例
                1、public File(String pathname)
                    以pathname为路径创建File对象，可以是绝对路径或者相对路径，如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储
                    绝对路径：是一个固定的路径，从盘符开始
                    相对路径：是相对于某个位置开始
                2、public File(String parent, String child)
                    以parent为父路径，child为子路径
                3、public File(File parent, String child)
                    根据一个父File对象和子文件路径创建File对象
            2、相对路径与绝对路径
                相对路径：相较于某个路径下，指明的路径
                绝对路径：包含盘符在内的文件或文件夹目录

            3、路径分隔符
                Windows： \\
                Unix：/
                可以用.表示当前目录，  ..表示上级目录。
                可以使用FIle类自带的一个属性进行操作:File.separator




         */
    @Test
    public void test1() {
        //  构造器1 ：
        //  绝对路径
        //  注意Windows平台使用\作为路径分隔符，在Java字符串中需要用\\表示一个\。
        //  Linux平台或者URL中使用/作为路径分隔符
        File file5 = new File ("hell.txt"); //  相当于当前module
        File file = new File("C:\\Users\\laboratory\\IdeaProjects\\JavaSE\\src\\java\\blackberry\\Chapter12IOStream\\test.txt");

        //  所以为了防止在不同的系统分隔符错误的问题，使用FIle类自带的一个属性进行操作:File.separator
//        File file1 = new File("C:"+File.separator+"Users"+File.separator+
//                "laboratory"+File.separator+"IdeaProjects"+File.separator+
//                "JavaSE"+File.separator+"src"+File.separator+"java"+File.separator+
//                "blackberry"+File.separator+"Chapter12IOStream"+File.separator+"test.txt");

        //  注意：传入相对路径时，相对路径前面加上当前目录就是绝对路径：
        //相对路径
        File file1 = new File("test.txt");
        System.out.println(file);
        System.out.println(file1);
        //  输出结果：C:\Users\laboratory\IdeaProjects\JavaSE\src\java\blackberry\Chapter12IOStream\test.txt
        //test.txt


        //  构造器2 ：child可以是一个文件也可以是一个目录
        //  IdeaProjects可以是个文件也可以是个文件目录
        File file2 = new File("C:\\Users\\laboratory","IdeaProjects");
        System.out.println(file2);
        //  输出结果：C:\Users\laboratory\IdeaProjects


        //  构造器3：file2下面的一个JavaSE 文件
        File file3 = new File(file2,"JavaSE");
        System.out.println(file3);
        //  输出结果：C:\Users\laboratory\IdeaProjects\JavaSE

    }


    //  文件类的常用方法
    /*
        public String getAbsolutePath()：获取绝对路径
        public String getPath()：获取路径
        public String getName()：获取名称
        public String getParent()：获取上层文件目录路径，若无，返回null
        public long length()：获取文件长度（即：字节数），不能获取目录的长度
        public long lastModified()：获取最后一次的修改时间，毫秒值

        下面这两个方法适用于文件目录：
        public String[] list()：获取指定目录下的所有文件或者文件目录的名称数组
        Public File[] listFiles()：获取指定目录下的所有文件或者文件目录的File数组

     */
    @Test
    public void test2(){
        //  注意这里test.txt，要放到JavaSE 文件夹下面
        File file = new File("test.txt");
        File file1 = new File("D:\\IO\\hi.txt");
        //  测试File相关的方法
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        //  最后一次修改时间，返回的是一个毫秒数
        System.out.println(new Date(file.lastModified()));
        //  new Date(毫秒数)，返回的是Sat Mar 20 09:17:10 CST 2021




        System.out.println();
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        //输出结果：
        //C:\Users\laboratory\IdeaProjects\JavaSE\test.txt
        //test.txt
        //test.txt
        //null
        //0
        //0
        //
        //D:\IO\hi.txt
        //D:\IO\hi.txt
        //hi.txt
        //D:\IO
        //0
        //1616202368353

    }

    //  文件目录的测试
    @Test
    public void test3(){
        File file = new File("C:\\Users\\laboratory\\IdeaProjects");

        String[] list = file.list();
        for (String s :
                list) {
            System.out.println(s);
        }
        //  输出此文件夹下面的所有文件目录
        //  JavaSE
        //Test
        File[] files = file.listFiles();
        for (File o :
                files) {
            System.out.println(o);
        }
        //  两者输出的结果不一样
        //  JavaSE
        //Test
        //C:\Users\laboratory\IdeaProjects\JavaSE
        //C:\Users\laboratory\IdeaProjects\Test
    }

    /**
     *  File类的重命名功能，把文件重命名为指定的文件路径
     *  public boolean renameTo(File dest)：把文件重命名为指定的文件路径
     *  比如：file.renameTo(file2)为例
     *  要想保证返回true，需要file1在硬盘中是存在的，且file2不能在硬盘中存在
     */
    //  public boolean renameTo(File dest)：把文件重命名为指定的文件路径
    @Test
    public void test4(){
        File file1 = new File("test.txt");
        File file2 = new File("D:\\IO\\hi.txt");
        //  此方法相当于是：将文件file2重命名为file1，并且将内容也复制过去，然后删除文件file2
        boolean b = file2.renameTo(file1);
        System.out.println(b);  //  false

    }



}
