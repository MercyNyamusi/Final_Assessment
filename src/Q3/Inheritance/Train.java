package Q3.Inheritance;

public class Train extends Vehicle {
	public void featuresTrain() {
		System.out.println("I am a train");
		System.out.println("I have an wagons");
		System.out.println("I move on a railwayline");
	}
	public static void main(String[] args) {
		Train train1 = new Train();
		train1.featuresVehicle();
		train1.featuresTrain();
		
	}
}
