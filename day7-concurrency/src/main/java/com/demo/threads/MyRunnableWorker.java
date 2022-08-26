package com.demo.threads;

public class MyRunnableWorker implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread started...."+name+" "+Thread.currentThread().getPriority());

		try {
			for(int i=0;i<10;i++) {
				System.out.println("Thread running...."+name);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		System.out.println("Thread ended...."+name);
	}

}
