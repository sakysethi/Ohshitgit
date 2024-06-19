package practiceJava;

public class ChildExample extends ParentExample{

   // String name = "Shetty";

    public void getDataVariable(){
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData(){
super.getData();
        System.out.println("I am in Child Class");
    }

    public static void main(String[] args) {
        ChildExample childExample = new ChildExample();
        childExample.getData();
    }

    public ChildExample(){
        super();
        System.out.println("I am in Child Class Constructor");
    }
}
