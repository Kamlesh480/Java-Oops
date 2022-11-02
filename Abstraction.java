public class Abstraction {
    public static void main(String[] args) {
        // OnlineCourses c1 = new OnlineCourses(); //initiate nahi kar sakte kyoki ab vo ek abstrct class hai

        Coursera c1 = new Coursera();
        c1.subscribed();

        Udemy u1 = new Udemy();
        u1.subscribed();
    }
}

class Coursera extends OnlineCourses {

    @Override
    void subscribed() {
        System.out.println("subscribed to a Coursera course");

    }

}

class Udemy extends OnlineCourses { //subscribed method isme overide karna hi padega cause it's an abstrct function

    @Override
    void subscribed() {
        System.out.println("subscribed to a Udemy course");
    }

}

abstract class OnlineCourses { // abstrct matalab ye ek tarike se srif ek concept hai, iska aap object nahi bana sakte,
    // and iska agar aapko object banana hai to iske sirf aap childern ka object bana sakte ho
    int price;

    abstract void subscribed(); // No implimentaion or defination needed cause it's an abstrct class

    void status() {
        System.out.println("Payment is done");
    }
}
