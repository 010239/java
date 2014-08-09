package javapattern.creational.prototype;

/**
 * @author DongZhukai
 * @date 14-7-29.
 */
public class Client2 {
  private PrototypeManager manager;
  private Prototype prototype;
  public void registerPrototype(){
    prototype = new ConcretePrototype();
    Prototype copytype = (Prototype) prototype.clone();
    manager.add(copytype);
  }
}
