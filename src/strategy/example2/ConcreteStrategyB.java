package strategy.example2;

/**
 * 算法族中的某一个具体算法实现类
 * ---
 * Created on 2017/5/4 10:44
 *
 * @author DongYuHui at <a href="mailto:dyh920827@hotmail.com">dyh920827@hotmail.com</a>
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategy() {
        System.out.println("ConcreteStrategyB");
    }
}
