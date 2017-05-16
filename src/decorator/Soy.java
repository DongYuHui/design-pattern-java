package decorator;

/**
 * Soy
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/16 21:26
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Soy extends CondimentDecorator {

    Beverage mBeverage;

    public Soy(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 0.30;
    }

}
