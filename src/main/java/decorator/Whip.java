package decorator;

/**
 * Whip
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/16 21:27
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Whip extends CondimentDecorator {

    Beverage mBeverage;

    public Whip(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return mBeverage.cost() + 0.50;
    }

}
