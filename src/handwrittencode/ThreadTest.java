package handwrittencode;
/*
   java中，实现线程常用的线程有两种方式。
   第一种方式，编写一个类，直接继承Java.lang.thread,重写run方法。
   java程序是从上到下依次执行，这是亘古不变的道理。

   第二种方式，编写一个类，实现java.lang.runnable接口。
    */
public class ThreadTest {

    public static void main(String[] args) {

        MyThread myThread =new MyThread();
        //调用run方法，不会真正启动一个线程
        //myThread.run();

        //真正启动一个分支线程，栈最底部是run（）方法。
        myThread.start();

        for (int i = 0; i<1000; i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
class MyThread extends Thread{
    @Override
    public void run() {
     for (int i =0; i<1000; i++){
         System.out.println(Thread.currentThread().getName()+":"+i);
     }
    }
}
