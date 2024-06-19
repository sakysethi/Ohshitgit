package practiceJava;

public class FirstClass {

    static int a = 10;
    public void firstClassMethod(){
        System.out.println("I am in First Class Method");
    }

    public int met2() {
        int x = 10;
        return x;
    }
    public static void main(String[] args) {

        System.out.println(a);
        System.out.println("Hello World !!!");

        FirstClass fc = new FirstClass();
        fc.firstClassMethod();
        System.out.println(fc.getClass());
        System.out.println(fc.met2());

        SecondClass sc = new SecondClass();
        sc.secondClassMethod();
    }
}
