# Java Streams (Flux Java)

Les Java Streams (Flux Java) sont une fonctionnalité puissante introduite dans Java 8. Ils permettent de traiter de manière séquentielle ou parallèle des séquences d'éléments (comme des collections) de manière déclarative et efficace. Les streams simplifient le traitement des données en Java en offrant une manière concise d'effectuer des opérations sur les éléments d'une séquence.
Def pour les entretiens: Flux de données sur lesquels on peut appliquer des opérations de traitement d'une manière parallèle ou séquentielle.
## Caractéristiques Clés des Streams Java

1. **Séquentiels ou Parallèles :** Les streams Java peuvent être traités de manière séquentielle ou parallèle, ce qui permet d'exploiter la puissance des processeurs multi-cœurs pour les opérations de traitement des données.
2. **Opérations intermédières:** Les opérations intermédiaires sont des opérations que vous pouvez appliquer à un stream pour transformer ou filtrer ses éléments. Ces opérations ne produisent pas de résultat final tant qu'une opération terminale n'est pas appelée. Quelques exemples d'opérations intermédiaires sont `filter`, `map`, `distinct`, `sorted`, `limit` et `skip`.
3. **Opérations terminales :** Les opérations terminales sont des opérations qui déclenchent le traitement du stream et génèrent un résultat. Quelques exemples d'opérations terminales sont `forEach`, `count`, `collect`, `reduce` et `anyMatch`.
4. **Paresseux (Lazy) :** Les streams Java sont paresseux, ce qui signifie qu'ils ne calculent réellement les éléments que lorsqu'une opération de terminal est appelée. Cela permet d'optimiser les performances en évitant le calcul inutile.