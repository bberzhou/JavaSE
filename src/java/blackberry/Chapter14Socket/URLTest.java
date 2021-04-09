package blackberry.Chapter14Socket;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/8/21 13:14
 * Create By IntelliJ IDEA
 */
public class URLTest {
    /*
        URL:Uniform Resource Locator：统一资源定位符，它表示Internet上某一个资源的地址
            URL的基本结构由5部分组成
                <传输协议>://<主机名>:<端口号>/<文件名>#片段名?参数列表
     */
    @Test
    public void testURL(){
        try {
            URL url = new URL ("https://www.baidu.com/");

            //  public String getProtocol()     :获取该URL的协议名
            System.out.println (url.getProtocol ());
            //  public String getHost()     :   获取该URL的主机名
            System.out.println (url.getHost ());
            //  public String getPath()     :   获取该URL的文件路径
            System.out.println (url.getPath ());
            //  public String getFile()     :   获取该URL的文件名
            System.out.println (url.getFile ());
            //  public String getQuery()    :   获取该URL的查询名
            System.out.println (url.getQuery ());
            //  Returns:the authority part of this URL
            System.out.println (url.getAuthority ());

        } catch (MalformedURLException e) {
            e.printStackTrace ();
        }


    }
}
