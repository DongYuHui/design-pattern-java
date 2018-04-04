package strategy.example1;

/**
 * 具体鸭子实现类
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/06 10:32
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        mFlyBehavior = new FlyWithWings();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }

}
