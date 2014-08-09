package javapattern.behavioral.observer;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public interface Subject {
  /**
   * 调用这个方法登记一个新的观察者对象
   */
  public void attach(Observer observer);

  public void detach(Observer observer);

  void notifyObservers();
}
