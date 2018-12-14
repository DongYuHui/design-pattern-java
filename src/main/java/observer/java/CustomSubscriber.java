package observer.java;

import java.util.concurrent.Flow;

/**
 * 自定义实现订阅者
 * - - -
 * Created on 2018-12-13 17:27
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class CustomSubscriber implements Flow.Subscriber<String> {

    private String name;

    /**
     * Flow.Subscription 有两个方法
     * - request(): 方法添加 n 个数据项到当前未满的订阅请求中
     *              如果 n 小于或等于 0，订阅者的 onError() 方法会被调用，并且抛出 IllegalArgumentException 异常
     *              如果 n 大于 0，订阅者就会在 onNext() 方法的调用下接收到 n 个数据项，除非中间异常终止
     *              从 Long.MAX_VALUE 次到 n 次中间是无界的调用
     * - cancel():  用来终止订阅者接收数据项，它有一种尝试机制，也就是说，在调用它之后也有可能收到数据项
     */
    private Flow.Subscription subscription;

    public CustomSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        this.subscription.request(1);
        System.out.println(name + " onSubscribe");
    }

    @Override
    public void onNext(String item) {
        subscription.request(1);
        System.out.println(name + " onNext : " + item);
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println(name + " onError : " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println(name + " onComplete");
    }

}
