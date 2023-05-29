package IndividualActivity;

public class Vehicle {

	 int speed;
     String color;
     double price;
    
    public Vehicle(int speed, String color, int price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }
    
    public void stop() {
        System.out.println(" Vehicle Stopped.");
    }
    
}
