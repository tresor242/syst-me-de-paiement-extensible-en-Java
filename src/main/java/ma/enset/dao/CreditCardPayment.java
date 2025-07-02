package ma.enset.dao;

/**
 * Implémentation de la méthode de paiement par carte de crédit.
 */
public class CreditCardPayment implements IPaymentMethod {

    /**
     * Effectue un paiement via carte de crédit.
     * @param amount le montant à payer
     */
    @Override
    public void pay(Double amount) {
        System.out.println("Paiement par carte de credit : " + amount + "$");
    }
}
