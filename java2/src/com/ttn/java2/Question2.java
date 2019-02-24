package com.ttn.java2;

class Queston2 {


    static void printArray(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    void sort(int arr[]) {
        int len = arr.length;
        for (int i = 1; i < len; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String args[]) {
        int arr[] = {12, 11, 13, -5, 6};
        //int arr[] = {12, 11, 13, 5, 6};

        Queston2 ob = new Queston2();
        ob.sort(arr);

        printArray(arr);
    }
}