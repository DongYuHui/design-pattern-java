package template;

/**
 * Created on 2018-12-14 09:42
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public abstract class Game {

    public final void play() {
        initial();
        startPlay();
        endPlay();
    }

    // 声明为 protected，这样当子类想自定义实现的时候也可以实现
    protected void initial() {
        System.out.println("Game Initialization");
    }

    abstract void startPlay();

    abstract void endPlay();

}
