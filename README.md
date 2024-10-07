markdown
# Gestion des Employés

## Description
Ce projet consiste à gérer les employés dans une petite entreprise. L'entreprise compte cinq employés organisés dans une hiérarchie, avec un directeur général, un manager et trois développeurs. L'objectif est d'afficher les noms et les salaires des employés du plus haut au plus bas dans la hiérarchie.

## Diagramme de Classe
![image](https://github.com/user-attachments/assets/c717bea8-0252-449d-9d50-e6895475ce96)

## Partie I : Couche accès aux données

### Connexion à la Base de Données
Créez un fichier `base.properties` à la racine de votre projet contenant les informations de connexion à la base de données :
properties
![image](https://github.com/user-attachments/assets/c98cb62e-4071-482b-81ee-116d8937f960)



### Classe Connexion
Créez la classe `Connexion` dans le package `ma.projet.connexion` pour gérer la connexion à la base de données :
![image](https://github.com/user-attachments/assets/affd4ed5-1ab4-4505-aedf-ceb974c1fbe3)



## Partie II : Couche Métier

### Classes de l'Entreprise
Création des classes `Personne`, `Manager`, `Developpeur` dans le package `ma.projet.entities` :
![image](https://github.com/user-attachments/assets/9d79b983-ff29-4da8-aca1-8ee8ca9c1dcb) ![image](https://github.com/user-attachments/assets/f4164d59-e220-4547-9ebe-d1301cd24ce5) ![image](https://github.com/user-attachments/assets/084bbbaa-cee2-4157-b6a1-4808b1237c20)




### Interface IDao
 l'interface `IDao` dans le package `ma.projet.dao`.
![image](https://github.com/user-attachments/assets/1e8e7577-7a39-40ae-922c-70fcd758c537)

### Services
Implémentation des classes de service `ManagerService` et `DeveloppeurService` dans le package `ma.projet.service` :
![image](https://github.com/user-attachments/assets/35e57760-f331-4cb9-bcab-a323f628271d)

## Partie III : Tests

### Classe Entreprise
Création de la classe `Entreprise` dans le package `ma.projet.test` pour tester les opérations CRUD. Cette classe doit :
- Créer deux développeurs
- Créer un manager qui gère les deux développeurs créés précédemment
- Créer un troisième développeur
- Créer un directeur général qui gère le manager et le troisième employé
- Afficher les noms et les salaires des employés de haut en bas de la hiérarchie
![image](https://github.com/user-attachments/assets/c8a4b18b-d973-4817-bd90-17d12f2233ff)
 ![image](https://github.com/user-attachments/assets/74e46e0c-de2f-4d99-87ce-faea664c7b50)
Pout le resultat final:
![image](https://github.com/user-attachments/assets/fd847f25-1e1e-41ed-9c4b-6f9290496e55)


