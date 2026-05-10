# TP2 - IPPlan-Manager : Encapsulation

## Objectif du TP
Ce TP améliore le projet IPPlan-Manager en introduisant l'encapsulation.
Les attributs sont maintenant privés et protégés par des getters et setters
avec validation des données.

## Classes modifiées
- AdresseIP : attribut private, getter, setter avec validation
- ReseauIP : attributs private, getters, setters avec validation du masque CIDR
- InterfaceReseau : attributs private, getters, setters avec validation du nom
- Equipement : attributs private, getters, setters avec validation

## Nouveautés par rapport au TP1
- Attributs déclarés private
- Getters et Setters ajoutés
- Validation des données dans les setters
- Valeurs par défaut en cas de données invalides
- Méthode estAdresseLocale() ajoutée dans AdresseIP

## Ce que j'ai appris
- L'encapsulation protège les données des objets
- Les setters permettent de contrôler les modifications
- Les getters permettent de lire les données de manière sécurisée
- Une valeur invalide est remplacée par une valeur par défaut
