package concurrency;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class RaceCondition {
  //如果两个线程竞争使用相同的资源或数据，那么我们就将这种情况称为竞争条件。
  private static volatile boolean done;

  public static void main(String[] args) throws InterruptedException {
    new Thread(new Runnable() {
      @Override
      public void run() {
        int i = 0;
        while (!done){
          i++;
        }
        System.out.println("done!");
      }
    }).start();

    System.out.println("OS: " + System.getProperty("os.name"));
    Thread.sleep(2000);
    done = true;
    System.out.println("flag done set to true");
  }

}
