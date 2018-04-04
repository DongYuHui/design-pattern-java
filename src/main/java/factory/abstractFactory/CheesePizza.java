package factory.abstractFactory;

/**
 * Cheese Pizza
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:42
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory mIngredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        mIngredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        mDough = mIngredientFactory.createDough();
        mSauce = mIngredientFactory.createSauce();
        mCheese = mIngredientFactory.createCheese();
    }

}
