package strategy.example1;

/**
 * 没有叫声，实现类
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/06 10:26
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
