package com.example.springboot_maven.test;

public class MyRunnable implements Runnable{// 必须要实现Runnable接口
    private String name;
    public MyRunnable(String name){
        this.name = name;
    }
    @Override
    public void run() {// 必须要有run方法，并且将需要执行的任务放到run方法里
        for (int i= 0; i<5; i++){
            System.out.println(name + i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable1 = new MyRunnable("线程a");
        MyRunnable runnable2 = new MyRunnable("线程A");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread2.start();
        thread1.start();
    }


}