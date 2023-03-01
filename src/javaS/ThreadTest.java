package javaS;

public class ThreadTest {
    /*
    关于sleep（）方法
     */

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        try {
            thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world!!!");

    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i<10000; i++){
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
    }
}
