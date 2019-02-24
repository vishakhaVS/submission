package com.ttn.java2;

public class Furniture {
}

abstract class Wooden {
    String type;
    String durability;
    double price;

    abstract public void fireTest();
}

abstract class Metal {
    String Type;
    double price;
    String finishing;

    abstract public void stressTest();
}


class Chair_wooden extends Wooden {
    private double height;
    private double width;
    private String color;
    private String chairType;
    private double makingCost;

    @Override
    public void fireTest() {

    }
}

class Table_Wooden extends Wooden {
    private double height;
    private double width;
    private String color;
    private String tableType;
    private double cost;

    @Override
    public void fireTest() {

    }
}

class ChairMetallic extends Metal {
    private double height;
    private double width;
    private String color;
    private double cost;

    @Override
    public void stressTest() {

    }
}

class TableMetallic extends Metal {
    private double height;
    private double width;
    private String color;
    private double cost;

    @Override
    public void stressTest() {

    }
}