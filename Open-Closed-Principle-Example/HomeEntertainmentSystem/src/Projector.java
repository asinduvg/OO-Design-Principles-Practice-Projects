
public class Projector extends Device {

	@Override
	public void deviceOn() {
		System.out.println("Projector is turned on..");
	}

	@Override
	public void deviceOff() {
		System.out.println("Projector is turned off..");
	}

	@Override
	public String toString() {
		return "Projector";
	}

}
