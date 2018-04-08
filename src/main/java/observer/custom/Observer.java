package observer.custom;

/**
 * 观察者需要实现的接口
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/13 22:04
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public interface Observer {

    /**
     * 气象数据得到更新
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);

}
