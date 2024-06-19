package practiceJava;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Facebook");
        al.add("Instagram");
        al.add("Threads");
        System.out.println(al);

        al.add(0, "Snapchat");
        System.out.println(al);

        System.out.println(al.get(2));

        System.out.println(al.contains("Threads"));
        System.out.println(al.contains("Orkut"));

        System.out.println(al.indexOf("Threads"));
        System.out.println(al.indexOf("WeChat"));

        System.out.println(al.isEmpty());

        al.add("Instagram");
        System.out.println(al.size());

        al.remove("Threads");
        System.out.println(al);

        al.remove(2);
        System.out.println(al);
    }
}
