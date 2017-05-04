package strategy.example2;

/**
 * 策略模式，示例 2
 * Created on 2017/5/3 16:15
 *
 * @author DongYuHui at <a href="mailto:dyh920827@hotmail.com">dyh920827@hotmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

        Context context;

        context = new Context(new ConcreteStrategyA());
        context.algorithm();

        context = new Context(new ConcreteStrategyB());
        context.algorithm();

    }

}
