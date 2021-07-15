package blackberry.Chapter12Fanxing;

public class GenericClass<T> {
    /**
     *  自定义泛型类：测试
     */
    public String GenericClassName;
    public int orderId;

    // 在class加上泛型之后，就可以在类的内部结构可以使用类的泛型
    //  orderT 这个成员变量的类型为T，T的类型由外部指定，在创建GenericClass类对象时候进行指定

    public T orderT;
    public GenericClass(){};

    //  泛型的构造方法里面，形参 orderT的类型也是 T， T的类型也是由外部指定的
    public GenericClass(String genericClassName,int orderId, T orderT){
        this.GenericClassName = genericClassName;
        this.orderId = orderId;
        this.orderT = orderT;
    };
    //
    //  T 也可以有相应的get set方法
    public void setOrderT(T orderT){
        this.orderT = orderT;
    }
    //  同样的道理，泛型方法getOrderT的返回值类型也是T，这个T的类型由外部来指定

    //泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
    //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
    public T getOrderT(){
        return orderT;
    }

    //  重写toString()方法
    @Override
    public String toString() {
        return "GenericClass{" +
                "GenericClassName='" + GenericClassName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }

    //  静态方法中不能使用类的泛型，就会报错
//    public static void show(){
//        System.out.println(orderT);
//    }

    //  编译不通过就会报错
//    public void show(){
//        try {
//
//        }catch (T t){
//
//        }
//    }
}
