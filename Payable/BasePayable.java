package Payable;

public abstract class BasePayable implements Payable {
    protected PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod method) {
        this.paymentMethod = method;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
