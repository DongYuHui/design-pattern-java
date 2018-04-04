package factory.simpleFactory;

/**
 * 简单工厂演示
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/22 20:42
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Main {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("cheese");
        store.orderPizza("clam");
        store.orderPizza("pepperoni");
        store.orderPizza("veggie");
    }

}
