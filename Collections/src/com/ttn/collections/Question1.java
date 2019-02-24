package com.ttn.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Question1 {


    public static void main(String[] args) {
        ArrayList<Float> al = new ArrayList<Float>();
        al.add(7f);
        al.add(6f);
        al.add(5f);

    Float sum = 0f;
    Iterator iterator = al.iterator();
//      hasNext method returns true if the iteration has more elements.
        while (iterator.hasNext()) {

        sum += (Float) iterator.next();
    }
        System.out.println("Sum of the no.s is : " + sum);
}
}


