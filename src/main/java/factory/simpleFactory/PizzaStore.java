package factory.simpleFactory;

/**
 * 披萨店，用于生成订单生产披萨
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/22 20:53
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class  PizzaStore {

    private SimplePizzaFactory mFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        mFactory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = mFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
