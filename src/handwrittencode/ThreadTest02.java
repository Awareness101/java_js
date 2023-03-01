package handwrittencode;
  //通过匿名内部类的方式实现接口
public class ThreadTest02 {
    public static void main(String[] args) {
      Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
          System.out.println("匿名内部类的方式实现接口");
        }
      });
      thread.start();
    }

}
