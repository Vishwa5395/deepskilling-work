public class ObserverTest {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Rahul");

        Observer web = new WebApp("Amit");

        market.registerObserver(mobile);

        market.registerObserver(web);

        System.out.println("Updating Stock Price...\n");

        market.setStockPrice("TCS", 3850);

        System.out.println();

        market.setStockPrice("TCS", 3925);

    }

}