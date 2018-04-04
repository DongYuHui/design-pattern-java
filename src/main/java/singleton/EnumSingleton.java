package singleton;

/**
 * 单例模式：枚举
 * ---
 * Created on 2018/4/4 10:38
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public enum EnumSingleton implements SingletonAddable {

    SINGLETON;

    /**
     * Effective Java 推荐使用这种方式，但是并不常见
     * 需要注意：
     * 枚举方式不能延迟加载
     */
    EnumSingleton() {
        System.out.println("Enum Singleton initialized");
    }

    // = = = = = = =

    private int count = 0;

    public void add(int number) {
        count = count + number;
        System.out.println("after add result : " + count);
    }

}
