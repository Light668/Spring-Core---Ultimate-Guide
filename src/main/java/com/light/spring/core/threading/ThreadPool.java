package com.light.spring.core.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPool {

	public static void main(String[] args) {

		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		/*
		 * fixedThreadPool.submit(new TheadingBasics.MyRunnable());
		 * fixedThreadPool.submit(new TheadingBasics.MyRunnable());
		 * fixedThreadPool.submit(new TheadingBasics.MyRunnable());
		 * fixedThreadPool.submit(new TheadingBasics.MyRunnable());
		 * fixedThreadPool.submit(new TheadingBasics.MyRunnable());
		 */

		ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
		/*
		 * cachedThreadPool.submit(new ThreadPool.MyRunnable());
		 * cachedThreadPool.submit(new ThreadPool.MyRunnable());
		 * cachedThreadPool.submit(new ThreadPool.MyRunnable());
		 * cachedThreadPool.submit(new ThreadPool.MyRunnable());
		 * cachedThreadPool.submit(new ThreadPool.MyRunnable());
		 */

		ExecutorService singelThreadExecutor = Executors.newSingleThreadExecutor();
		/*
		 * singelThreadExecutor.submit(new ThreadPool.MyRunnable());
		 * singelThreadExecutor.submit(new ThreadPool.MyRunnable());
		 * singelThreadExecutor.submit(new ThreadPool.MyRunnable());
		 * singelThreadExecutor.submit(new ThreadPool.MyRunnable());
		 * singelThreadExecutor.submit(new ThreadPool.MyRunnable());
		 */

		ScheduledExecutorService singleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
//		singleThreadScheduledExecutor.schedule(new ThreadPool.MyRunnable(), 3, TimeUnit.SECONDS);
		singleThreadScheduledExecutor.scheduleAtFixedRate(new ThreadPool.MyRunnable(), 3, 5, TimeUnit.SECONDS);
	}

	static class MyRunnable implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName());
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
