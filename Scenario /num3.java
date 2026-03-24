abstract class Payment {
    float amount;

    Payment(float amount) {
        this.amount = amount
    }

    abstract float processPayment();
}



class CreditCardPayment extends Payment {

    CreditCardPayment(float amount) {
        super(amount);
    }

    float processPayment() {
        return amount + (amount * 0.02f);
    }
}




class UPIPayment extends Payment {

    UPIPayment(float amount) {
        super(amount);
    }

    float processPayment() {
        return amount;
    }
}



public class main_3 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment(1000f);
        Payment p2 = new UPIPayment(1000f);

        System.out.println(p1.processPayment());
        System.out.println(p2.processPayment());
    }
}
