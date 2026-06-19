public class AdapterPatternTest {

    public static void main(String[] args) {

        PayPalGateway payPalGateway = new PayPalGateway();

        PaymentProcessor processor =
                new PayPalAdapter(payPalGateway);

        processor.processPayment(5000);
    }
}