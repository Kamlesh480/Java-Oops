package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {
        System.out.println("Constrcutore inside Encap class");

        Leptop l1 = new Leptop();
        l1.setPrice(23);

        System.out.println("price is: " + l1.getPrice());

    }

    public void encapFunc() { //agar yaha public key word nahi lagaya, to ye fun: encapFunc kahi or access nahi ho sakta
        System.out.println("Function inside Encap class");
    }
    // key word Private: is class ke alava kahi nahi milega, not even in another file in same packege
    // key word Protected: koi proerty parent ke pass hai, and you want ki vo sirf child ki mile
}

class Leptop {
        int ram;
        private int price; //is class ke alava kahi nahi milega, not even in another file in same packege

        public void setPrice(int price) {
            // is the user is admin, so we can deside wether he can change the price or not
            boolean isAdmin = true;
            if (!isAdmin) {
                System.out.println("You can not change the price");
            } else {
                this.price = price;
            }
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }

        public int getPrice() {
            return price;
        }

}
