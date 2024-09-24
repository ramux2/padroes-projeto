package PagamentoMultiplataforma;

public class PaymentService {
    public void processPayments(PaymentFactory paymentFactory, double value) {
        IPayment payment = paymentFactory.createPayment();
        payment.processPayment(value);
    }
}
