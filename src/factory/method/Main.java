package factory.method;

/**
 * 工厂方法模式示例
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/27 20:50
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("A ordered a " + pizza.getName());

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("B ordered a " + pizza.getName());

    }

}
