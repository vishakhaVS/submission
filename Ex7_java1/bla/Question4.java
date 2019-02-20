package bla;

public class Question4 {


    public static void main(String[] args)
    {

        String str="vish@khaV2812";
        int countSpecialCharacter=0;
        int countLowerCase=0;
        int countUpperCase=0;
        int countDigit=0;
        int len=str.length();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                countLowerCase+=1;
            }

            else if(Character.isUpperCase(str.charAt(i)))
            {
                countUpperCase+=1;
            }
           else if((str.charAt(i)>='0') && (str.charAt(i)<='9'))
            {
                countDigit+=1;
            }
            else
            {
                countSpecialCharacter+=1;
            }
        }

        float lowerCasePercentage=(countLowerCase*100)/len;
        float upperCasePercentage=(countUpperCase*100)/len;
        float digitPercentage=(countDigit*100)/len;
        float specialCharacterPercentage=(countSpecialCharacter*100)/len;

        System.out.println("LowerCase :" + countLowerCase);
        System.out.println("Uppercase :" +countUpperCase);
        System.out.println("Digit :"+countDigit);
        System.out.println("Special characters  :" +countSpecialCharacter);
        System.out.println("Special characters % :" +lowerCasePercentage);
        System.out.println("Special characters % :" +upperCasePercentage);
        System.out.println("Special characters % :" +digitPercentage);
        System.out.println("Special characters % :" +specialCharacterPercentage);







    }


}
