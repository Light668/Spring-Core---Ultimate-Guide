package com.light.spring.core.threading;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;

public class SpringClassExecutor {


	@Bean
	public SimpleAsyncTaskExecutor simpleAsyncTaskExecutor() {
		return new SimpleAsyncTaskExecutor();
	}
	
	@Bean
	public SyncTaskExecutor syncTaskExecutor() {
		return new SyncTaskExecutor();
	}
	
	@Bean
	public TaskExecutorAdapter taskExecutorAdapter() {
		return new TaskExecutorAdapter(Executors.newFixedThreadPool(3));
	}
	
	public void doExecute(Runnable task) {
		
	}
}
