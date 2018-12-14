import observer.java.CustomSubscriber;
import org.junit.Test;

import java.util.concurrent.SubmissionPublisher;

/**
 * 观察者模式测试
 * ---
 * Created on 2018/4/8 17:04
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ObserverTest {

    @Test
    public void testObserverCustom() {

        observer.custom.WeatherData weatherData = new observer.custom.WeatherData();

        observer.custom.CurrentConditionsDisplay currentConditionsDisplay = new observer.custom.CurrentConditionsDisplay(weatherData);
        observer.custom.StatisticsConditionsDisplay statisticsConditionsDisplay = new observer.custom.StatisticsConditionsDisplay(weatherData);

        weatherData.setMeasurements(10F, 60F, 70F);
        weatherData.removeObserver(statisticsConditionsDisplay);
        weatherData.setMeasurements(7F, 30F, 19F);
        weatherData.removeObserver(currentConditionsDisplay);
        weatherData.setMeasurements(3F, 50F, 23F);

    }

    /**
     * JDK 原有的 Observer，Observable 已经被标记为 @Deprecated
     * 从 JDK9 开始引入 Flow 来实现观察者模式，可以发现这与 RxJava 十分相似
     */
    @Test
    public void testObserverJava() {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        publisher.subscribe(new CustomSubscriber("one"));
        for (int i = 0; i < 10; i++) {
            publisher.submit("number " + i);
        }
        publisher.close();
        // 主线程睡眠 1 秒，等待订阅者的线程结束，否则订阅者线程还没有任何输出就被中止
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
