public class FinancialForecasting {

    public static double forecast(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return forecast(amount * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {

        double currentValue = 10000;
        double growthRate = 0.10; // 10%
        int years = 5;

        double futureValue = forecast(currentValue, growthRate, years);

        System.out.println("Future Value after " + years + " years: " + futureValue);
    }
}
