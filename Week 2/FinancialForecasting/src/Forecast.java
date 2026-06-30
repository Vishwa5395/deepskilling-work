public class Forecast {

    public static double futureValue(double amount,
                                     double rate,
                                     int years) {

        // Base Case
        if(years == 0)
            return amount;

        // Recursive Call
        return futureValue(amount, rate, years - 1)
                * (1 + rate);

    }

}