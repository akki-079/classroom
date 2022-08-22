package com.demo.interfaces.ex2;

public class PanasonicTv implements UniversalRemote {

	@Override
	public void switchOn() {
		System.out.println("Switch on PanasonicTv");		
	}

	@Override
	public void switchOff() {
		System.out.println("Switch off PanasonicTv");		
	}

	@Override
	public void setChannel(int channelNo) {
		System.out.println("set channel number to "+channelNo+" on PanasonicTv");		
	}

	

}
