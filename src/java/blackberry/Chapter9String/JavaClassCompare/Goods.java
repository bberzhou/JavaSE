package blackberry.Chapter9String.JavaClassCompare;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 11/25/20 19:50
 * Create By IntelliJ IDEA
 */
public class Goods implements Comparable{
    //  物资类
    private String name;
    private int price;

    public Goods () {
    }

    public Goods (String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public int getPrice () {
        return price;
    }

    public String getName () {
        return name;
    }

    @Override
    public String toString () {
        return "Goods{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }

    //   重写compareTo()方法，指明商品的排序方式
    //  重写compareTo()方法，指明商品比较大小的方式：按照价格从低到高,如果价格一样，在按照产品名称从低到高排序
    @Override
    public int compareTo (Object o) {
        System.out.println ("*******");
        //  一个对象和另外一个对象比较

        //  先判断是不是一个Goods对象
        if (o instanceof Goods){
            //  方式一：自己指定排序方式
            Goods goods = (Goods) o;    //  强转一下
            if (this.price > goods.price){ //  当前的price高于形参的price
                return 1;   //  当前对象this大于形参对象obj,则返回正整数，
            }else if (this.price < goods.price){
                return -1;  //  当前对象this小于形参对象obj,则返回负整数，
            }else {
                //  当两个商品的价格相同时，就按照good.name 排序
//                return 0;
                //  String里面重写的compareTo方法，默认是从低到高的排序，比较当前的和传入的两个Object
              return this.name.compareTo (goods.name);
//                return -this.name.compareTo (goods.name); //如果是这样的话，价格就是从高到低排序了
                //  这里能直接return是因为String类实现了Comparable接口，如果是继续比较其他的，可能还需要再嵌套比

            }
            //  方式二:因为包装类Double实现了Comparable接口，所以可以直接比较
//            return Double.compare (this.price,goods.price);
//            if (d1 < d2)
//                return -1;           // Neither val is NaN, thisVal is smaller
//            if (d1 > d2)
//                return 1;            // Neither val is NaN, thisVal is larger
        }

        throw new RuntimeException ("传入的数据类型不一致！");
    }
}
