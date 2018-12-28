package iterator;

/**
 * 迭代器角色
 * - - -
 * Created on 2018-12-28 13:51
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public interface Iterator<T> {

    /**
     * 是否还有下一个元素
     *
     * @return 是否
     */
    boolean hasNext();

    /**
     * 下一个元素
     *
     * @return 下一个
     */
    T next();

}
