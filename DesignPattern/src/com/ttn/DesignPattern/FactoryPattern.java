package com.ttn.DesignPattern;

public class FactoryPattern {
}
interface ShapeOfPolygon {
    void draw();
}

 class Rectangle implements ShapeOfPolygon {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

 class Square implements ShapeOfPolygon {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class Circle implements ShapeOfPolygon {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

class ShapeFactory {

    //use getShape method to get object of type shape
    public ShapeOfPolygon getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();


        ShapeOfPolygon shape1 = shapeFactory.getShape("CIRCLE");


        shape1.draw();


        ShapeOfPolygon shape2 = shapeFactory.getShape("RECTANGLE");


        shape2.draw();


        ShapeOfPolygon shape3 = shapeFactory.getShape("SQUARE");


        shape3.draw();
    }
}

