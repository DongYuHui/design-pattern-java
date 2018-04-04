package decorator;

/**
 * Example
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/16 21:28
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

    }

}
