public class MutualFunds extends SharedAsset{

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


  // records purchase of the given shares at the given market price
  public void purchase(int shares, double pricePerShare){
    totalShares += shares;
    addCost(shares * pricePerShare);
  }
}
