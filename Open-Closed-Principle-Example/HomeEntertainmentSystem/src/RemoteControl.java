
public class RemoteControl {

	private Device device = null;
	private static final RemoteControl INSTANCE = new RemoteControl();

	private RemoteControl() {
	}

	public static RemoteControl getInstance() {
		return INSTANCE;
	}

	public void connectToDevice(Device aDevice) {
		if (device != null) {
			disconnectFromDevice();
		}
		this.device = aDevice;
		System.out.println("--connected to : " + device + "--");
	}

	public void disconnectFromDevice() {
		System.out.println("--Disconnected from : " + device + "--\n");
		this.device = null;
	}

	public void clickOnButton() {
		device.deviceOn();
	}

	public void clickOffButton() {
		device.deviceOff();
	}
}
