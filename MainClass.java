public class MainClass {
    public static void main(String[] args) {
        System.out.println("let's code today in java");
        Coder p1 = new Coder();
        p1.name = "Kamlesh";
        p1.age = 23;

        System.out.println("This is "+p1.name+ " here and he's " + p1.age);
        p1.code();
    }
}


class Coder {
    String name;
    int age;

    void code() {
        System.out.println("and right now " + name + " is coding in java.");
    }
}