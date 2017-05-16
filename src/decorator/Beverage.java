package decorator;

/**
 * 基础组件
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/16 21:20
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public abstract class Beverage {

    String mDescription = "Unknown Beverage";

    public String getDescription() {
        return mDescription;
    }

    public abstract double cost();

}
