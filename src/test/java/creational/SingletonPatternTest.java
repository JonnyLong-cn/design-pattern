package creational;

import creational.singleton.SingleObject;
import creational.singleton.Singleton;
import org.junit.Test;

/**
 * @author Jonny Long
 * @date 2021/3/26 10:37
 */
public class SingletonPatternTest {
    @Test
    public void singletonObjectTest(){
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }

    @Test
    public void singletonTest(){
        Singleton instance = Singleton.getInstance();

    }

}
