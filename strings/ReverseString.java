package strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        int length = str.length();

        //Approach 1
        char chArray[] = str.toCharArray();
        for (int i=(length-1); i>=0; i--){
            System.out.print(chArray[i]);
        }
        System.out.println();

        //Approach 2
        for (int i=(length-1); i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

        //Approach 3
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());

        //Approach 4
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());
    }
}
