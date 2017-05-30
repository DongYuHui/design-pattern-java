package factory.methodFactory;

/**
 * 芝加哥风味蔬菜披萨
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/27 21:54
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Chicago veggie dough";
        sauce = "Chicago veggie sauce";

        toppings.add("Chicago veggie");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
