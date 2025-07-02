package ma.enset.dao;

/**
 * Interface représentant une méthode de paiement.
 * Toute classe qui implémente cette interface doit fournir une implémentation de la méthode pay.
 */
public interface IPaymentMethod {
    /**
     * Effectue un paiement d’un montant donné.
     * @param amount le montant à payer
     */
    void pay(Double amount);
}
