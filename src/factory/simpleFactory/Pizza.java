package factory.simpleFactory;

/**
 * 工厂的产品，此例中为披萨
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/22 20:44
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public abstract class Pizza {

    protected String type = "Default";

    public void prepare() {
        System.out.println(type + " Pizza prepare");
    }

    public void bake() {
        System.out.println(type + " Pizza bake");
    }

    public void cut() {
        System.out.println(type + " Pizza cut");
    }

    public void box() {
        System.out.println(type + " Pizza box");
    }

}
