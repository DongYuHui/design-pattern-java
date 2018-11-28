package proxy.cglibmode;

/**
 * Cglib 动态代理 具体类
 * - - -
 * Created on 2018/11/28 10:56
 * All Rights Reserved by Author
 *
 * @author DongYuHui at <a href="mailto:dyh920827@gmail.com">dyh920827@gmail.com</a>
 */
public class Mp3Audio {

    private String file;

    /**
     * 代理对象需要有一个空的构造函数
     */
    public Mp3Audio() {
    }

    public Mp3Audio(String file) {
        this.file = file;
    }

    public void play() {
        System.out.println("MP3 audio : " + file);
    }

}
