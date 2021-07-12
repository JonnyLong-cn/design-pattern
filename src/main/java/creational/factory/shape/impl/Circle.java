package creational.factory.shape.impl;

import creational.factory.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:40
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
