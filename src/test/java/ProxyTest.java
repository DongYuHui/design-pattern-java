import org.junit.Test;
import proxy.cglibmode.AudioProxy;
import proxy.cglibmode.Mp3Audio;
import proxy.jdkmode.Media;
import proxy.jdkmode.MediaProxy;
import proxy.jdkmode.Mp4Media;
import proxy.staticmode.Image;
import proxy.staticmode.ProxyImage;

/**
 * 测试代理模式
 * - - -
 * Created on 2018/11/28 10:22
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class ProxyTest {

    /**
     * 测试静态代理
     */
    @Test
    public void testStaticMode() {
        Image image = new ProxyImage("/root/test.jpg");
        image.display();
    }

    /**
     * 测试 JDK 动态代理
     */
    @Test
    public void testJdkMode() {
        Media media = new MediaProxy(new Mp4Media("/root/test.mp4")).getInstance();
        media.play();
    }

    /**
     * 测试 Cglib 动态代理
     */
    @Test
    public void testCglibMode() {
        Mp3Audio source = new Mp3Audio("/root/test.mp3");
        Mp3Audio audio = (Mp3Audio) new AudioProxy().getInstance(source);
        audio.play();
    }

}
