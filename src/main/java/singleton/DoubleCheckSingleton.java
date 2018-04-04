package singleton;

/**
 * 单例模式：双重检查锁
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/09 21:02
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class DoubleCheckSingleton implements SingletonAddable {

    /**
     * volatile 关键字确保：当 singleton 变量被初始化成 DoubleCheckSingleton 实例时，多个线程正确地处理 singleton 变量
     * volatile 关键字的其中一个作用：防止指令重排序
     */
    private volatile static DoubleCheckSingleton singleton;

    /**
     * 使用双重检查锁的方式无法解决序列化操作
     */
    private DoubleCheckSingleton() {
        System.out.println("Double Check Singleton initialized");
    }

    public static DoubleCheckSingleton getInstance() {
        // 检查实例，如果不存在，就进入同步区块
        if (singleton == null) {
            // 注意，只有第一次才彻底执行这里的代码
            synchronized (DoubleCheckSingleton.class) {
                // 进入区块后，再检查一次，如果仍是 null 才创建实例
                // 防止多个线程进入 if 语句块
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }

    // = = = = = = =

    /**
     * 该示例中用来计数用
     */
    private int count = 0;

    public void add(int number) {
        count = count + number;
        System.out.println("after add result : " + count);
    }

}
