import iterator.AggregateList;
import iterator.ConcreteAggregateList;
import iterator.Iterator;
import org.junit.Test;

/**
 * 迭代器模式测试
 * - - -
 * Created on 2018-12-28 13:50
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class IteratorTest {

    @Test
    public void testIterator() {

        AggregateList<Integer> list = new ConcreteAggregateList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer item = iterator.next();
            System.out.println("item " + item);
        }

    }

}
