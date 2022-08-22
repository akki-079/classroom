package com.demo.interfaces.ex2;

public class BPLTv implements UniversalRemote {

	@Override
	public void switchOn() {
		System.out.println("Switch on BPLTv");		
	}

	@Override
	public void switchOff() {
		System.out.println("Switch off BPLTv");		
	}

	@Override
	public void setChannel(int channelNo) {
		System.out.println("set channel number to "+channelNo+" on BPLTv");		
	}

	

}
