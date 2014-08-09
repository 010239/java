package javapattern.behavioral.strategy.booksales;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class PercentageStrategy extends DiscountStrategy {
  private double percent;

  protected PercentageStrategy(double price, int copies) {
    super(price, copies);
  }

  public double getPercent() {
    return percent;
  }

  public void setPercent(double percent) {
    this.percent = percent;
  }

  @Override
  public double calculateDiscount() {
    return copies * price * percent;
  }
}
