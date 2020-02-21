
public class Person {

	public static void main(String[] args) {
		Projector projector = new Projector();
		SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();
		TV tv = new TV();
		
		RemoteControl remoteControl = RemoteControl.getInstance();
		remoteControl.connectToDevice(projector);
		remoteControl.clickOnButton();
		
		
		remoteControl.connectToDevice(surroundSoundSystem);
		remoteControl.clickOnButton();
		remoteControl.clickOffButton();
	}

}
