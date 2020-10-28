package blackberry.exercise.Project05Team.Domain;

/**
 * @Description:
 * @author: bberzhou@gmail.com
 * @date: 9/28/20 21:26
 * Create By IntelliJ IDEA
 */
public class Notebook implements Equipment {
    private String model;   //  机器型号
    private double price;   //  机器价格

    public Notebook (double price) {
        this.price = price;
    }

    //  空参构造器
    public Notebook () {
    }

    public Notebook (String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    //  实现接口方法
    @Override
    public String getDescription () {
        return model + "(" + price + ")";
    }
}
