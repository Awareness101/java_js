package handwrittencode;
/*
实现Java.lang.Runnable接口，new一个线程对象， 将实现了Runnable的类作为参数传入

建议使用接口方式，使用接口的扩展力更好，以后还能继承别的类。
 */

public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        Thread thread = new Thread(myThread1);
        thread.start();
        for (int i = 0; i<1000; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
class MyThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i<1000; i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}