package remotecontrol;

public class Radio {
    int volume;
    
    public void TurnOn() {
		System.out.println("Turn on Radio!!");
		
	}
	public void SetVolume(int volume) {
		this.volume = volume;
		System.out.println("Radio volume :" + volume);
		
	}

}
