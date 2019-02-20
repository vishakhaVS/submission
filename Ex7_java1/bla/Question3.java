package bla;

public class Question3 {
    public static void main(String[] args) {
          //String arr[]={"vishakha"};
        String str = "This is an Example Of The Character";
        System.out.println("Length Of String:" + str.length());
        System.out.println("Length Of String Without a :" + str.replace("a", "").length());
        int charcount = str.length() - str.replaceAll("a", "").length();
        System.out.println("Occurrence Of A Char In String: " + charcount);

    }
}
