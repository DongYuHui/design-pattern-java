package observer.java;

import java.util.Observable;

/**
 * 气象主题
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/14 16:23
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class WeatherData extends Observable {

    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        System.out.println("--- WeatherData changed ---");
        setChanged();
        notifyObservers();
    }

    /**
     * 设置气象数据，并更新
     *
     * @param temperature 温度
     * @param humidity    湿度
     * @param pressure    气压
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.mTemperature = temperature;
        this.mHumidity = humidity;
        this.mPressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return mTemperature;
    }

    public void setTemperature(float temperature) {
        mTemperature = temperature;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public void setHumidity(float humidity) {
        mHumidity = humidity;
    }

    public float getPressure() {
        return mPressure;
    }

    public void setPressure(float pressure) {
        mPressure = pressure;
    }

}
