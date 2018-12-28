package iterator;

import java.util.List;

/**
 * 具体的迭代器实现类
 * - - -
 * Created on 2018-12-28 14:16
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list;

    private int index;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (list == null) return false;
        return index < list.size();
    }

    @Override
    public T next() {
        T result = null;
        if (list != null && hasNext()) {
            result = list.get(index);
            index++;
        }
        return result;
    }

}
