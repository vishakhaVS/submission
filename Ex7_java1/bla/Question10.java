package bla;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {


        System.out.println("The sum is  :" + add(10.20, 20.20));
        System.out.println("The sum is  :" + add(10, 20));

        System.out.println("The produt is  :" + multiply(100.0f, 3.14f));
        System.out.println("The produt is  : " + multiply(100, 3));
        System.out.println("The  concatenation is  :" + concat("vishakha", "sharma"));
        System.out.println("The  concatenation is  :" + concat("vishakha", "sharma","December"));


    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static double add(double number1, double number2) {
        return number1 + number2;

    }

    public static float multiply(float number1, float number2) {
        return number1 * number2;

    }

    public static int multiply(int number1, int number2) {
        return number1 * number2;

    }

    public static String concat(String s1, String s2) {
        return (s1 + s2);
    }

        public static String concat (String s1, String s2, String s3)
        {
            return (s1 + s2+s3);

        }


    }

