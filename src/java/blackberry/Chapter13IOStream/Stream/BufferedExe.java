package blackberry.Chapter13IOStream.Stream;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BufferedExe {
    /*
        缓冲流练习题：
            1、分别使用节点流：FileInputStream、FileOutputStream和缓冲流：
                BufferedInputStream、BufferedOutputStream实现文本文件、图片、视频文件的复制，并比较二者在数据复制方面的效率
                BufferedInputStream、BufferedOutputStream实现文本文件的复制，不要在复制的时候去读取
            2、实现图片加密操作：
                提示：
                    int b = 0;
                    while((b = fis.read()) != -1){
                    fos.write(b^5);
                    }

            3、获取文本上每个字符出现的次数
                提示：遍历文本的每一个字符：字符及出现的次数保存再Map中，将Map中的数据写入文件
     */

    //  对图片进行加密
    @Test
    public void testQ1() throws IOException {
        //  图片的加密
        FileInputStream fis = new FileInputStream(new File("newSrc.jpg"));
        //  也可以直接利用FileInputStream的另外一个构造器
//        FileInputStream fis = new FileInputStream("newSrc.jpg");
        FileOutputStream fos = new FileOutputStream(new File("srcSecret.jpg"));

        byte[] buffer = new byte[30];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            //  对字节数据进行修改以体现加密
            //  注意这里修改的时候，不能使用增强for循环
//            for (byte b :
//                    buffer) {
            //  这样修改了b之后，实际并没有修改
//                b = (byte) (b^5);
//            }
            //  正确的,把数组里面的每一个元素做一个亦或运算
            for (int i = 0; i < len; i++) {
                buffer[i] = (byte) (buffer[i] ^ 5);

            }
            //  把修改完之后的再进行一个写入操作
            fos.write(buffer, 0, len);


        }
        //  关闭资源
        fos.close();
        fis.close();
    }

    //      对图片进行解密，与上面的测试相反
    @Test
    public void testQ2() throws IOException {
        //  图片的加密
        FileInputStream fis = new FileInputStream(new File("srcSecret.jpg"));
        //  也可以直接利用FileInputStream的另外一个构造器
//        FileInputStream fis = new FileInputStream("newSrc.jpg");
        FileOutputStream fos = new FileOutputStream(new File("srcDecrypt.jpg"));

        byte[] buffer = new byte[20];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            //  对字节数据进行修改以体现加密
            //  注意这里修改的时候，不能使用增强for循环
//            for (byte b :
//                    buffer) {
            //  这样修改了b之后，实际并没有修改
//                b = (byte) (b^5);
//            }
            //  正确的,把数组里面的每一个元素做一个亦或运算
            for (int i = 0; i < len; i++) {
                buffer[i] = (byte) (buffer[i] ^ 5);
                //  注意这里的异或操作，异或的异或等于自己本身，所以解密的时候，再进行一次异或操作即可

            }
            //  把修改完之后的再进行一个写入操作
            fos.write(buffer, 0, len);


        }
        //  关闭资源
        fos.close();
        fis.close();
    }

    @Test
    /*
        获取文本上每个字符出现的次数
            提示：遍历文本的每一个字符：字符及出现的次数保存再Map中，将Map中的数据写入文件

            思路：
                1、遍历文本每一个字符
                2、字符出现的次数存在Map中
                    Map<Character, Integer> map = new HashMap(Character, Integer)();
                    map.put();
                3、把map中的数据写入文件
     */
    public void testQ3() throws IOException {
        //  1、创建流
        FileReader fr = new FileReader(new File("new.txt"));

        //  2、创建一个Map集合,Character存放字符，Integer存放个数
        Map<Character, Integer> map = new HashMap<>();

        //  3、遍历每一个字符，每一个字符出现的次数放到map中
        int len;
        while ((len = fr.read()) != -1) {
            //  int 还原为char
            char ch = (char) len;

            //  判断char是否在map中第一次出现

            if (map.get(ch) == null) {
                //  如果没出现过，就把它添加到map中
                map.put(ch, 1);
            } else {
                //  如果存在，则进行加1操作，因为map在存放相同key的元素时，
                //  会自动把相同key的前一个value值覆盖掉
                map.put(ch, map.get(ch) + 1);
            }
        }

        //  4、把Map中的数据存在文件WordCount.txt中去
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("WordCount.txt"));
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        //  遍历map
        for (Map.Entry<Character, Integer> entry :
                entries) {
            switch (entry.getKey()) {
                case ' ':
                    //
                    bufferedWriter.write("空格=" + entry.getKey());
                    break;
                    //   制表符的情况
                case '\t':
                    bufferedWriter.write("tab键="+entry.getValue());
                case '\r':
                    bufferedWriter.write("回车="+entry.getValue());
                case '\n':
                    bufferedWriter.write("换行="+entry.getValue());
                default:
                    //  普通字符的情况
                    bufferedWriter.write(entry.getKey()+"="+entry.getValue());
            }
            //  写完一个之后换一个行
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fr.close();
    }

}
