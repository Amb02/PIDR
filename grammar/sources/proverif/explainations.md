# Explications des choix de conceptions

## Introduction

### But

Ce document vise à expliquer brièvement la manière dont nous procédons pour générer l'ensemble des fichiers correspondant à un fichier donné sur lequel on effectue la transformation suivante : pour tous les tuples correspondant à un échange de données dans le protocole de n éléments, on s'intéresse à la générations de toutes ses combinaisons définie ainsi :

&forall; n &isin; N, E<sub>n</sub>={x<sub>i</sub>}<sub>i &isin; [|0,n|]</sub>, x<sub>i</sub> dans {String}

f : E -> F /
* &forall; i &isin; [|0,n|] x<sub>i</sub> &isin; E => x<sub>i</sub> &isin; F (même éléments)
* &forall; (i,j) &isin; [|0,n|]², i<"j", E.indexOf(x<sub>i</sub>)<E.indexOf(x<sub>j</sub>) <=> F.indexOf(x<sub>i</sub>)<F.indexOf(x<sub>j</sub>) (conservation de l'ordre)
* F={y<sub>j</sub>}<sub>j &isin; [|0,m|]</sub>, m &isin; N, y<sub>j</sub> &isin; FUE et &forall; j &isin; [|0,m|], si y<sub>j</sub> &isin;F, taille (y<sub>j</sub>) = 2

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




* Parsing du fichier original
    * Si un Tuple est recontré :
        * On crée un objet `Tuple tuple` contenant ce dernier
            * On génère en attribut de cet objet toutes les combinaisons possibles de ce dernier

            **Implantation 	:** On ne génère pas le nouveau fichier ici car Antlr ne gère pas idéalement les opérations à insérer d'une part, et pour mieux maîtriser ou tout du moins faciliter la gestion de la création des fichiers (le nombre de fichiers et leur contenu ne pouvant être déterminé qu'après la fin de l'analyse) d'autre part.
        * On ajoute `tuple` à la liste `Tuples tuples`, la liste de tous les tuples du fichier.
        * On indique dans une HashMap que la ligne subit une modification en lui notifiant que `tuple` est lié à cette ligne

        **Implantation 	:**  En effet, lors de la création des fichiers cela permet de repérer directement les lignes devant être modifiées et ainsi éviter de faire des "replace" dans le fichier copié autant de fois qu'il y a de tuples. De plus,  il peut y avoir plusieurs tuples par ligne et une HashMap permet d'optimiser cette gestion.
* On calcule le nombre de fichier à générer

**Implantation 	:** `sizes` est la liste des tailles de tuples existantes dans le fichier original.

_**Exemple 		:** `sizes={3,6,7}` veut dire que le fichier contient et ne contient que des tuples de taille 3, 6, et 7._
* On boucle sur ce nombre de fichier. Pour un fichier n°i :
    * On crée le fichier n°i
    * On trouve alors le bon ensemble de combinaisons. Pour trouver la bonne combiaison pour chaque tuple à partir du numéro de fichier i, on procède comme un compteur à base différente pour chaque digit, où chaque digit représente une taille, et contient la k-ième combinaison pour les tuples de cette taille. A noter la cohérence avec la formule (i) qui correspond au maximum du compteur.
    
    **Implantation 	:** `indexOfCombinations` renseigne pour chaque taille quelle combinaison doit être utilisée. `indexOfCombinations` est donc de taille ` sizes.size()`. De plus, `indexOfCombinations.get(k)`, renseigne sur la combinaisons des tuples de taille k correspondant à une taille ` indexOfCombinations.get(k)`. En pratique, on aura besoin de remonter la chaîne d'informations dans l'autre sens. A partir d'un tuple, on veut accéder à sa combinaison. On veut donc obtenir son indice dans `indexOfCombinations`, ce qui nous est donné, pour un tuple donné `tuple` par `sizes.indexOf(tuple.size())`. Enfin, il est à noter que pour un tuple de taille k, sa case correspondante dans `indexOfCombinations` varie entre 0 et le nombre de combinaisons possibles pour un tuple de taille k.
    
    _**Exemple 		:** En reprenant l'exemple précédent, pour `indexOfCombinations={1,3,0}`, tous les tuples de taille 3 seront parenthésés selon le 2ème parenthésage (n°1), ceux de taille 6 avec le 4ème, et ceux de taille 7 avec le 1er._

        * On parcourt donc chaque tuple dont l'on stocke la combinaison pour ce fichier i
    * On remplit le fichier i en lisant le fichier original ligne par ligne
        * Si la ligne i doit subir une modification :
            * Pour chaque tuple lié à la ligne, on remplace celui-ci par la combinaison correspondant au fichier i
            * On imprime la nouvelle ligne
        * Sinon, on imprime la ligne lue

    * On met à jour les numéros de combinaison pour chaque catégorie de tuple (taille).

    **Implantation 	:** On doit parcourir toutes les combinaisons de numéro de combinaison pour chaque catégorie de tuple. On peut proposer un problème similaire qui est celui d'un compteur qui est en fait `indexOfCombinations`, où chaque case est un chiffre, de base différente. Or, on ne connaît que i, le numéro du fichier, et il faut retrouver la combinaison (ensemble de) combinaisons/parenthésage correspondante.

    _**Exemple 		:** Pour illustrer ce problème, on peut considérer que l'on a 19200s, et l'on doit retrouver le nombre sur les nombres de jour, heures, minutes, secondes._

    **Implantation 	:** On voit donc que l'on peut procéder par divisions euclidiennes successives puis exploiter la partie entière et le reste, récursivement, la base (diviseur) changeant à chaque appel (valant en fait le nombre de combinaisons possible pour un tuple `tuple` de taille `sizes.indexOf(tuple.size())`). L'autre solution, _a priori_ plus simple à implanter, est d'incrémenter le compteur.






## Autre choix posés

* En plus des raisons détaillées plus haut (qui sont les raisons principales), la création de structures de données, la connaissance de certains objets, les imports java, sont quelques raisons parmi d'autre pour lesquelles nous ne remplaçons pas les tuples "à la volée".
* Certains `replaceTuple` peuvent être optimisés (autant de replace sur la ligne que de tuples) mais la complexité (proportionelle sur les lignes au nombre de tuple par ligne) n'est pas si grande et par rapport à la complexité du traitement est relativement faible. Nous avons fait le choix de prioriser les résultats vis-à-vis de la date qui nous était fixée.
* %other explanations
