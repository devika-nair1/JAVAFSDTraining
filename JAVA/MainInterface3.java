package com.ust.examples;

abstract interface MusicPlayer{
	public static final int defaultVolume = 30;
	public abstract void play();
	public abstract void stop();
}

class AudioPlayer implements MusicPlayer{
	public  void play() 
	{
		System.out.println("The player is ON ");
	}
	
	public void stop() 
	{
		System.out.println("The player is OFF");
	}
}


public class MainInterface3 {

	public static void main(String[] args) {
		AudioPlayer aud = new AudioPlayer();
		aud.play();
			}

}
