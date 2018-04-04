package factory.abstractFactory;

/**
 * Clam Pizza
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:45
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory mIngredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        mIngredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        mDough = mIngredientFactory.createDough();
        mSauce = mIngredientFactory.createSauce();
        mClam = mIngredientFactory.createClam();
    }

}
