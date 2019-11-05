package com.wtu.pool;

/**
 * 丢弃当前任务
 * DiscardRejectPolicy.java
 * Author: 逝风无言
 * Date: 2019年11月5日
 * Description: TODO
 *
 */
public class DiscardRejectPolicy implements RejectPolicy{

	@Override
	public void reject(Runnable task, MyThreadPoolExecutor myThreadPoolExecutor) {
		System.out.println("discard one task");
	}

}
