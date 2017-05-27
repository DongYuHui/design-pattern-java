package factory.method;

/**
 * 披萨店，抽象出来，这样每种风格的披萨店直接靠子类实例化，后续扩展也只需要直接继承该抽象类即可
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/27 21:48
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
