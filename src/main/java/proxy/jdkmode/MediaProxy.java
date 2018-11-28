package proxy.jdkmode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK 动态代理 控制
 * - - -
 * Created on 2018/11/28 10:45
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class MediaProxy implements InvocationHandler {

    private Object target;

    public MediaProxy(Object target) {
        this.target = target;
    }

    public Media getInstance() {
        return (Media) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 这里代理所有的方法调用，实际应用中往往只需要代理特定的方法，需要按照需求过滤
        System.out.println("= = = jdk proxy start = = =");
        Object result = method.invoke(target, args);
        System.out.println("= = = jdk proxy  end  = = =");
        return result;
    }

}
