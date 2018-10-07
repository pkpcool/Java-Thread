/**
 * 
 */
package com.pkp.java.thread;

/**
 * @author Pankaj Kumar
 *
 */
public class ThreadMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Initializing the threads and running
		 */
		Thread thread1 = new Thread(new MyRunnable(" One "));
		Thread thread2 = new Thread(new MyRunnable(" two "));
		
		thread1.start();
		thread2.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// 
			e.printStackTrace();
		}
		thread1.stop();
		thread2.stop();
	}

}
