package practiceJava;

public class ConstructorExample {

    public ConstructorExample(){
        System.out.println("I am in constructor");
    }

    public ConstructorExample(String abc){
        System.out.println("I am in single parameterized constructor");
        System.out.println(abc);
    }

    public ConstructorExample(int a, int b){
        System.out.println("I am in parameterized constructor");
        System.out.println(a+b);
    }

    public void methodConstructorExample(){
        System.out.println("I am in method");
    }

    public static void main(String[] args) {

        ConstructorExample constructorExample1 = new ConstructorExample();
        ConstructorExample constructorExample2 = new ConstructorExample(4, 5);
        ConstructorExample constructorExample3 = new ConstructorExample("abc");
    }
}
