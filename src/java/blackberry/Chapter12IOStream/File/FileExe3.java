package blackberry.Chapter12IOStream.File;

import java.io.File;
import java.io.FilenameFilter;

public class FileExe3 {
    /*
        练习题2：判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
     */
    public static void main(String[] args){
        File file = new File("D:\\IO\\io2");
        //  写法一：
//        String[] list = file.list();
//        for (String name:
//             list ) {
//            if (name.endsWith(".jpg")){
//                System.out.println(name);
//            }
//        }



        //  写法二：先获取listFiles，然后再调用getName方法进行判断
//        File[] files = file.listFiles();
//        for (File f :
//                files) {
//            if (f.getName().endsWith(".jpg")) {
//                System.out.println(f.getName());
//            }
//            }


        //  写法三：File类提供了两个文件过滤器的方法
        //  public String[] list(FilenameFilter filter)
        //  public File[] listFiles(FileFilter filter)

        //  过滤器，返回以.jpg结尾的文件
        File[] subFile = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
        //  遍历
        for (File f :
                subFile) {
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
        }


    }
}
