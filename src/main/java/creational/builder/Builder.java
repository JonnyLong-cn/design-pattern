package creational.builder;

/**
 * @author Jonny Long
 * @date 2021/4/21 18:42
 * 为创建一个Product对象的各个部件指定抽象接口
 */
public interface Builder {
    void BuildPartA();
    void BuildPartB();
    default Product getResult(){
        return null;
    }
}
