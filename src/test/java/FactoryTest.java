import org.junit.Test;

/**
 * 工厂模式测试
 * ---
 * Created on 2018/12/12 09:29
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class FactoryTest {

    @Test
    public void testSimpleFactory() {
        factory.simpleFactory.SimplePizzaFactory factory = new factory.simpleFactory.SimplePizzaFactory();
        factory.simpleFactory.PizzaStore store = new factory.simpleFactory.PizzaStore(factory);
        store.orderPizza("cheese");
        store.orderPizza("clam");
        store.orderPizza("pepperoni");
        store.orderPizza("veggie");
    }

    @Test
    public void testMethodFactory() {
        factory.methodFactory.PizzaStore nyStore = new factory.methodFactory.NYStylePizzaStore();
        factory.methodFactory.PizzaStore chicagoStore = new factory.methodFactory.ChicagoStylePizzaStore();
        // NY Style Cheese Pizza
        factory.methodFactory.Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A ordered a " + pizza.getName());
        // Chicago Style Veggie Pizza
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("B ordered a " + pizza.getName());
    }

    @Test
    public void testAbstractFactory() {
        factory.abstractFactory.NYPizzaStore nyPizzaStore = new factory.abstractFactory.NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");
        //
        factory.abstractFactory.ChicagoPizzaStore chicagoPizzaStore = new factory.abstractFactory.ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza("clam");
    }

}
