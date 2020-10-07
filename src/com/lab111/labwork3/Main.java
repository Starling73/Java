package com.lab111.labwork3;

public class Main {
    public static void main (String[] args) {

        Shape simpleSquare = new Square();
        System.out.println(simpleSquare.draw());

        Shape redCircle = new RedShape(new Circle());
        System.out.println(redCircle.draw());

        Shape redShadowedStar = new ShapeWithShadow(new RedShape(new Star()));
        System.out.println(redShadowedStar.draw());

        Shape redShadowedTextedCircle = new ShapeWithText(new ShapeWithShadow(new RedShape(new Circle())));
        System.out.println(redShadowedTextedCircle.draw());

    }
}
