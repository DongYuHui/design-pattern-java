package decorator;

/**
 * Mocha
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/16 21:25
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Mocha extends CondimentDecorator {

    Beverage mBeverage;

    public Mocha(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 0.20;
    }
}
