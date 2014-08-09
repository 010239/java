package javapattern.creational.builder;

/**
 * @author DongZhukai
 * @date 14-7-28.
 */
public class ConcreteBuilder extends Builder {
  private Product product = new Product();
  @Override
  public void buildPart1() {

  }

  @Override
  public void buildPart2() {

  }

  @Override
  public Product retrieveResult() {
    return product;
  }
}
