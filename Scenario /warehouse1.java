abstract class Robot {
    private String id;
    protected float charge;

    Robot(String i, float c) {
        id = i;
        charge = c;
    }

    String getId() {
        return id;
    }

    void show() {
        System.out.printf("%s : %.1f%%\n", id, charge);
    }

    abstract void work();
}


class DroneRobot extends Robot {
    DroneRobot(String i, float c) {
        super(i, c);
    }

    void work() {
        if (charge >= 15) charge -= 15;
        else System.out.println(getId() + " Low battery");
        show();
    }
}


class GroundRobot extends Robot {
    GroundRobot(String i, float c) {
        super(i, c);
    }

    void work() {
        if (charge >= 5) charge -= 5;
        else System.out.println(getId() + " Low battery");
        show();
    }
}


class warehouse1{
    public static void main(String[] args) {
        Robot[] r = {
            new DroneRobot("D1", 20f),
            new GroundRobot("G1", 10f),
            new DroneRobot("D2", 10f)
        };

        for (Robot x : r) {
            x.work();
        }
    }
}
