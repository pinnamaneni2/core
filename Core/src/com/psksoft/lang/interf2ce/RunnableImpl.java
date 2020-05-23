package com.psksoft.lang.interf2ce;


/***
 * 
 * @author p91s
 *
 */

/***
 The Runnable interface should be implemented by anyclass whose instances are intended to be executed by a thread.
 The class must define a method of no arguments called run.
 This interface is designed to provide a common protocol for objects that wish to execute code while they are active. 
 	For example, Runnable is implemented by class Thread.Being active simply means that a thread has been started and 
 	has not yet been stopped. 

In addition, Runnable provides the means for a class to be active while not subclassing Thread. 
A class that implements Runnable can run without sub classing Thread by instantiating 
	a Thread instance and passing itself in as the target. In most cases, 
the Runnable interface should be used if you are only planning to override the run()method 
and no other Thread methods.This is important because classes should not be sub classed unless the
 programmer intends on modifying or enhancing the fundamental behavior of the class.
 *
 */
public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		System.out.println("in side RunnableImpl");
		
	}

}
