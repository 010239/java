package javapattern.creational.factory.abstractfactory;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public interface Creator {
  public ProductA factoryA();

  public ProductB factoryB();
}
