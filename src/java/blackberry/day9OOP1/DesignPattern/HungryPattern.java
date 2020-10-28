package blackberry.day9OOP1.DesignPattern;

/**
 * @Description: 饿汉式单例模式
 * @author: bberzhou@gmail.com
 * @date: 4/25/20 17:27
 * Create By IntelliJ IDEA
 */
public class HungryPattern {
    public static void main (String[] args) {
        Book b = Book.getBook ();
        Book b1 = Book.getBook ();
        System.out.println (b == b1);
    }
}

//  饿汉式
class Book {
    //  空参构造器
    private Book () {

    }

    private static Book book = new Book ();

    public static Book getBook () {
        return book;
    }
}
