package bla;

public class Question5 {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 56,};
        int arr2[] = {1, 22, 33, 44, 54, 56,};


        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {


                    System.out.println("The common elements are:" + arr1[i]);

                }
            }


        }

    }
}
