package session13.challenge.online_shopping_system;

public class Payment {
    private PaymentMethod paymentMethod;
    private double paymentAmount;
    private PaymentStatus paymentStatus;

    public Payment(PaymentMethod paymentMethod, double paymentAmount, PaymentStatus paymentStatus) {
        this.paymentMethod = paymentMethod;
        this.paymentAmount = paymentAmount;
        this.paymentStatus = paymentStatus;
    }

    public void processPayment(){
        System.out.println("processing the payment so hard! totally processing this payment");
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentMethod=" + paymentMethod +
                ", paymentAmount=" + paymentAmount +
                ", paymentStatus=" + paymentStatus +
                '}';
    }

    public void updatePaymentStatus(PaymentStatus newStatus){
        paymentStatus = newStatus;
    }
}
