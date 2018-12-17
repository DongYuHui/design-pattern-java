import org.junit.Test;
import template.Poker;
import template.Tetris;

/**
 * 模版方法模式
 * - - -
 * Created on 2018-12-14 09:28
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class TemplateTest {

    @Test
    public void testTemplateMethod() {
        System.out.println("= = = = = = =");
        Poker poker = new Poker();
        poker.play();
        System.out.println("= = = = = = =");
        Tetris tetris = new Tetris();
        tetris.play();
        System.out.println("= = = = = = =");
    }

}
