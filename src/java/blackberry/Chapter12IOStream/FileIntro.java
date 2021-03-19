package blackberry.Chapter12IOStream;

import org.junit.Test;

import java.io.File;

public class FileIntro {
    /**
     *  File类的使用:
     *  1、File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
     *  2、File类声明在Java.io包下
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
            2、相对路径于绝对路径




         */
    @Test
    public void test1(){
        //  绝对路径
        File file = new File("C:\\Users\\laboratory\\IdeaProjects\\JavaSE\\src\\java\\blackberry\\Chapter12IOStream\\test.txt");

        //相对路径
        File file1 = new File("test.txt");


    }
}
