/**
 * 
 */
package com.pkp.java.thread;

import javax.swing.plaf.SliderUI;

/**
 * @author Pankaj Kumar
 *
 */
public class MyThread implements Runnable {

	private String name;

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		/**
		 * run method will get call by function Thread.start
		 */
		while (true) {
			System.out.println(" Thread " + name + " is running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
