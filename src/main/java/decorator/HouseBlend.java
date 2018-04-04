package decorator;

/**
 * HouseBlend
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/16 21:24
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        mDescription = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }

}
