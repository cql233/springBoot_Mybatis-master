package com.cql.thread;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.*;

public class ExecutorTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor= new ThreadPoolExecutor(
                5,// corePoolSize：      线程池维护线程的最少数量 （core : 核心）
                10,//maximumPoolSize：   线程池维护线程的最大数量
                1L,//keepAliveTime：     线程池维护线程所允许的空闲时间
                TimeUnit.SECONDS,/// unit：               线程池维护线程所允许的空闲时间的单位
                 new LinkedBlockingDeque<>(),//workQueue：          线程池所使用的缓冲队列
                Executors.defaultThreadFactory(),//
                new ThreadPoolExecutor.DiscardOldestPolicy());// handler：            线程池对拒绝任务的处理策略
        Set<Integer> set=new HashSet<>();
        for(int i =0;i<1000;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    set.add((int) Math.random()*100);
                    Thread.currentThread().getId();
                }
            });
        }
    }
}
