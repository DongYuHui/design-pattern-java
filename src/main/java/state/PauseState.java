package state;

/**
 * 暂停状态
 * - - -
 * Created on 2018-12-17 10:19
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class PauseState implements State {
    @Override
    public void action(Context context) {
        context.setState(this);
        System.out.println("Player is pausing");
    }
}
