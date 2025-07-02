package ma.enset.service;

import ma.enset.dao.IPaymentMethod;

/**
 * Service permettant de traiter un paiement en utilisant une stratégie de paiement.
 * Implémente le design pattern Strategy.
 */
public class PaymentService {
    private IPaymentMethod paymentMethod;

    /**
     * Constructeur avec injection de la méthode de paiement à utiliser.
     * @param paymentMethod la stratégie de paiement
     */
    public PaymentService(IPaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * Traite un paiement d’un montant donné en utilisant la méthode injectée.
     * @param amount le montant à payer
     */
    public void processPayment(double amount){
        paymentMethod.pay(amount);
    }
}
