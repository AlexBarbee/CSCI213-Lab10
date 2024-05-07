/**
 * Lab 10 Car class
 * @author Alex Barbee
 *
 */
public class Car extends Vehicle {
	private int doors;
	private int passengers;
	
	public Car(String aMake, String aModel, String aPlate, int theDoors, int thePassengers){
		super(aMake,aModel,aPlate);
		this.doors = theDoors;
		this.passengers = thePassengers;
	}
	
	public int getDoors(){
		return this.doors;
	}
	
	public int getPassengers(){
		return this.passengers;
	}
	
	public String toString(){
		String output = String.format("%d-door %s %s with license %s.",
									   getDoors(),getMake(),getModel(),getPlate());
		return output;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Car){
			Car other = (Car) obj;
			if ( super.equals(obj) && getDoors() == other.getDoors() && getPassengers() == other.getPassengers() ) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public Car copy(){
		Car myCopy = new Car(getMake(), getModel(), getPlate(), getDoors(), getPassengers() );
		return myCopy;
	}
	
}