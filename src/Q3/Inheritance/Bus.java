package Q3.Inheritance;

public class Bus extends Vehicle {
	public void featuresBus() {
		
		System.out.println("I am a Bus");
		System.out.println("I have a trunk");
		System.out.println("I move on roads");
	}
	public static void main(String[] args) {
		Bus bus1 = new Bus();
		bus1.featuresVehicle();
		bus1.featuresBus();
		
	}
}
