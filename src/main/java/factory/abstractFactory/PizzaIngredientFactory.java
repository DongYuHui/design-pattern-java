package factory.abstractFactory;

/**
 * 用于生成各种披萨原料的工厂抽象类
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:27
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public interface PizzaIngredientFactory {

    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Clam createClam();

}
