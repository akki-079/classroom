package com.demo.threads.pc;

import java.util.spi.AbstractResourceBundleProvider;

public class SharedQueue {

	private int data;
	private boolean valueSet = false;
	
	public synchronized void put(int data) {
		if(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		valueSet = true;
		System.out.println(Thread.currentThread().getName()+" put : "+ data);
		notifyAll();
	}
	
	public synchronized void get() {
		if(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet = false;
		System.out.println(Thread.currentThread().getName()+" got : "+ data);
		notifyAll();

	}

}
