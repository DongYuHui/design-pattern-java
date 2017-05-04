package strategy.example2;

/**
 * 策略依托的主体
 * ---
 * Created on 2017/5/4 10:14
 *
 * @author DongYuHui at <a href="mailto:dyh920827@hotmail.com">dyh920827@hotmail.com</a>
 */
public class Context {

    private Strategy mStrategy;

    public Context(Strategy strategy) {
        mStrategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        mStrategy = strategy;
    }

    public void algorithm() {
        mStrategy.strategy();
    }

}
