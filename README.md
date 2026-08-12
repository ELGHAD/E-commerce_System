# Java E-commerce Order Management System

> Petit projet Java en programmation orientée objet illustrant la gestion de commandes avec classes et enums.

![Java](https://img.shields.io/badge/Java-17%2B-007396?style=flat&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Learning%20Project-blue)
![License](https://img.shields.io/badge/License-Not%20specified-lightgrey)

## Aperçu du projet

Ce projet est un exercice de programmation orientée objet en Java, simulant de façon simplifiée un système de gestion de commandes e-commerce. Il illustre l'utilisation de classes en composition (`Order` contient un `Customer`), ainsi que des enums typés pour représenter des états métier (statut de commande, méthode de paiement).

Il s'adresse à un public souhaitant évaluer une base solide en POO Java (encapsulation, composition, enums) sur un exemple volontairement compact, plutôt qu'une application e-commerce complète.

## Fonctionnalités clés

- Classe `Customer` — encapsule le nom et l'email d'un client (accès en lecture via getters).
- Classe `Order` — représente une commande liée à un client et une méthode de paiement, avec un statut initialisé par défaut à `PENDING`.
- Enum `OrderStatus` — définit les états possibles d'une commande (`PENDING`, `SHIPPED`, `DELIVERED`, `CANCELLED`), chacun associé à une description lisible.
- Enum `PaymentMethod` — définit les moyens de paiement acceptés (`CASH`, `CREDIT_CARD`, `PAYPAL`).
- Mise à jour de statut — méthode `updateStatus()` permettant de faire évoluer une commande dans le temps.
- Affichage formaté — méthode `printOrderDetails()` pour visualiser l'état complet d'une commande en console.

## Architecture & Stack technique

| Élément | Détail |
|---|---|
| **Langage** | Java 17+ |
| **Paradigme** | Programmation orientée objet (encapsulation, composition, enums typés) |
| **Build** | Aucun outil de build (Maven/Gradle) — compilation directe via `javac`, projet initialement configuré pour IntelliJ IDEA |
| **Persistance** | Aucune — les données sont créées en mémoire au sein de `Main.java` |

**Classes et enums :**

| Fichier | Rôle |
|---|---|
| `Customer.java` | Représente un client (nom, email) |
| `Order.java` | Représente une commande (id, client, paiement, statut) |
| `OrderStatus.java` | Enum des états d'une commande, avec description |
| `PaymentMethod.java` | Enum des méthodes de paiement |
| `Main.java` | Point d'entrée : crée des clients/commandes et démontre la mise à jour de statut |

## Installation & Démarrage rapide

### Prérequis
- JDK 17 ou supérieur

### Compilation et exécution

```bash
git clone https://github.com/ELGHAD/E-commerce_System.git
cd E-commerce_System/src

javac *.java
java Main
```

### Avec IntelliJ IDEA

Le projet inclut un fichier `.iml` — il suffit de l'ouvrir directement dans IntelliJ IDEA et d'exécuter `Main.java`.

## Structure du projet
      E-commerce_System/
      └── src/
      ├── Customer.java
      ├── Order.java
      ├── OrderStatus.java
      ├── PaymentMethod.java
      └── Main.java
      
## Bonnes pratiques mises en œuvre

- **Encapsulation** — attributs privés dans `Customer` et `Order`, exposés uniquement via des getters.
- **Composition** — `Order` référence un objet `Customer` plutôt que de dupliquer ses données.
- **Enums typés** — utilisation d'enums plutôt que de chaînes ou entiers magiques pour représenter le statut et le mode de paiement, avec `OrderStatus` enrichi d'une description associée à chaque valeur.
- **Valeur par défaut cohérente** — toute nouvelle commande démarre automatiquement au statut `PENDING`.

## Limites connues

Ce projet est un exercice pédagogique et n'implémente pas certains aspects attendus d'un vrai système e-commerce : pas de gestion de produits ni de prix, pas de persistance (base de données), pas de validation des entrées (email, montants), et aucun test unitaire. Ces points sont des pistes d'évolution naturelles s'il devait être étendu.

## Auteur & Contact

**Hamza Elrhadiouini**
Étudiant Ingénieur en Génie Logiciel (MIAGE) — EMSI Rabat

- GitHub : [@ELGHAD](https://github.com/ELGHAD)
- Portfolio : [elghad.github.io/hamza-elrhadiouini-portfolio](https://elghad.github.io/hamza-elrhadiouini-portfolio)
- Email : [hamelrhadiouini@gmail.com](mailto:hamelrhadiouini@gmail.com)
