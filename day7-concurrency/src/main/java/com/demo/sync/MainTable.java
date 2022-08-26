package com.demo.sync;

public class MainTable {

	public static synchronized void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new TableWorker(new TableGenerator(),6));
		Thread t2 = new Thread(new TableWorker(new TableGenerator(),8));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
