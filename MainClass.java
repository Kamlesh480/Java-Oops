public class MainClass {
    public static void main(String[] args) {
        System.out.println("My first java program");
        Person p1 = new Person();
        p1.name = "Kamlesh";
        p1.age = 23;

        Person p2 = new Person();
        p2.name = "Kamal";
        p2.age = 43;

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);
    }
}


class Person {
    String name;
    int age;
}