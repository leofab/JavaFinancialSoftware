public class Cash implements Asset{

  public double amount; // amout of money held

  public Cash(double amount) {
    this.amount = amount;
  }

  public void setAmount(double amount){
    this.amount = amount;
  }

  @Override
  public double getMarketValue() {
    return amount;
  }

  // no profit cause cash is a fixed value
  @Override
  public double getProfit() {
    return 0;
  }
}
