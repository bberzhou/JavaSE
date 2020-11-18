package blackberry.Chapter9String.StringApi;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/17/20 19:54
 * Create By IntelliJ IDEA
 */
public class StringApi1 {
    /**
     *  String 类相关API
     *  int length()
     *  char charAt(int index ):返回某索引出的字符
     *  boolean isEmpty()
     *  String toLowerCase()
     *  String toUpperCase()
     *  String trim()：返回字符串的副本，忽略前导空白和尾部空白
     *  boolean equals(Object obj)
     *  boolean equalsIgnoreCase(String str)
     *  String concat(String str)：将指定字符串链接到此字符串的结尾 == +
     *  int compareTo()：比较字符串大学
     *  String substring(int beginIndex)：截取从beginIndex开始
     *  String substring(int beginIndex,int endIndex)：截取从beginIndex开始，到endIndex结束
     *
     */
    public static void main (String[] args) {
        String str = "hello";
        System.out.println(str.length ());

        System.out.println(str.charAt (3));

        System.out.println(str.isEmpty ());

        System.out.println(str.toLowerCase ());

        System.out.println(str.toUpperCase ());

        System.out.println(str.toLowerCase ());

        String s3 = "   he  ll  o  ";
        String s4 = s3.trim ();
        System.out.println("----"+s3+"-----");  //  ----   he  ll  o  -----
        System.out.println("----"+s4+"-----");  //  ----he  ll  o-----  //从这里也可以看出s3并没有被修改
        //  equals比较的是内容

        System.out.println(s3.compareTo (s4));      //-72   涉及到字符串排序

        System.out.println("--------");
        System.out.println(str.substring (2));  //  llo

        System.out.println(str.substring (1,3));    //  el 左闭右开



    }
}
