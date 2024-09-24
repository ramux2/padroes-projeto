package PagamentoMultiplataforma;

public class PaymentPayPal implements IPayment{
    private String email = "user@paypal.com";

    @Override
    public void processPayment(double value) {
        if (isValidEmail()) {
            System.out.println("Pagamento por PayPal de " + value + " confirmado.");
        } else {
            System.out.println("Erro: conta PayPal não vinculada ao e-mail.");
        }
    }

    private boolean isValidEmail() {
        return email.endsWith("@paypal.com");
    }
}
