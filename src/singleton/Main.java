package singleton;

/**
 * 单例模式示例，这里主要测试多线程情况下的单例情况
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/09 21:08
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                singleton.action();
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }

    }

}