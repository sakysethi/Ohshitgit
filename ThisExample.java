package practiceJava;

public class ThisExample {

    int a=10;

    public void getValue(){
        int a=20;
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        ThisExample thisExample = new ThisExample();
        thisExample.getValue();
    }

}
