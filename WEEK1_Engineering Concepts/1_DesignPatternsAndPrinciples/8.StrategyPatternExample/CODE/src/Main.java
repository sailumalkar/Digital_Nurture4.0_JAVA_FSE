public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.processPayment(500.0);

        System.out.println();

        // Pay with PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.processPayment(750.0);
    }
}

