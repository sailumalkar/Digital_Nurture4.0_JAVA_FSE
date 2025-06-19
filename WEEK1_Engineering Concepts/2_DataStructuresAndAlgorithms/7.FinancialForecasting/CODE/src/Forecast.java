public class Forecast {

    // Recursive forecast function
    public static double forecastValue(int years, double currentValue, double growthRate) {
        if (years == 0) {
            return currentValue;
        }
        return forecastValue(years - 1, currentValue, growthRate) * (1 + growthRate);
    }

    // Optimized version using memoization
    public static double forecastMemo(int years, double currentValue, double growthRate, double[] memo) {
        if (years == 0) return currentValue;
        if (memo[years] != 0) return memo[years];
        memo[years] = forecastMemo(years - 1, currentValue, growthRate, memo) * (1 + growthRate);
        return memo[years];
    }
}
