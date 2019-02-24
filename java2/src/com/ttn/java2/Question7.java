package com.ttn.java2;

public class Question7 {

    static void ConvertSecondsToDay(int number) {
        int day = number / (24 * 3600);

        number = number % (24 * 3600);


        int hour = number / 3600;

        number %= 3600;


        int minutes = number / 60;

        number %= 60;
        int seconds = number;

        System.out.println(day + " " + "days " + hour
                + " " + "hours " + minutes + " "
                + "minutes " + seconds + " "
                + "seconds ");
    }


    public static void main(String[] args) {

        int number = 90000;
        ConvertSecondsToDay(number);

    }

}
