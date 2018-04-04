package singleton;

/**
 * 单例模式：内部静态类
 * ---
 * Created on 2018/4/4 10:27
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class StaticInnerSingleton implements SingletonAddable {

    /**
     * 注意点：
     * 类的静态代码块，静态成员变量在加载类时候会被直接初始化
     * 而类的静态内部类则不会加载，知道使用的时候才会加载
     * 可以使用该特性实现比‘双重检查锁’更合适的单例模式
     * 需要注意的是，如果有序列化要求，则应该使用枚举类，只不过使用枚举类会消耗更多的内存
     */
    private static class SingletonHolder {
        private static StaticInnerSingleton singleton = new StaticInnerSingleton();
    }

    private StaticInnerSingleton() {
        System.out.println("Static Inner Singleton initialized");
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    // = = = = = = =

    private int count = 0;

    public void add(int number) {
        count = count + number;
        System.out.println("after add result : " + count);
    }

}
