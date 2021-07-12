package creational.singleton;

/**
 * @author Jonny Long
 * @date 2021/3/26 10:41
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
