package PagamentoMultiplataforma;

public class FactoryPayPal extends PaymentFactory{
    @Override
    public IPayment createPayment() {
        return new PaymentPayPal();
    }
}
