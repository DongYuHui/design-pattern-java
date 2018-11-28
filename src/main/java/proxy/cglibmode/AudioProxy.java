package proxy.cglibmode;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * Cglib 动态代理 代理实现类
 * - - -
 * Created on 2018/11/28 11:01
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class AudioProxy implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        // 这里代理所有的方法调用，实际应用中往往只需要代理特定的方法，需要按照需求过滤
        System.out.println("= = = cglib proxy start = = =");
        Object result = method.invoke(target, objects);
        System.out.println("= = = cglib proxy  end  = = =");
        return result;
    }

}
