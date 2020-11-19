package blackberry.Chapter9String.StringBufferBuilder;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/19/20 21:08
 * Create By IntelliJ IDEA
 */
public class StringBufferTest1 {
    /**
     *  String、StringBuffer、StringBuilder三个效率对比
     *
     */

    public static void main (String[] args) {
        long startTime = 0L;
        long endTime = 0L;
        String text ="";
        StringBuffer buffer = new StringBuffer ("");
        StringBuilder builder = new StringBuilder ("");

        //  开始对比
        startTime = System.currentTimeMillis ();
        for (int i = 0 ; i < 20000 ; i++) {
            buffer.append (String.valueOf (i));
        }
        endTime = System.currentTimeMillis ();
        System.out.println("StringBuffer的执行时间"+(endTime -startTime));

        startTime = System.currentTimeMillis ();
        for (int i = 0 ; i < 20000 ; i++) {
            builder.append (String.valueOf (i));
        }
        endTime = System.currentTimeMillis ();
        System.out.println("StringBuilder的执行时间"+(endTime -startTime));

        startTime = System.currentTimeMillis ();
        for (int i = 0 ; i < 20000 ; i++) {
            text += i;
        }
        endTime = System.currentTimeMillis ();
        System.out.println("String的执行时间"+(endTime -startTime));

    }
}
