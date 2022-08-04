public class DividendStocks extends Stocks{

  private double dividends; // number of dividends paid

  public DividendStocks(String symbol, double totalCost, double currentPrice) {
    super(symbol, totalCost, currentPrice);
    dividends = 0.0;
  }

  @Override
  public double getMarketValue() {
    return super.getMarketValue() + dividends;
  }

  @Override
  public double getProfit() {
    return super.getProfit();
  }

  // records a dividend of the given amount per share
  public void payDividend(double amountPerShare){
    dividends = amountPerShare * getTotalShares();
  }
}
