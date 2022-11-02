public class MainClass {
    public static void main(String[] args) {
        System.out.println("let's code today in java, let's start");
        String newline = System.lineSeparator();
        System.out.println(newline);


        Coder p1 = new Coder();
        p1.name = "Kamlesh";
        p1.age = 23;

        System.out.println("This is "+p1.name+ " here and he's " + p1.age);
        p1.code();
        p1.code(3);
    }
}


class Coder {
    String name;
    int age;

    void code() {
        System.out.println("and right now " + name + " is coding in java.");
    }

    //polimorphisum - new form of code function
    void code(int hurs) {
        System.out.println("and "+ name + " is coding from last "+ hurs +" hours");
    }
}