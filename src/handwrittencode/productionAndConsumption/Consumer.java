package handwrittencode.productionAndConsumption;

import java.util.List;

public class Consumer implements Runnable {
    private List list;
    Consumer(List list){
        this.list = list;
    }
    @Override
    public void run() {
        while (true){
            synchronized (list){
                if (list.size()==0){
                    //仓库空了，不能消费
                    try {
                        list.wait();  //直到调用notify才会被唤醒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //can consumer
                Object o = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"--->"+o);
                list.notify();
            }
        }


    }
}
