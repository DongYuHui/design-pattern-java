package proxy.staticmode;

/**
 * 静态代理对象
 * - - -
 * Created on 2018/11/28 10:21
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ProxyImage implements Image {

    private Image target;

    public ProxyImage(String file) {
        this.target = new JpgImage(file);
    }

    @Override
    public void display() {
        System.out.println("= = = static proxy start = = =");
        target.display();
        System.out.println("= = = static proxy  end  = = =");
    }

}
