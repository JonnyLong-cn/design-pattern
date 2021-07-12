package structural.facade.shape.impl;

import structural.facade.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:40
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}
