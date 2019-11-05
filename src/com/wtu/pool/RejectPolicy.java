package com.wtu.pool;

/**
 * 拒绝策略
 * RejectPolicy.java
 * Author: 逝风无言
 * Date: 2019年11月5日
 * Description: TODO
 *
 */
public interface RejectPolicy {
	void reject(Runnable task,MyThreadPoolExecutor myThreadPoolExecutor);
}
