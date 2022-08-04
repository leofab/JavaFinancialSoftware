public class Stocks extends SharedAsset {

  private int totalShares;

  public Stocks(String symbol, double totalCost, double currentPrice) {
    super(symbol, totalCost, currentPrice);
    totalShares =0;
  }


  @Override
  public double getMarketValue() {
    return totalShares*getCurrentPrice();
  }

  @Override
  public double getProfit() {
    return getMarketValue() - getTotalCost();
  }

  public int getTotalShares() {
    return totalShares;
  }

  public void setTotalShares(int totalShares) {
    this.totalShares = totalShares;
  }

  // Records a purchase of the given number of shares of the
  // stock at the given price per share
  public void purchase(int shares, double pricePerShare){
    totalShares += shares;
    addCost(shares * pricePerShare);
  }
}
