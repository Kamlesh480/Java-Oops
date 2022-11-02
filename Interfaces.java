public class Interfaces implements OnlineCourse, teching{ // classes ke liye hota hai extend vese hi interface ke liye hota hai - implements
    public static void main(String[] args) {

    }

    @Override //anotation
    public void subscribed() {
        System.out.println("interface fun defination");
    }

    @Override
    public void tech() {
        System.out.println("interface fun defination");
    }
}

interface OnlineCourse { // interface ke under sabhi function bydeaful, public and abstract hote hain

    void subscribed();
}

interface teching { // interface ke under sabhi function bydeaful, public and abstract hote hain

    void tech();
}