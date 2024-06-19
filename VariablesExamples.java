package practiceJava;

public class VariablesExamples {

    String name;
    static String city = "Banaras";
    static int i = 0;

    VariablesExamples(String name) {
        this.name = name;
        i++;
        System.out.println(i);
    }

    public void getDetails() {
        System.out.println(name + " " + city);
    }

    public static void main(String[] args) {
        VariablesExamples variablesExamples1 = new VariablesExamples("Ram");
        variablesExamples1.getDetails();
        VariablesExamples variablesExamples2 = new VariablesExamples("Shyam");
    }

}