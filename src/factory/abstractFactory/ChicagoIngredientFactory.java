package factory.abstractFactory;

/**
 * 用于生成芝加哥风味披萨所需的原料工厂
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:55
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }

    @Override
    public Clam createClam() {
        return new ChicagoClam();
    }
}
