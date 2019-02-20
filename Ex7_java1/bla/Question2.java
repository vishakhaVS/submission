package bla;

public class Question2 {
    public static void main(String[] args) {
        String strarr[]= new String[] {"vishakha","Yatin","vishakha","tidda","Mehak","tidda","mansi","tidda","mansi"};

        for (int i=0;i<strarr.length;i++)
        {   int count=1;
            for (int j=i+1;j<strarr.length;j++)
            {
                if(strarr[j].equals(strarr[i]))
                {
                    count+=1;
                    strarr[j]="0";
                }

            }

                if(strarr[i]!="0" && count>1)
            System.out.println(" The count for duplicate word "+ ""+ strarr[i] + " is :" +"  "+ count);

        }
    }
}

