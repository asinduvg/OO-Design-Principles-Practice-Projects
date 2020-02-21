
public class SurroundSoundSystem extends Device {

	@Override
	public void deviceOn() {
		System.out.println("Surround Sound System is turned on..");
	}

	@Override
	public void deviceOff() {
		System.out.println("Surround Sound System is turned off..");
	}
	
	@Override
	public String toString() {
		return "SurroundSoundSystem";
	}

}
