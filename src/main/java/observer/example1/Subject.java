package observer.example1;

/**
 * 主题接口，用于被订阅
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/13 22:02
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 注销观察者
     *
     * @param observer 观察者
     */
    public void removeObserver(Observer observer);

    /**
     * 更新所有观察者
     */
    public void updateAll();

}
