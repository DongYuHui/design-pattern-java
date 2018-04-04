package factory.abstractFactory;

/**
 * 纽约披萨商店
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:49
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
