package practiceString;

import org.testng.annotations.Test;

import java.util.HashMap;

public class commonStringPrograms {

    @Test
    public void reverseString() {
            String str= "Scaler by InterviewBit";
            str = new StringBuilder(str).reverse().toString();
            System.out.println(str);
        }

        @Test
        public void totatCharacters() {
                String str = "Scaler by InterviewBit";
                int count = 0;
                System.out.println("Input String: "+str);
                for(int i=0; i<str.length(); i++){
                    if(str.charAt(i) != ' ')
                        count++;
                }
                System.out.println(count);
            }

            @Test
public void checkforOccurences(){
                String inputString = "Scaler by InterviewBit";

                // Creating a HashMap containing char as a key and occurrences as  a value
                HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

                // Converting given string to char array
                char[] strArray = inputString.toCharArray();

                for(char c : strArray){
                    if(charCountMap.containsKey(c)){

                    }
                }
}

}
