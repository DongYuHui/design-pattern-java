package strategy.example1;

/**
 * 吱叫声
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/06 10:27
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
