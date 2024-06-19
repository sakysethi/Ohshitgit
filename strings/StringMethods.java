package practiceString;

public class StringMethods {

    public static void main(String[] args) {

        String str1 = "artoftesting";
        String str2 = "Artoftestingg";
        System.out.println("The length of the string is " + str1.length());
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equals(str2));

        String str11 = "HELLO";
        String str22 = "hello";
        System.out.println(str22.equals(str11));

        System.out.println(str1.concat(str2));

        System.out.println(str2.toString());


        String str20 = String.join("-", "Java", "Is", null ,"Awesome");
        System.out.println(str20);

    }
}
