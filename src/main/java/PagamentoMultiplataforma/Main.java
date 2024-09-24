package PagamentoMultiplataforma;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayments(new FactoryCreditCard(), 100.0);

        paymentService.processPayments(new FactoryCripto(), 200.0);

        paymentService.processPayments(new FactoryPayPal(), 150.0);
    }
}