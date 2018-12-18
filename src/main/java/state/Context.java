package state;

/**
 * 应用实例
 * - - -
 * Created on 2018-12-17 10:16
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Context {

    // 当前应用的状态
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
