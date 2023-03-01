package handwrittencode;

public class ReasonablyTerminateThreads {
    public static void main(String[] args) {
        MyThread2 t = new MyThread2();
        Thread thread = new Thread(t);
        thread.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Terminate the thread;
        t.flag = false;

    }
}

class MyThread2 implements Runnable{
    boolean flag = true;
    @Override
    public void run() {

        for (int i = 0; i<100;i++){

            if (flag) {
                System.out.println(Thread.currentThread().getName() + "==>" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }


    }
}