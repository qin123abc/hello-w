package com.example.springboot_maven.test;

public class ExtendThread extends Thread{// 继承自Thread

    private String name;
    public ExtendThread(String name){
        this.name = name;
    }

    @Override
    public void run(){// 必须重写run方法，并且将线程任务放到run里执行
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
        ExtendThread t1 = new ExtendThread("线程一");
        ExtendThread t2 = new ExtendThread("线程二");
        t1.start();
        t2.start();
    }
}