package behavioral.observer;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcreteSubject implements Subject {
  private Vector observerVector = new Vector();

  @Override
  public void attach(Observer observer) {
    observerVector.add(observer);
  }

  @Override
  public void detach(Observer observer) {
    observerVector.remove(observer);
  }

  @Override
  public void notifyObservers() {
    Iterator it = observerVector.iterator();
    while (it.hasNext()){
      ((Observer)it.next()).update();
    }
  }
}
