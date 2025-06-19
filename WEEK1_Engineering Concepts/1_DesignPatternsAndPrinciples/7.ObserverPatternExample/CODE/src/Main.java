public class Main {
    public static void main(String[] args) {
        // Create stock market
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer mobileApp = new MobileApp("PhoneTrader");
        Observer webApp = new WebApp("WebInvestor");

        // Register observers
        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        // Price updates
        stockMarket.setStockPrice("AAPL", 189.55);
        System.out.println();
        stockMarket.setStockPrice("GOOGL", 2875.25);
    }
}

