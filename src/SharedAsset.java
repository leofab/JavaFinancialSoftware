public abstract class SharedAsset implements Asset {

  // This is redundant coding just for learning
  // after that class is made abstract, there is no more redundancy

  String symbol;
  double totalCost;
  double currentPrice;

  // Constructor
  public SharedAsset(String symbol, double totalCost, double currentPrice) {
    this.symbol = symbol;
    totalCost = 0.0;
    this.currentPrice = currentPrice;
  }

    // adds a cost of the given amount to this asset

    public void addCost(double cost){
        totalCost += cost;
    }

    // returns the price per share of this asset
    public double getCurrentPrice(){
      return currentPrice;
    }
    public double getTotalCost(){
    return totalCost;
    }

  public void setCurrentPrice(double currentPrice) {
    this.currentPrice = currentPrice;
  }

  // returns the current market value of this asset
  public abstract double getMarketValue();

  // returns the profit earned on shares of this asset
  public double getProfit(){
    // calls an abstract getMarketValue method created above
    return getMarketValue() - totalCost;
  }
}

