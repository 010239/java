package behavioral.observer;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcreteObserver implements Observer {
  @Override
  public void update() {
    System.out.println("I am notified");
  }
}
