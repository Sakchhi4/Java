abstract class Plan 
    private String patientName;
    private float baseFee;

    public Plan(String name, float fee) {
        patientName = name;
        baseFee = fee;
    }

    public String getPatientName() {
        return patientName;
    }

    public float getBaseFee() {
        return baseFee;
    }

    abstract float calculateBill();
}

class SilverPlan extends Plan {
    public SilverPlan(String name, float fee) {
        super(name, fee);
    }

    float calculateBill() {
        return getBaseFee() + 15;
    }
}

class GoldPlan extends Plan {
    public GoldPlan(String name, float fee) {
        super(name, fee);
    }

    float calculateBill() {
        return getBaseFee() * 1.10f - 20;
    }
}


public class medicineapp {
    public static void printInvoice(Plan p) {
        System.out.printf("%s : %.1f\n",
                p.getPatientName(),
                p.calculateBill());
    }

    public static void main(String[] args) {
        Plan p1 = new SilverPlan("John", 100f);
        Plan p2 = new GoldPlan("Sophia", 200f);
        Plan p3 = new GoldPlan("Max", 50f);

        printInvoice(p1);
        printInvoice(p2);
        printInvoice(p3);
    }
}
