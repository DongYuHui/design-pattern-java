package proxy.jdkmode;

/**
 * JDK 动态代理，接口实现
 * - - -
 * Created on 2018/11/28 10:44
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Mp4Media implements Media {

    private String file;

    public Mp4Media(String file) {
        this.file = file;
    }

    @Override
    public void play() {
        System.out.println("MP4 media : " + file);
    }

}
