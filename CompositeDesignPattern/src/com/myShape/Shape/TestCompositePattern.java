package com.myShape.Shape;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape sqr = new Square();
        Shape cir = new Circle();
        
        Drawing drawing = new Drawing();
        drawing.add(tri);
        drawing.add(sqr);
        drawing.add(cir);
        
        drawing.draw();
        
        drawing.clear();
        
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw();
    }

}
