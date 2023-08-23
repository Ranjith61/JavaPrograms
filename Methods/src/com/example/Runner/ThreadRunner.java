package com.example.Runner;

public class ThreadRunner {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		
		int priority = thread.getPriority();
		System.out.println(priority);
		
		int count = Thread.activeCount();
		System.out.println(count);
		
		boolean interrupted = Thread.interrupted();
		System.out.println(interrupted);
	
		boolean holds = Thread.holdsLock(thread);
		System.out.println(holds);
		
	}

}
