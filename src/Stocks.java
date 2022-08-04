public class Stocks extends SharedAsset implements Asset{


  public Stocks(String symbol, double totalCost, double currentPrice) {
    super(symbol, totalCost, currentPrice);
  }

  @Override
  public double getMarketValue() {
    return 0;
  }

  @Override
  public double getProfit() {
    return 0;
  }
}
