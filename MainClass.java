public class MainClass {
    public static void main(String[] args) {
        System.out.println("let's code today in java, let's start");
        String newline = System.lineSeparator();
        System.out.println(newline);

        //making a coder
        Coder p1 = new Coder();
        p1.name = "Kamlesh";
        p1.age = 23;
        System.out.println("This is "+p1.name+ " here and he's " + p1.age);
        p1.code(3);
        System.out.println(newline);

        //making new coder
        Coder p2 = new Coder(24, "Kailash");
        System.out.println("This is " + p2.name + " here and he's " + p2.age);
        p2.code(4);
        System.out.println(newline);

        //making a developer
        Developer d1 = new Developer(26, "Abdul");
        d1.code(12);
        d1.code();
        System.out.println(newline);

        System.out.println("constrcut " + Coder.count + " times");
    }
}


class Coder {

    // constructor
    static int count; //yaha count ek class ki property hai/not depend on object - using static

    public Coder() {
        count++;
        System.out.println("constrcutor called");
    }

    //overload constructor
    public Coder(int age, String name) {
        this(); //help to call other constructor of your class, so count++ will happen
        System.out.println("overloaded constrcutor called");

        this.name = name; //isi class ke dusre parameter ko access karne ke liye
        this.age = age;
    }

    String name;
    int age;

    void code() {
        System.out.println("and right now " + name + " is coding in java.");
    }

    //polimorphisum - new form of code function || complie time polimorphisum
    void code(int hurs) {
        System.out.println("and "+ name + " is coding from last "+ hurs +" hours");
    }
}



//inheritence
class Developer extends Coder {
    public Developer(int age, String name) {
        super(age, name); //Super key word: Use to call constrcutor of parent
        System.out.println("calling inherited class developer");
    }

    //again declareing code() func in child class here. - example of run time polimorphisum
    //start me nahi pata ki code() fun kiske pass hai, child me hai ki parent me hai, vo run time per linking ho rahi hain
    void code() {
        System.out.println("and right now Developer " + name + " is developing application in java.");
    }
}