package blackberry.Chapter12IOStream;

import java.io.File;
import java.io.IOException;

public class FileExe {
    /*
          问题一、文件练习题目：
          创建一个与file同目录下的另外一个文件，文件名为：haha.txt

          问题二、利用File构造器，new 一个文件目录file
            1）在其中创建多个文件和目录
            2）编写方法，实现删除file中指定文件的操作
     */
    public static void main(String[] args) throws IOException {
        // 问题一
//        File file = new File("D:\\IO\\io1\\hello.txt");

        //  写法一：
//        String parent = file.getParent();
//        File file1 = new File(parent+File.separator+"haha.txt");
//        boolean newFile = file1.createNewFile();
//        if (newFile){
//            System.out.println("创建成功");
//        }

        //  写法二：
//        File destFile = new File(file.getParent(),"haha1.txt");
//        boolean newFile = destFile.createNewFile();
//        if (newFile){
//            System.out.println("创建成功！");
//        }


        // 问题二、
        File file = new File("D:\\IO\\io2");
        boolean mkdir = file.mkdir();
        if (!mkdir){
            System.out.println("创建成功！");
        }
    }
}
