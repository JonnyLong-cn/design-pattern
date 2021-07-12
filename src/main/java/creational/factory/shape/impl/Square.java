package creational.factory.shape.impl;

import creational.factory.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:41
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
