package creational.abstractfactory.shape.impl;


import creational.abstractfactory.shape.Shape;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:41
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
