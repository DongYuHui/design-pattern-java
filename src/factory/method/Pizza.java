package factory.method;

import java.util.ArrayList;
import java.util.List;

/**
 * 披萨抽象类
 * ---
 * All Rights Reserved by Author
 * Created on 2017/05/27 21:37
 *
 * @author DongYuHui at <a href="dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + getName());
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (String item : toppings) {
            System.out.println("    " + item);
        }
    }

    void bake() {
        System.out.println("Bake for 23 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    String getName() {
        return name;
    }

}
