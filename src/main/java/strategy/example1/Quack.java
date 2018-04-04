package strategy.example1;

/**
 * 默认叫声实现类
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/06 10:25
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
