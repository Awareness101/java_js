package handwrittencode.productionAndConsumption;

import java.util.ArrayList;
import java.util.List;

//模拟线程生产和消费，使用list来模拟仓库
public class TheadTest {


    public static void main(String[] args) {
        List list = new ArrayList();
        Thread thread1 = new Thread(new Consumer(list));
        Thread thread2 = new Thread(new Producer(list));
        thread1.setName("消费者线程");
        thread2.setName("生产者线程");
        thread1.start();
        thread2.start();
    }
}
