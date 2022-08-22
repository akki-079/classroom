package com.demo.interfaces.ex2;

public class SonyTv implements UniversalRemote {

	@Override
	public void switchOn() {
		System.out.println("Switch on SonyTv");		
	}

	@Override
	public void switchOff() {
		System.out.println("Switch off SonyTv");		
	}

	@Override
	public void setChannel(int channelNo) {
		System.out.println("set channel number to "+channelNo+" on SonyTv");		
	}

	

}
