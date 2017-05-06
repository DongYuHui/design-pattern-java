package strategy.example1;

/**
 * 飞行实现类
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/06 10:24
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
