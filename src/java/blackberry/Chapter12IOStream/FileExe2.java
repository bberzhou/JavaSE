package blackberry.Chapter12IOStream;

import java.io.File;

public class FileExe2 {
    /*
        遍历指定目录下所有文件名称，包括子文件目录中的文件
            拓展1：并计算指定目录占用空间的大小
            拓展2：删除指定文件目录及其下的所有文件
     */
    public static void main(String[] args) {

        //  打印出指定目录所有文件名称，包括子文件目录中的文件

        //  1、创建目录对象,输出此目录下的所有文件和文件目录
        File file = new File("D:\\IO");

        //  2、打印目录的子文件
//        printSubFile(file);

//        FileExe2 fileExe2 = new FileExe2();
//        fileExe2.listSubFile(file);

        listAllSubFiles(file);

    }
    //  递归实现
    public static void printSubFile(File dir){
        File[] files = dir.listFiles();
        for (File f :
                files) {
            //  如果是文件目录
            if (f.isDirectory()){
                //  就递归调用打印出来
                printSubFile(f);
            }else {
                //  文件的话，就直接输出
                System.out.println(f.getAbsolutePath());
            }
        }
    }
    //  输出结果
    //D:\IO\io1\haha.txt
    //D:\IO\io1\hello.txt
    //D:\IO\io2\QQ图片20210312214503.jpg
    //D:\IO\io2\QQ图片20210319134036.png


    //  循环实现
    public void listSubFile(File file){
        if (file.isDirectory()){
            String[] list = file.list();
            for (String st :
                    list) {
                System.out.println(st);
            }
        }else {
            System.out.println(file+"是文件");
        }

    }


    //  循环实现
    public static void listAllSubFiles(File file){
        if (file.isFile()){
            System.out.println(file);
        }else {
            File[] file1 = file.listFiles();
            //  如果file1[1]是文件，直接打印
            //  如果file1[1]是目录，接着再获取它的下一级
            for (File f :
                    file1) {
                listAllSubFiles(f);
            }
        }
    }
}
