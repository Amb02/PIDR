## Etat d'avancement

##### Avancement au 26/02/2019
---

###### Modification des fichiers d'exemples

* Nous avons revu les tests de manière à cette fois avoir 6 cas.
  * Ainsi, pour NeedhamSchroeder, si nous avons (a,b) et l'élément c à rajouter, on a ((c,a),b) (c,(a,b)) ((a,c),b) (a,(c,b)) ((a,b),c) (a,(b,c)). Nous avons revu les fichiers pour NeedhamSchroederSK.pv.
  * Ne trouvant (étonnemment) pas d'attaque, nous avons fait de même pour NeedhamSchroederPK.pv, où là encore le résultat est surprenant mais à l'inverse puisque l'attaque subsiste dans tous les cas.
  * Les résultats de ces modifications se trouvent respectivement dans [ce dossier](../examples/NeedhamSchroederSK) ainsi que [celui-ci](../examples/NeedhamSchroederPK). Nous avons aussi répertorié dans un fichier README.md les résultats de l'exécution de ProVerif sur chacun des fichiers.

* Problèmes rencontrés :
  * Invariation des résultats en fonction des parenthésages pour ces fichiers alors que c'est censé influer dans le cas de NeedhamSchroeder.

###### Analyseur lexical

* Nous avons repris la grammaire modifée du langage, que nous avons écrite dans [AntlrWorks](https://www.antlr3.org/works/), afin d'exploiter [ANTLR](https://doc.lagout.org/programmation/Pragmatic%20Programmers/The%20Definitive%20ANTLR%20Reference.pdf). Après la résolution de quelques problèmes (récursivité, cycles, ...) nous obtenons une première version d'un parseur. Nous devons encore affiner nos tests car nous n'avons pas eu le temps de vérifier le bon fonctionnement du parseur sur une batterie de tests suffisemment importante.


##### Avancement au 11/02/2019
---

###### Modification des fichiers d'exemples

* Nous avons pris et modifié les deux fichiers NS-completed.pv et NeedhamSchroederSK.pv.
Les résultats de ces modifications se trouvent respectivement dans [ce dossier](../examples/NS-completed) ainsi que [celui-ci](../examples/NeedhamSchroeder). Nous avons aussi répertorié dans un fichier README.md les résultats de l'exécution de ProVerif sur chacun des fichiers.

* Problèmes rencontrés :
  * Nous avons eu du mal à lire et surtout comprendre la trace d'attaque engendrée sur les fichiers notamment [ici](../examples/NS-completed/attacks)

###### Analyseur lexical

* Nous avons repris la grammaire modifée du langage, et tenté de refléchir à la méthode la plus efficace de mettre en place cet analyseur. En nous basant sur les connaissances que nous avons acquises l'année passée, nous avons commencé par lister pour chacune des règles les symboles directeurs, permettant, à la lecture d'un token, de connaître la règle à traiter.

* Nous nous basons sur l'algorithme suivant pour notre analyseur :

![algo](algo.png)

* Problèmes rencontrés :
  * Nous nous demandons s'il est possible de nous y prendre autrement. Nous avons connaissance d'un outil, ANTLR, qui permet de générer automatiquement un analyseur lexical à partir d'une grammaire. L'avantage de ce programme est qu'il est capable de gérer une analyse tant ascendante que descendante et sur des grammaires de tous types, contrairement à l'analyseur que l'on se propose de construire qui ne fonctionnerait que sur des grammaires LL(1) et en analyse descendante. Or, nous n'avons pas d'informations sur les caractéristiques de la grammaire de ProVerif.
