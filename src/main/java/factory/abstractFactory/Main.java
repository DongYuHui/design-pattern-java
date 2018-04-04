package factory.abstractFactory;

/**
 * 抽象工厂模式示例
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:06
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("clam");

    }

}
