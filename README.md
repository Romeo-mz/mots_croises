# Projet de Gestion de Mots dans une Grille de Mots Croisés

Ce projet est une implémentation en Java de la gestion de mots dans une grille de mots croisés. Il permet de créer une grille de mots croisés, d'ajouter des mots dans la grille en vérifiant qu'ils respectent les contraintes de la grille, et de vérifier si tous les mots ont été placés correctement.

## Fonctionnalités

Le projet propose les fonctionnalités suivantes :

- Création d'une grille de mots croisés avec une taille horizontale et verticale spécifiée.
- Initialisation de la grille avec des mots à placer en tant que caractères.
- Affichage de la grille de mots croisés.
- Ajout de mots dans la grille en vérifiant les contraintes de la grille.
- Vérification si tous les mots ont été placés correctement dans la grille.

## Classes et Méthodes

Le projet est composé des classes suivantes :

- `Mot` : Représente un mot à placer dans la grille. Cette classe a des attributs tels que le mot lui-même, sa direction (horizontale ou verticale), et ses coordonnées de début et de fin sur la grille.
    - Méthodes :
        - `Mot(String mot, int debutLigne, int debutColonne, Direction direction)`: Constructeur pour créer un objet Mot avec le mot spécifié, sa position de début et sa direction.
        - Autres membres de la classe (getters, setters, etc.).


- `Grille` : Classe principale qui représente la grille de mots croisés.
    - Méthodes :
        - `Grille(int nbLignes, int nbColonnes)`: Constructeur pour créer une grille de mots croisés avec la taille horizontale et verticale spécifiée.
        - `setGrille(char[][] mots)`: Méthode pour initialiser la grille avec des cases vides et les caractères des mots à placer.
        - `showGrille()`: Méthode pour afficher la grille de mots croisés.

