package blackberry.Chapter13IOStream.File;

import java.io.File;

public class FileExe1 {
    /*
        判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称

     */
    public static void main(String[] args) {
        File file = new File("D:\\IO\\io2");
        String[] list = file.list();
        for (int i = 0; i < list.length; i++) {
            //  String的endWith()方法
            if (list[i].endsWith(".jpg")){
                System.out.println(list[i]);
                //  QQ图片20210312214503.jpg
            }
        }
    }
}
