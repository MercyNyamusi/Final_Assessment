package Q3.Interface;

public interface Animal {
	public boolean cellWall= false;
	public boolean photosynthesis=false;
	public String inspiratoryGas="Oxygen";
	public String expiratoryGas="Carbondioxide";
	
	default void printfeatures() {
		System.out.println("Inspiratory Gas: " +this.inspiratoryGas);
		System.out.println("Inspiratory Gas: " +this.expiratoryGas);
	}
	
}
