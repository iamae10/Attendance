package IndividualActivity;

public class U2SpyPlane extends Vehicle
{
    double wingsSpan; 
     
	public U2SpyPlane(int speed, String color, int price, double wingsSpan) {
		super(speed, color, price);
		this.wingsSpan = wingsSpan;
	 }
     
	public void fly() {
	   System.out.print("The plane is flying"); 

     }
     @Override
     public void stop() {
	 System.out.print("The plane stopped"); 
     
       }
}

