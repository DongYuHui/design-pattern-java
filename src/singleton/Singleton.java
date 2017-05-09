package singleton;

/**
 * 单例模式示例
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/09 21:02
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Singleton {

    /**
     * volatile 关键字确保：当 singleton 变量被初始化成 Singleton 实例时，多个线程正确地处理 singleton 变量
     */
    private volatile static Singleton singleton;

    /**
     * 该示例中用来计数用
     */
    private int mCount = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // 检查实例，如果不存在，就进入同步区块
        if (singleton == null) {
            // 注意，只有第一次才彻底执行这里的代码
            synchronized (Singleton.class) {
                // 进入区块后，再检查一次，如果仍是 null 才创建实例
                // 防止多个线程进入 if 语句块
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    /**
     * 该方法执行一次，计数就加一
     */
    public void action() {
        mCount++;
        System.out.println("Singleton Pattern " + mCount);
    }

}
