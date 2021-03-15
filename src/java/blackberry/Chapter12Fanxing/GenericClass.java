package blackberry.Chapter12Fanxing;

public class GenericClass<T> {
    /**
     *  自定义泛型类：测试
     */
    public String GenericClassName;
    public int orderId;

    // 在class加上泛型之后，就可以在类的内部结构可以使用类的泛型
    T orderT;
    public GenericClass(){};
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
