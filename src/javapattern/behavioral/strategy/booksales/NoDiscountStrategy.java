package javapattern.behavioral.strategy.booksales;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class NoDiscountStrategy extends DiscountStrategy {

  protected NoDiscountStrategy(double price, int copies) {
    super(price, copies);
  }

  @Override
  public double calculateDiscount() {
    return 0;
  }
}
