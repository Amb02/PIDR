# Explications des choix de conceptions

## Introduction

### But

Ce document vise à expliquer brièvement la manière dont nous procédons pour générer l'ensemble des fichiers correspondant à un fichier donné sur lequel on effectue la transformation suivante : pour tous les tuples correspondant à un échange de données dans le protocole de n éléments, on s'intéresse à la générations de toutes ses combinaisons définie ainsi :
E={xi}i dans [|0,n|], n dans N, xi dans <String>
f : E -> F / qqesoit i dans [|0,n|] xi dans E <=> xi dans F et qqesoit (i,j) dans [|0,n|]², i<"j", E.indexOf(xi)<E.indexOf(xj) <=> F.indexOf(xi)<F.indexOf(xj)
F={yj}j dans [|0,m|], m dans N, yj dans FUE.

### Vocabulaire

On appelle fichier original un fichier à étudier.
On appelle fichier fils un fichier original après transformation telle que définie ci-dessus.
On appelle tuple un tuple correspondant à un échange de données dans le protocole.
Sauf mention contraire, le vocabulaire utilisé pour décrire nos choix (tels que ceux des structures de données, par exemple) correspond à celui du langage Java.

### Document

Ce docuement présentera succintement les classes que nous créons, puis ce qu'il se passe lors de l'exécution du code, et enfin quelques précisions sur les choix que nous avons dû poser.

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