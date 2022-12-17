package tV;

public class Television {

	private int channel;
	private int volumeLevel = 0;
	private boolean isOn;
	private boolean status;

	public Television() {
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public boolean isOn() {
		return turnOn();
	}
	public boolean isOff() {
		return status;
	}

	public void setOn(boolean on) {
		isOn = on;
	}

	public void increaseVolume(){
			if(volumeLevel < 100) {
				this.volumeLevel++;
			}
	}

	public void decreaseVolume(){
			if(volumeLevel >= 100) {
				this.volumeLevel--;
			}
	}
	public void increaseChannel(){
		if(channel < 50){
			this.channel++;
		}
	}
	public void decreaseChannel(){
		if(channel >= 50){
			this.channel--;
		}
	}

	private boolean turnOn(){
		status = true;
		return true;
	}


}
