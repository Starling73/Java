package com.lab111.labwork3;

public class ShapeWithShadow extends ShapeDecorator {

    public ShapeWithShadow(Shape shape) {
        super(shape);
    }

    public String draw() {
        return super.draw() + ", it's shadowed";
    }
}
