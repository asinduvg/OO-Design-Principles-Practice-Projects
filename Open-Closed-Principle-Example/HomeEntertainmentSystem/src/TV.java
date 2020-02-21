
public class TV extends Device{

	@Override
	public void deviceOn() {
		System.out.println("TV is turned on..");
	}

	@Override
	public void deviceOff() {
		System.out.println("TV is turned off..");
	}

	@Override
	public String toString() {
		return "TV";
	}

	
}
