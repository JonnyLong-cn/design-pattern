package creational.builder;

/**
 * @author Jonny Long
 * @date 2021/4/21 18:44
 * 构造和装配各种零件
 */
public class ConcreteBuilderPlanA implements Builder{
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.add("PlanA - 零件A");
    }

    @Override
    public void BuildPartB() {
        product.add("PlanA - 零件B");
    }

    public Product getResult(){
        return product;
    }
}
