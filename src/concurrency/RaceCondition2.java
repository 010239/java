package concurrency;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class RaceCondition2 {
  private static volatile boolean done;

  public synchronized static boolean isDone() {
    return done;
  }

  public synchronized static void setDone(boolean done) {
    RaceCondition2.done = done;
  }

  public static void main(String[] args) throws InterruptedException {
    new Thread(new Runnable() {
      @Override
      public void run() {
        int i = 0;
        while (!isDone()){
          i++;
        }
        System.out.println("done!");
      }
    }).start();

    System.out.println("OS: " + System.getProperty("os.name"));
    Thread.sleep(2000);
    setDone(true);
    System.out.println("flag done set to true");
  }
}
