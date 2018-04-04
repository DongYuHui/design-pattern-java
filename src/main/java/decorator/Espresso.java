package decorator;

/**
 * Espresso
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/16 21:23
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Espresso extends Beverage {

    public Espresso() {
        mDescription = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }

}
