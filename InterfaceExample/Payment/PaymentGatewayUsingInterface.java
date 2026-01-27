package InterfaceExample.Payment;

interface Payment {
    public abstract void processPayment();
    public abstract void applyDiscount();
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        IO.println("Processing Credit Card payment...");
    }

    @Override
    public void applyDiscount() {
        IO.println("Applying 10% discount for Credit Card payment");
    }
}

class UPIPayment implements Payment {
    @Override
    public void processPayment() {
        IO.println("Processing UPI payment...");
    }

    @Override
    public void applyDiscount() {
        IO.println("Applying 5% discount for UPI payment");
    }
}

class PaymentGateway {
    public Payment initiatePayment(String paymentType) {
        if (paymentType == null) return null;

        switch (paymentType.toLowerCase()) {
            case "creditcard":
                IO.println("Initiating Credit Card payment");
                return new CreditCardPayment();
            case "upi":
                IO.println("Initiating UPI payment");
                return new UPIPayment();
            default:
                IO.println("Invalid payment type selected!");
                return null;
        }
    }
}

class PaymentGatewayUsingInterface {
    public static void main(String[] args) {
        String paymentType = IO.readln("Enter Payment Type [CreditCard / UPI]: ");
        PaymentGateway paymentGateway = new PaymentGateway();
        Payment payment = paymentGateway.initiatePayment(paymentType);

        if (payment != null) {
            payment.processPayment();
            payment.applyDiscount();
        }
    }
}