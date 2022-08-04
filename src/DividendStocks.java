public class DividendStocks extends Stocks{

  public DividendStocks(String symbol, double totalCost, double currentPrice) {
    super(symbol, totalCost, currentPrice);
  }

  @Override
  public double getMarketValue() {
    return super.getMarketValue();
  }

  @Override
  public double getProfit() {
    return super.getProfit();
  }
}
