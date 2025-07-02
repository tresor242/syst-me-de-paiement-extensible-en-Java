package ma.enset;

import ma.enset.dao.CreditCardPayment;
import ma.enset.dao.IPaymentMethod;
import ma.enset.dao.PaypalPayment;
import ma.enset.service.PaymentService;

/**
 * Classe principale de démonstration de traitement de paiements.
 */
public class Main {
    public static void main(String[] args) {
        // Paiement par carte de crédit
        IPaymentMethod paymentMethod = new CreditCardPayment();
        PaymentService service = new PaymentService(paymentMethod);
        service.processPayment(100.0);

        // Paiement via PayPal
        IPaymentMethod paypalMethod = new PaypalPayment();
        PaymentService paymentService = new PaymentService(paypalMethod);
        paymentService.processPayment(55.5);
    }
}
