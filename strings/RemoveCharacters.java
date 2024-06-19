package strings;

public class RemoveCharacters {
    public static void main(String[] args) {

        String str1 = "$#%^&*(jav#@$ac*&(o&^(*de&^**";
        System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));

   String str2 = "  j   ava   C  o  d  e       ";
        System.out.println(str2.trim());
        System.out.println(str2.replaceAll(" ", ""));

    }
}
