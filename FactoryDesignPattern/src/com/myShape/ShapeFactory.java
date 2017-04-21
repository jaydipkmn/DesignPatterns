package com.myShape;

import com.myShape.Shape.Circle;
import com.myShape.Shape.Shape;
import com.myShape.Shape.Square;
import com.myShape.Shape.Triangle;

public class ShapeFactory {

    public Shape getShape(String type)
    {
        if(type.equals("triangle"))
            return new Triangle();
        else if(type.equals("circle"))
            return new Circle();
        else if(type.equals("square"))
            return new Square();
        else return  null;
    }
}
