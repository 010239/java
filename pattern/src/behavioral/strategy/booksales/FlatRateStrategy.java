package behavioral.strategy.booksales;

/**
 * @author DongZhukai
 * @date 14-7-26.
 */
public class FlatRateStrategy extends DiscountStrategy {
  private double amount;

  protected FlatRateStrategy(double price, int copies) {
    super(price, copies);
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  @Override
  public double calculateDiscount() {
    return copies * amount;
  }
}
