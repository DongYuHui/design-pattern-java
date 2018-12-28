package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的容器实现类
 * - - -
 * Created on 2018-12-28 14:13
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ConcreteAggregateList<T> implements AggregateList<T> {

    // 这里为了方便，直接使用 JDK 的 List 进行容器的实现
    private List<T> list;

    @Override
    public void add(T object) {
        if (list == null) list = new ArrayList<>();
        list.add(object);
    }

    @Override
    public void remove(T object) {
        list.remove(object);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(list);
    }

}
