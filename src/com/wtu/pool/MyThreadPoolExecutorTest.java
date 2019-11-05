package com.wtu.pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class MyThreadPoolExecutorTest {

	public static void main(String[] args) {
		Executor thExecutor =new MyThreadPoolExecutor("test", 5, 10, new ArrayBlockingQueue<Runnable>(15), new DiscardRejectPolicy());
		AtomicInteger num = new AtomicInteger(0);
		for(int i=0;i<19;i++) {
			thExecutor.execute(()->{
				try {
					Thread.sleep(1000);
					System.out.println("running"+System.currentTimeMillis()+" "+num.incrementAndGet());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		}
	}

}
