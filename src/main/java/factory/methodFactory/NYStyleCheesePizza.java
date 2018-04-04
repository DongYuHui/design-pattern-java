package factory.methodFactory;

/**
 * 纽约风格芝士披萨
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/27 21:42
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Cheese Pizza";
        dough = "NY dough";
        sauce = "NY Sauce";

        toppings.add("NY cheese");
    }

}
