package creational.prototype;

/**
 * @author DongZhukai
 * @date 14-7-29.
 */
public class ConcretePrototype implements Prototype {
  @Override
  public Object clone() {
    try {
      return super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      return null;
    }
  }
}
