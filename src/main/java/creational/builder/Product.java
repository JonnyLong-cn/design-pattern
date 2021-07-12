package creational.builder;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Jonny Long
 * @date 2021/4/21 18:41
 */
public class Product {
    private List<String> parts = new LinkedList<>();

    public Product() {
    }

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        for (String s : parts) {
            System.out.println(s);
        }
    }
}
