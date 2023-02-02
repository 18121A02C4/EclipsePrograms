package Interfaces;

public class NiceCar {
	Engine engine=new PowerEngine();
	Media player=new Cdplayer();
	public void start() {
		engine.start();
	}
	public void stop() {
		engine.stop();
	}
	public void startMusic() {
		player.start();
	}
	public void stopMusic() {
		player.stop();
	}
	public void upgradeEngine() {
		engine=new ElectricEngine();
	}
	

}
