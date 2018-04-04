package strategy.example1;

/**
 * 飞行实现类
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/06 10:23
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings.");
    }
}
