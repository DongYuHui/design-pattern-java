import org.junit.Test;
import strategy.example1.Duck;
import strategy.example1.MallardDuck;
import strategy.example1.ModelDuck;
import strategy.example1.Squeak;
import strategy.example2.ConcreteStrategyA;
import strategy.example2.ConcreteStrategyB;
import strategy.example2.Context;

/**
 * 策略模式测试
 * ---
 * Created on 2018/4/10 11:25
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class StrategyTest {

    @Test
    public void testExample1() {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("---");

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();

        System.out.println("Change quack behavior");

        modelDuck.setQuackBehavior(new Squeak());
        modelDuck.performQuack();

    }

    @Test
    public void testExample2() {

        Context context;

        context = new Context(new ConcreteStrategyA());
        context.algorithm();

        context = new Context(new ConcreteStrategyB());
        context.algorithm();

    }

}
