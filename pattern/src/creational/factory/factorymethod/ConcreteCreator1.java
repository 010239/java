package creational.factory.factorymethod;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcreteCreator1 implements Creator {
  @Override
  public Product factory() {
    return new ConcreteProduct1();
  }
}
