import org.junit.Before;
import org.junit.Test;
import singleton.DoubleCheckSingleton;
import singleton.EnumSingleton;
import singleton.StaticInnerSingleton;

/**
 * 单例模式测试
 * ---
 * Created on 2018/4/4 10:24
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class SingletonTest {

    private int count = 0;

    @Before
    public void initialize() {
        count = 10;
        System.out.println("count 10!");
    }

    @Test
    public void testDoubleCheckSingleton() {
        for (int i = 0; i < count; i++) {
            DoubleCheckSingleton singleton = DoubleCheckSingleton.getInstance();
            singleton.add(i + 1);
        }
    }

    @Test
    public void testStaticInnerSingleton() {
        for (int i = 0; i < count; i++) {
            StaticInnerSingleton singleton = StaticInnerSingleton.getInstance();
            singleton.add(i + 1);
        }
    }

    @Test
    public void testEnumSingleton() {
        for (int i = 0; i < count; i++) {
            EnumSingleton singleton = EnumSingleton.SINGLETON;
            singleton.add(i + 1);
        }
    }

}
