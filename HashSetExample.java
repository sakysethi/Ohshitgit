package practiceJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("India");
        hs.add("Vietnam");
        hs.add("Bali");

        System.out.println(hs);

        hs.add("Dubai");
        System.out.println(hs);

        hs.add("Bali");
        System.out.println(hs);


        System.out.println(hs.size());

        System.out.println(hs.isEmpty());

        hs.remove("Dubai");
        System.out.println(hs);


        Iterator<String> iterator = hs.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());


        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
