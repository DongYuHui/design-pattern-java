package strategy.example1;

/**
 * Model Duck
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/06 10:33
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
