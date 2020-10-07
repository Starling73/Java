package com.lab111.labwork3;

public abstract class ShapeDecorator implements Shape {

    private Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String draw() {
        return shape.draw();
    }
}
