package PagamentoMultiplataforma;

public class FactoryCripto extends PaymentFactory{
    @Override
    public IPayment createPayment() {
        return new PaymentCripto();
    }
}
