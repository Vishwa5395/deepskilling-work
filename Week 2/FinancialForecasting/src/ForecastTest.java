public class ForecastTest {

    public static void main(String[] args) {

        double amount = 10000;

        double rate = 0.10;

        int years = 5;

        double future =
                Forecast.futureValue(amount,
                        rate,
                        years);

        System.out.println("Current Amount : ₹"
                + amount);

        System.out.println("Growth Rate : "
                + (rate * 100) + "%");

        System.out.println("Years : "
                + years);

        System.out.println("Future Value : ₹"
                + future);

    }

}