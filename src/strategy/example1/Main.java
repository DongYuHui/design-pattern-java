package strategy.example1;

/**
 * 策略模式，示例 1
 * Created on 2017/5/3 16:15
 *
 * @author DongYuHui at <a href="mailto:dyh920827@hotmail.com">dyh920827@hotmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

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

}
