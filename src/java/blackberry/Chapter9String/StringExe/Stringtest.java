package blackberry.Chapter9String.StringExe;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/17/20 17:34
 * Create By IntelliJ IDEA
 */
public class Stringtest {
    /**
     *  一道面试题
     */
    String str = new String ("good");
    char[] ch = {'t','e','s','t'};
    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'b';

    }

    public static void main (String[] args) {
        Stringtest stringtest = new Stringtest ();
        stringtest.change (stringtest.str,stringtest.ch);
        System.out.println(stringtest.str); //  good    调用change方法之后并没有改变str
        System.out.println(stringtest.ch);  //  best

        //  test ok best------->错误

        //  实际输出是good best
        //  值传递：基本数据类型传递的是数据，引用数据类型传递的是地址
    }
}
