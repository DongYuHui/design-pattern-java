package state;

/**
 * 播放状态
 * - - -
 * Created on 2018-12-17 10:18
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class StartState implements State {
    @Override
    public void action(Context context) {
        context.setState(this);
        System.out.println("Player is starting");
    }
}
