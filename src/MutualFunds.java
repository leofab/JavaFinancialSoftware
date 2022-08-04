public class MutualFunds extends SharedAsset implements Asset{

  private double totalShares;
  public MutualFunds(String symbol, double totalCost, double currentPrice) {
    super(symbol, totalCost, currentPrice);
    totalShares = 0.0;
  }

  @Override
  public double getMarketValue() {
    return totalShares * getCurrentPrice();
  }

  public double getTotalShares(){
    return totalShares;
  }

  @Override
  public double getProfit() {
    return getMarketValue() - getTotalCost();
  }

  // records purchase of the given shares at the given market price
  public void purchase(int shares, double pricePerShare){
    totalShares += shares;
    addCost(shares * pricePerShare);
  }
}
