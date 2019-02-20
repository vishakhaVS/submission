package bla;

public class Question6 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 67, 1, 2, 3, 4, 5};
        int num = arr[0];
        for (int i = 1; i < arr.length; i++)
        {



                num = num^arr[i];

            System.out.println("The unique number is "+num);


        }


    }
}

