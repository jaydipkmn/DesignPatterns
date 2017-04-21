package com.Factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        
        if(choice.equalsIgnoreCase("SHAPE"))
           return new ShapeFactory();
        else       
            return null;
     }
}
