package com.myShape;

import com.Factory.AbstractFactory;
import com.Factory.FactoryProducer;
import com.myShape.Shape.Shape;

public class MyShape {

    public static void main(String[] args) {
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape shape = shapeFactory.getShape("TRIANGLE");
        shape.draw();


    }

}
