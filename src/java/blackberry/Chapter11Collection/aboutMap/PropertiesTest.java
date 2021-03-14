package blackberry.Chapter11Collection.aboutMap;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    /**
     * Properties类：
     * properties类是HashTable的子类，该对象用于处理属性文件
     * 由于属性文件里面的key、value都是字符串类型，所以Properties里
     * 的key和value都是字符串类型的。
     * 在存取数据的时候，建议使用setProperty(String key, String value)方和和getProperty(String key, String value)方法
     */
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //  文件流
        try {
            //  文件输入流
            FileInputStream fileInputStream = new FileInputStream("JDBC.properties");
            //  加载对应的文件
            properties.load(fileInputStream);
            String name = properties.getProperty("name");
            String password = properties.getProperty("password");
            System.out.println("name = " + name + ", " + "password = " + password);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
