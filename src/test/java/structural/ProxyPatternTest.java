package structural;

import org.junit.Test;
import structural.proxy.Image;
import structural.proxy.ProxyImage;

/**
 * @author Jonny Long
 * @date 2021/3/26 17:01
 */
public class ProxyPatternTest {
    @Test
    public void proxyPatternTest(){
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("--------------");
        // 图像不需要从磁盘加载
        image.display();
    }
}
