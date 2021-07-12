package creational.builder;

/**
 * @author Jonny Long
 * @date 2021/4/21 18:46
 */
public class Director {
    public void construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
