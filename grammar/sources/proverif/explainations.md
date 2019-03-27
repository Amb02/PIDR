# Explications des choix de conceptions

//introduction-plan

## But des classes

* Tuple 				: _est une ArrayList<String> dont les éléments sont les éléments du Tuple. Construit avec son contexte, il contient sa forme originale et contiendra, à terme, toutes ses combinaisons._
* Tuples				: _est une ArrayList<Tuple>, liste globale des tuples présents dans un fichier donné._
* Combinations			: _classe finale, est construite une fois le fichier parcouru et contient la liste Tuples. Elle n'a pas vocation à être manipulée une fois construite. Elle génère toutes les combinaisons pour chacun des tuples, et indique ensuite combien de fichiers devront être générés._
* CombinationsHandler	: _connaît l'instance (car unique) de combinations. Elle a pour but de gérer la création de chaque fichier fils._

## Chronologie des événements

//pseudo-code du readme plus détaillé

## Choix posés

//pourquoi pas "à la volée" dans le visitor
//manière de gérer les différentes combinaisons
//[autres choix (il y en a sûrement...)]