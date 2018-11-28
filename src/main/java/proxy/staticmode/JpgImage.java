package proxy.staticmode;

/**
 * 静态代理，接口实现类
 * - - -
 * Created on 2018/11/28 10:20
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class JpgImage implements Image {

    private String file;

    public JpgImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        System.out.println("JPG image : " + file);
    }

}
