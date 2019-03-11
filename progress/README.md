## Etat d'avancement
##### Avancement au 11/03/2019
---

###### Analyseur lexical

* Nous avons terminé l'analyseur simple du langage après avoir bataillé avec ANTLR, nous avons dû changer de version et passer à la version 4 (pour voir comment mettre en place l'environnement d'ANTLR vous pouvez vous rendre [ici](../grammar/sources)).

* Nous avons testé notre analyseur sur tous les fichiers de tests en notre possession (une pastille verte signifie que le fichier est correctement parsé) :

![parsing examples](parsing_examples.png)

* Nous avons aussi réussi à créer une copie au moment de l'analyse. Les copies sont stockées pour le moment dans le dossier logs :

![copies_examples](copies_examples.png)

Ci-dessous, un exemple avec le fichier NS-completed.pv.log :

![copy_example](copy_example.png)

* Nous avons réussi à extraire les règles de séquence qui nous intéressent pour la suite de notre travail. Ci-dessous, un exemple avec le fichier NS-completed.pv :

![rules](sequence_example.png)

* Problèmes :

On voit bien avec l'exemple ci-dessus que les règles ne concernent pas uniquement les séquences qui nous intéressent. Il nous faut donc un moyen de trier parmi ces résultats ceux que l'on doit modifier ou non.

###### Analyse de trace

* L'analyse de la trace a été pour nous plus difficile, nous avons toujours du mal à comprendre. Evidemment nous arrivons, en nous basant sur le protocole, à retrouver certaines choses dans la globalité. Mais dès qu'il s'agit de regarder dans le détail, alors nous sommes très rapidement perdus avec des détails qui nous bloquent.

  Ci-dessous, une liste desdits problèmes :
  * in copy a_x (à la fin de la plupart des lignes)
  * les noms des variables qui apparaissent parfois pour ne plus jamais apparaître, et pour d'autres qui arrivent sans avoir été définis
  * les appels aux fonctions event
  * l'intérêt exact des fonctions sign, get keys, insert keys
  * les fonctions in (nous avons du mal à comprendre quelle machine recoit bel et bien le message dans la fonction in)

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
