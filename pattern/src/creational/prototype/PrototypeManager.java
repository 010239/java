package creational.prototype;

import java.util.Vector;

/**
 * @author DongZhukai
 * @date 14-7-29.
 */
public class PrototypeManager {
  private Vector vector = new Vector();

  public void add(Prototype p){
    vector.add(p);
  }

  public Object get(int i){
    return vector.get(i);
  }
}
