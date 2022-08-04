public class CodeTest {
  public static void main(String[] args){


    // Case Study: Financial Software

    /**
     * We have Stocks, Dividends Stocks, Mutual Funds, Real State, Cash....
     *
     *
     * How you would design a complete portfolio system?
     * What new types of objects would you write?
     *
     * **/

    // 1st step - First we would have the classes Stocks, Dividend Stocks, Mutual Funds, Cash
    // 2nd step - Relations : Dividend Stocs extends Stocks

    // 3rd step -Because different assets compute their market values in different ways
    //           We use Interface : getMarketValue and getProfit

    // 4tg step - Similarities between mutual funds and stocks
    //            both stores assets that are based on shares
  }
}
