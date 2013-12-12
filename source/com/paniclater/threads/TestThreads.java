package com.paniclater.threads;

public class TestThreads {
	
	public static void main(String[] args) {
		TestRunnable myRunnable = new TestRunnable();
		Thread myThread = new Thread(myRunnable);
		Thread anotherThread = new Thread(myRunnable);
		ExtendsThread lastThread = new ExtendsThread();
		myThread.start();
		anotherThread.start();
		lastThread.start();
	}
}
class ExtendsThread extends Thread {
	String[] names = {"Bobby", "Andrea", "Dave", "Todd", "Kevin", "Ryan"};
	int i = 0;
	public void run() {
		for (int i = 0; i < 100; i++) {
			//Threads have a name and an id. These members may be accessed through the getName() and getId() methods.
			System.out.println("Running from extends" + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
			//You can also set the thread name
			i = (int)(Math.random() * names.length);
			Thread.currentThread().setName(names[i]);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			} 
		}
	}
}
class TestRunnable implements Runnable {
	public void run() {
		for(int i = 0; i < 100; i++) {

			System.out.println("Running from implements" + Thread.currentThread().getName() + " " + Thread.currentThread().getId());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			} 
		}
	}
}