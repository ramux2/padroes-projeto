package PagamentoMultiplataforma;

public class PaymentCripto implements IPayment{
    private double walletBalance = 500.0;

    @Override
    public void processPayment(double value) {
        if (hasSufficientBalance(value)) {
            System.out.println("Pagamento por criptomoeda de " + value + " confirmado.");
        } else {
            System.out.println("Erro: saldo insuficiente na carteira digital.");
        }
    }

    private boolean hasSufficientBalance(double value) {
        return walletBalance >= value;
    }
}
