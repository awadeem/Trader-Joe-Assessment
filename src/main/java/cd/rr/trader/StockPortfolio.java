package cd.rr.trader;

public class StockPortfolio {

     static double value = 300;
      public static int transferFee = 10;


     public StockPortfolio(double value,int transferFee){
         this.value=value;
         StockPortfolio.transferFee=transferFee;
     }

    public static double getValue() {
        return value;
    }

    public static void setTransferFee(int transferFee) {
        StockPortfolio.transferFee = transferFee;
    }

    public static double applyChange(double totalValue){
         double changePer = (value/totalValue)*100;
        return changePer;
    }
}
