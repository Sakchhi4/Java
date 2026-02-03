class Payment {
    void pay() {
        System.out.println("Processing payment");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Credit Card Payment");
    }
}

class UPI extends Payment {
    void pay() {
        System.out.println("UPI Payment");
    }
}

public class Test {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        p.pay();   
    }
}
