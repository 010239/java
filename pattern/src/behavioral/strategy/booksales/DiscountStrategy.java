package behavioral.strategy.booksales;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public abstract class DiscountStrategy {
  protected double price = 0; //图书单价
  protected int copies = 0; //购买的册数

  protected DiscountStrategy(double price, int copies) {
    this.price = price;
    this.copies = copies;
  }

  /**
   * 策略方法
   *
   * @return
   */
  public abstract double calculateDiscount();
}
