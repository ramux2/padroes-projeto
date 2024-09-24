package PagamentoMultiplataforma;

public class PaymentCreditCard implements IPayment{
    private String cardNumber = "1234567812345678";

    @Override
    public void processPayment(double value) {
        if (isValidCardNumber()) {
            System.out.println("Pagamento por cartão de crédito de " + value + " confirmado.");
        } else {
            System.out.println("Erro: número do cartão inválido.");
        }
    }

    private boolean isValidCardNumber() {
        return cardNumber.length() == 16;
    }
}
