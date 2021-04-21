package lanqiaobei;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 4/17/21 20:11
 * Create By IntelliJ IDEA
 */
public class StringFormatTest {
    public static void main(String[] args){
        double a = 32.122223231;
        String format1 = String.format ("%.2f", a);
        String format2 = String.format ("%.4f", a);
        System.out.println (format1);
        System.out.println (format2);
        //32.12
        //32.1222


    }
}
