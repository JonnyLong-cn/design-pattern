package creational.abstractfactory.color.impl;

import creational.abstractfactory.color.Color;

/**
 * @author Jonny Long
 * @date 2021/3/26 9:46
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
