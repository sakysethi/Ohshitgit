package practiceJava;

import java.util.ArrayList;
import java.util.List;

public class StreamsExapmle {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Apple");
        names.add("Balloon");
        names.add("Aeroplane");
        names.add("Cat");
        names.add("Dumble");


        //without using streams
        int count=0;


        for (int i=0; i< names.size(); i++ ){
            String actual = names.get(i);

            if(actual.startsWith("A")){
                count=count+1;
            }
        }
        System.out.println(count);


        //assign arrayList to stream
//in stream api we have a method names filter,
//        which filters based on the condition
        //provide lambda expression in the method
        // in filter we take a parameter
        names.stream().filter(s->s.startsWith("A"));

    }



}
