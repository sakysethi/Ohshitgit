package strings;

import java.lang.reflect.Method;

public class EqualsMethod {

    public EqualsMethod(){
        System.out.println("Default Constructor");
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));
EqualsMethod em = new EqualsMethod();
        System.out.println(s1==s2);

        Object o =em.getClass();
        System.out.println(o);

        Class classDetails = em.getClass();
        System.out.println(classDetails);

        Method[] methods = classDetails.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(      method.getName());
        }








    }
}


