package handwrittencode.productionAndConsumption;

import java.util.List;

public class Producer implements Runnable {
    private List list;
    Producer(List list){
        this.list = list;
    }
    @Override
    public void run( ) {
        while (true){
            synchronized (list){
                if (list.size()>0){
                    //厂库满了，不需要继续生产
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //需要生产
                Object o = new Object();
                list.add(o);
                System.out.println(Thread.currentThread().getName()+"--->"+o);
                list.notify();
            }
        }


    }
}
