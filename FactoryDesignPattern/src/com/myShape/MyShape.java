package com.myShape;

import com.myShape.Shape.Shape;
import com.myShape.Shape.Triangle;

public class MyShape {

    public static void main(String[] args) {
        
        Shape shape = new ShapeFactory().getShape("circle");

        shape.draw();
    }

}
