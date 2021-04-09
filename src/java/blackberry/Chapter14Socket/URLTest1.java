package blackberry.Chapter14Socket;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/8/21 14:45
 * Create By IntelliJ IDEA
 */
public class URLTest1 {
    @Test
    public void test() throws IOException {
        URL url = new URL ("https://image.baidu.com/search/detail?ct=503316480&z=0&tn=baiduimagedetail&ipn=d&cl=2&cm=1&sc=0&lm=-1&ie=gb18030&pn=4&rn=1&di=21450&ln=30&word=%CD%BC%C6%AC&os=1734869289,1419760751&cs=1986451467,394304688&objurl=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201410%2F20%2F20141020162058_UrMNe.jpeg&bdtype=0&simid=3499303705,267951404&pi=0&adpicid=0&timingneed=0&spn=0&is=0,0&fr=ala&ala=1&alatpl=adress&pos=1&oriquery=%E5%9B%BE%E7%89%87&hs=2&xthttps=000000");
        //  打开连接
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection ();
        //  获取连接
        urlConnection.connect ();
        //  连接之后获取输入流
        InputStream inputStream = urlConnection.getInputStream ();
        FileOutputStream fos = new FileOutputStream (new File ("URLTestFile.jpg"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read (buffer)) != -1){
            fos.write (buffer,0,len);
        }

        //  关闭资源
        inputStream.close ();
        fos.close ();
        urlConnection.disconnect ();
    }
}
