# TP1 - IPPlan-Manager

## Objectif du TP
Ce TP permet de découvrir les premières classes Java du projet IPPlan-Manager.
Il représente les objets fondamentaux du domaine réseau : 
adresse IP, réseau IP, interface réseau et équipement.

## Classes créées
- AdresseIP
- ReseauIP
- InterfaceReseau
- Equipement
- Main

## Réponses aux questions

### Question 1
Une adresse IP est représentée par une classe plutôt qu'un simple String
parce qu'une classe permet de regrouper les données et les méthodes ensemble.
Ainsi, on peut ajouter des méthodes comme afficher() ou plus tard 
des validations du format de l'adresse.

### Question 2
Une classe est un modèle ou un plan de construction.
Un objet est une instance concrète créée à partir de ce modèle.
Exemple : AdresseIP est la classe, ipRouteur est l'objet créé.

### Question 3
Le constructeur est une méthode spéciale qui s'exécute automatiquement 
lors de la création d'un objet.
Il permet d'initialiser les attributs de l'objet avec des valeurs de départ.

### Question 4
La classe InterfaceReseau contient un objet de type AdresseIP parce qu'une 
interface réseau est toujours associée à une adresse IP.
Cela représente fidèlement la réalité du réseau.

### Question 5
La classe Equipement contient un objet de type InterfaceReseau parce qu'un 
équipement réseau possède toujours au moins une interface réseau.
C'est cette interface qui lui permet de communiquer sur le réseau.

### Question 6
La limite actuelle de la classe Equipement est qu'elle ne peut contenir 
qu'une seule interface réseau (interfacePrincipale).
Dans la réalité, un routeur ou un switch peut avoir plusieurs interfaces.

### Question 7
Cette version n'est pas suffisante pour produire automatiquement un plan 
d'adressage IP parce qu'il n'y a pas encore de calcul automatique 
des sous-réseaux, pas de validation des adresses IP, et pas de 
mécanisme pour attribuer automatiquement les adresses aux équipements.
