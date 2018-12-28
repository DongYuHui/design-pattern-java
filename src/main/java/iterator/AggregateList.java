package iterator;

/**
 * 自定义容器，
 * - - -
 * Created on 2018-12-28 14:03
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public interface AggregateList<T> {

    void add(T object);

    void remove(T object);

    Iterator<T> iterator();

}
