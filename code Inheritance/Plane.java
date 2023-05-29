package IndividualActivity;

public class Plane extends Vehicle {
   
  double wingspan; 
	 
	public Plane(int speed, String color, int price, double wingspan) {
		super(speed, color, price);
		this.wingspan = wingspan;
	}
	   //add method
		public void fly() {
			   System.out.print("The plane is flying"); 
		     }

		@Override  // method inherited from vehicle class
		public void stop() {
			System.out.print("The plane stop"); 
		}
}
