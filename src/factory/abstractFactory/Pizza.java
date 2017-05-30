package factory.abstractFactory;

/**
 * Pizza
 * ---
 * All Rights Reserved by Author
 * Created on 2017/5/30 下午5:37
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public abstract class Pizza {

    String name;
    Dough mDough;
    Sauce mSauce;
    Cheese mCheese;
    Clam mClam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
