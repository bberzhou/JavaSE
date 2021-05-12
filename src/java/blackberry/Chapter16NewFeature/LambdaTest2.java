package blackberry.Chapter16NewFeature;

import org.junit.Test;

import java.util.function.Consumer;

public class LambdaTest2 {
    /*
        JAVA 内置的4大核心的函数式接口
        1、消费型接口 Consumer<T > void accept(T t)
        2、供给型接口 Supplier<T >  T   get()
        3、函数型接口 Function<T，R> R apply(T t)
        4、断定型接口 Predicate<T > boolean test(T t)
     */
    @Test
    public void testConsumer(){
        //  以前的写法
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("价格为："+aDouble);
            }
        });
        System.out.println("****************************");

        //  使用Lambda表达式的写法
        happyTime(500,( money )-> System.out.println("价格为："+money));

    }
    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
}
