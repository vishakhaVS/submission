package com.ttn.java2;

public class Question6 {

    public static void main(String[] args) {

        String[] str = {"abc", "123", null, "xyz"};

        for (int i = 0; i < 6; i++) {
            try {
                int a = str[i].length() + Integer.parseInt(str[i]);

            } catch (NumberFormatException ex) {
                System.out.println("NumberFormatException will be caught here");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("ArrayIndexOutOfBoundsException will be caught here");
            } catch (NullPointerException ex) {
                System.out.println("NullPointerException will be caught here");
            } finally {

                System.out.println("Finally I got executed..");
            }
        }
    }
}