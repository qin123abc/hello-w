package com.example.springboot_maven.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class   MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
//            Thread.sleep(1000);
        }
        return "我是返回值";
    }


    public static void main(String[] args) {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        long startTime = System.nanoTime();
        thread.start();
        try{
//            获取运行结果
            String result = futureTask.get();
            System.out.println(result);
            long endTime = System.nanoTime();
            long executionTime = endTime-startTime;
            System.out.println(executionTime/100000);
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
    }
}