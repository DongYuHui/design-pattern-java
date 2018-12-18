import org.junit.Test;
import state.Context;
import state.PauseState;
import state.StartState;

/**
 * 测试状态模式
 * - - -
 * Created on 2018-12-17 10:19
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class StateTest {

    @Test
    public void testState() {
        Context context = new Context();    // 代表应用实例，此例中为播放器
        // start play
        StartState startState = new StartState();
        startState.action(context);
        // pause play
        PauseState pauseState = new PauseState();
        pauseState.action(context);
    }

}
