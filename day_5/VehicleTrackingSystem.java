class Vehicle
{
    void maxSpeed(){
        System.out.println("Vehicle speed varies");

    }
}
class Car extends Vehicle{
    void maxSpeed(){
        System.out.println("max speed of a car is 100 km/hr");
    }
}
class Bike extends Vehicle{
    void maxSpeed(){
        System.out.println("max speedof abike is 140km/hr");
    }
}


public class VehicleTrackingSystem {
    public static void main(String[] args){
        Vehicle v;
        v = new Car();
        v.maxSpeed();  
    
          v = new Bike();
        v.maxSpeed(); 
    
    
    }
    
}
