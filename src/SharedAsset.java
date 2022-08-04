public class SharedAsset {

  // This is redundant coding just for learning

  String symbol;
  double totalCost;
  double currentPrice;

  // Constructor
  public SharedAsset(String symbol, double totalCost, double currentPrice) {
    this.symbol = symbol;
    this.totalCost = totalCost;
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
}

