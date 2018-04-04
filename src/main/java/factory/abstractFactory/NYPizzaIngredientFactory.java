package factory.abstractFactory;

/**
 * 用于生成纽约风格披萨的原料工厂
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:35
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new NYClam();
    }
}
