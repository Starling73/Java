package com.lab111.labwork3;

public class RedShape extends ShapeDecorator {

    public RedShape(Shape shape) {
        super(shape);
    }

    public String draw() {
        return super.draw() + ", it's red";
    }
}
