package creational.factory.abstractfactory;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcreteCreator1 implements Creator {
  @Override
  public ProductA factoryA() {
    return new ProductA1();
  }

  @Override
  public ProductB factoryB() {
    return new ProductB1();
  }
}
