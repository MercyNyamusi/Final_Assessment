package Q3.Interface;

public interface Mammal {
	
	public String bodycover="Fur";
	public String reproduction="Birth";
	
	
	default void printfeatures() {
		System.out.println("Body Cover: " +this.bodycover);
		System.out.println("Reproduction by: " +this.reproduction);
	}
}
