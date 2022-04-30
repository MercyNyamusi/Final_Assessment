package Q3.Interface;

public class Buffalo implements Animal,Mammal{

	
	
	String walkingPart="Hooves";
	String mouthPart ="Blund teeth";

	public void printfeatures() {
		System.out.println("Feet: " + this.walkingPart);
		System.out.println("Mouth feature: " +this.mouthPart);
	}
	public static void main(String[] args) {
		Buffalo buffalo1 = new Buffalo();
		System.out.println("Characteristics of a Buffalo include:");
		
		buffalo1.printfeatures();
		
		
	}
}
