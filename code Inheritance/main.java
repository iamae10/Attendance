package IndividualActivity;
/*b) Create  subclass of Plane class and name it U-2 Spy Plane, which has the following properties and 
methods(wing span and method fly());*/


public class main {

	public static void main(String[] args) {
		
		U2SpyPlane plane = new U2SpyPlane(1000, "white", 100000, 50.5);
		//print out the properties for plane
		System.out.println("The " + plane.color + " U-2 Spy Plane is worth of" + plane.price + 
				" pesos, have the wingspan of \n" + plane.wingsSpan + 
				" ft. with the speed of " + plane.speed);
		
		//display the method that inherited from a U2SpyPlane class
		plane.fly();
    plane.stop();
       
	}

}
