package creational.prototype;

/**
 * @author DongZhukai
 * @date 14-7-29.
 */
public class Client {
  private Prototype prototype;

  public void operation(Prototype example){
    Prototype p = (Prototype) example.clone();
  }
}
