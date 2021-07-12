package structural.facade.shape.impl;

import structural.facade.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:41
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw() method.");
    }
}
