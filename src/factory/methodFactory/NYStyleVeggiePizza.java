package factory.methodFactory;

/**
 * 纽约风格蔬菜披萨
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/27 21:51
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "NY dough";
        sauce = "NY Sauce";

        toppings.add("MY veggie");
    }

}
