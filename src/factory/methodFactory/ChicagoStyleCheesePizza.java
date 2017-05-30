package factory.methodFactory;

/**
 * 芝加哥风味芝士披萨
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/27 21:44
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Chicago dough";
        sauce = "Chicago sauce";

        toppings.add("Chicago Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
