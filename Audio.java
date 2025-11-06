package remotecontrol;

public class Audio implements RemoteControl {
    int volume;
    
    public void TurnOn() {
		System.out.println("Turn on Audio!!";)
		
	}
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Audio volume :" + volume);
		
	}


}
