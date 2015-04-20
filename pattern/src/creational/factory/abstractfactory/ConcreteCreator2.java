package creational.factory.abstractfactory;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class ConcreteCreator2 implements Creator {
  @Override
  public ProductA factoryA() {
    return new ProductA2();
  }

  @Override
  public ProductB factoryB() {
    return new ProductB2();
  }
}
