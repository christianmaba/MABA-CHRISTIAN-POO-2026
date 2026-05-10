# TP3 - IPPlan-Manager : Collections

## Objectif du TP
Ce TP introduit les collections et la composition d'objets dans le projet
IPPlan-Manager. Un équipement peut maintenant posséder plusieurs interfaces
et une infrastructure contient plusieurs sous-réseaux et équipements.

## Classes créées ou modifiées
- AdresseIP : inchangée
- ReseauIP : inchangée
- InterfaceReseau : inchangée
- Equipement : modifiée avec ArrayList d'interfaces
- SousReseau : nouvelle classe
- InfrastructureReseau : nouvelle classe principale

## Réponses aux questions

### Question 1
La composition est une relation où un objet contient d'autres objets.
Par exemple, une InfrastructureReseau contient des Equipements et des SousReseaux.

### Question 2
On utilise ArrayList parce qu'elle permet de gérer dynamiquement
un nombre variable d'objets sans limite fixe à l'avance.

### Question 3
Une variable simple stocke un seul objet. Une collection comme ArrayList
peut stocker plusieurs objets et permet d'en ajouter ou supprimer dynamiquement.

### Question 4
Un équipement possède plusieurs interfaces parce que dans la réalité,
un routeur ou un switch possède plusieurs ports réseau physiques.

### Question 5
Une infrastructure réseau contient plusieurs sous-réseaux parce qu'une
entreprise découpe généralement son réseau en zones distinctes comme
ADMIN, TECH, WIFI pour mieux organiser et sécuriser son réseau.

### Question 6
La boucle for-each permet de parcourir tous les éléments d'une collection
automatiquement sans gérer manuellement un index ou compteur.

### Question 7
La classe InfrastructureReseau devient importante parce qu'elle regroupe
tous les objets du projet en un seul endroit, comme dans la réalité
où une infrastructure centralise tous les équipements et réseaux.

### Question 8
Les collections sont indispensables dans les applications professionnelles
parce qu'on ne peut pas prévoir à l'avance le nombre d'objets à gérer.
Une entreprise peut avoir 10 ou 1000 équipements, les collections s'adaptent.
