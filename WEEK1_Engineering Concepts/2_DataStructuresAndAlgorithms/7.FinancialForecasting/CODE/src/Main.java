public class Main {
    public static void main(String[] args) {
        double initialValue = 10000;
        double growthRate = 0.08; // 8% annual growth
        int years = 5;

        System.out.println(" Financial Forecast (Recursive):");
        double forecast = Forecast.forecastValue(years, initialValue, growthRate);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, forecast);

        System.out.println("\n Financial Forecast (Memoized):");
        double[] memo = new double[years + 1];
        double memoForecast = Forecast.forecastMemo(years, initialValue, growthRate, memo);
        System.out.printf("Predicted value after %d years: ₹%.2f\n", years, memoForecast);
    }
}
