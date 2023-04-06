package handwrittencode.psynchronized;

public class MySynchronized {
    //静态变量的安全通过类锁方式实现，实例变量一个对象一个，不用考虑线程安全问题。
//    synchronized（谁的共享对象）{  （）中填写多线程共享的那个对象。
//      线程同步代码块
//    }表示线程同步机制
    public  void main(String[] args) {
        synchronized (this){

        }
    }
    /*
    在Java中每个对象都有一个对象锁，这把锁就是一个标记，只是把他叫做锁。
    一个线程进来拿到对象的对象锁，然后下一个对象来拿这个对象锁的时候得排队。括号里面放一个共享对象就行。
    写"ABC"也行，英文abc在字符常量池中，对象也只有一个，如果写"abc"所有线程都会同步。
     */
}
