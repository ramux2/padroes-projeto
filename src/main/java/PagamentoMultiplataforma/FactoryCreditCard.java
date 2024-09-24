package PagamentoMultiplataforma;

public class FactoryCreditCard extends PaymentFactory{
    @Override
    public IPayment createPayment() {
        return new PaymentCreditCard();
    }
}
