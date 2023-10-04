
# Méthodes par Défaut en Java

Les "Méthodes par Défaut" (Default Methods) sont l'une des fonctionnalités introduites dans Java 8. Elles permettent d'ajouter des méthodes aux interfaces Java sans rompre la compatibilité avec les classes existantes qui implémentent ces interfaces. Cette fonctionnalité simplifie l'extension des interfaces en permettant d'y ajouter des implémentations par défaut de méthodes.

## Utilisation des Méthodes par Défaut

1. **Déclaration d'une Méthode par Défaut :** Une méthode par défaut est déclarée dans une interface en utilisant le mot-clé `default`. Elle fournit une implémentation par défaut pour la méthode.

   ```java
   interface MyInterface {
       default void defaultMethod() {
           // Implémentation par défaut
       }
   }

2. **Implémentation dans une Classe :** Les classes qui implémentent cette interface peuvent utiliser la méthode par défaut sans être obligées de la redéfinir.

   ```java
   class MyClass implements MyInterface {
       // Pas besoin de redéfinir defaultMethod
   }
   ```

3. **Éviter l'Ambiguïté :** Si une classe implémente plusieurs interfaces avec des méthodes par défaut portant le même nom, elle doit fournir une implémentation pour cette méthode pour éviter l'ambiguïté.


#### Remarques:

1. Les Méthodes par Défaut permettent d'ajouter des méthodes aux interfaces sans casser la compatibilité avec les classes existantes qui les implémentent.
2. Les classes qui implémentent ces interfaces peuvent utiliser les Méthodes par Défaut telles quelles, sans être obligées de les redéfinir.
3. Lorsqu'une classe implémente plusieurs interfaces avec des méthodes par défaut portant le même nom, elle doit fournir une implémentation pour éviter l'ambiguïté.

Les Méthodes par Défaut sont utiles pour étendre des interfaces existantes de manière rétrocompatible, ce qui les rend précieuses dans le cadre de l'évolution des bibliothèques Java.
```