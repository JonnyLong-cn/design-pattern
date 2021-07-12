package structural.bridge.shape.impl;

import structural.bridge.color.IColor;
import structural.bridge.shape.IShape;

/**
 * @author Jonny Long
 * @date 2021/3/27 8:58
 */
public class Triangle implements IShape {
    private IColor color;

    public void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("绘制" + color.getColor() + "三角形");
    }
}