package com.lab111.labwork3;

public class ShapeWithText extends ShapeDecorator {

    public ShapeWithText(Shape shape) {
        super(shape);
    }

    public String draw() {
        return super.draw() + ", it contains text";
    }
}
