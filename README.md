# syst-me-de-paiement-extensible-en-Java
# 💳 Payment Strategy – Java

Ce projet Java démontre l'utilisation du **Design Pattern Strategy** pour construire un système de paiement flexible, évolutif et bien structuré.

##  Objectif

Permettre à un service de paiement d'utiliser dynamiquement différentes méthodes de paiement sans modifier le cœur du système.

##  Fonctionnalités

- Implémentation du **design pattern Strategy**
- Séparation des responsabilités (interface, DAO, service)
- Injection de dépendances par le constructeur
- Respect des principes SOLID

## Structure du code

- `IPaymentMethod` : interface représentant une méthode de paiement
- `CreditCardPayment` / `PaypalPayment` : implémentations concrètes
- `PaymentService` : service qui applique la stratégie de paiement
- `Main` : exécute deux cas de test simples (carte de crédit et PayPal)

## Concepts utilisés

- Design Patterns (Strategy)
- SOLID
- Architecture modulaire
- Encapsulation et abstraction

## Exécution

Compilez et exécutez le projet en ligne de commande :

```bash
javac -d out $(find ./src -name "*.java")
java -cp out ma.enset.Main
