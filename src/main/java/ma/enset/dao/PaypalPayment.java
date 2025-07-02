package ma.enset.dao;

/**
 * Implémentation de la méthode de paiement via PayPal.
 */
public class PaypalPayment implements IPaymentMethod {

    /**
     * Effectue un paiement via PayPal.
     * @param amount le montant à payer
     */
    @Override
    public void pay(Double amount) {
        System.out.println("Paiement via PayPal : " + amount + "$");
    }
}
