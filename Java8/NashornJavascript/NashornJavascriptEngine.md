
---

# README - Nashorn JavaScript Engine (Java 8)

## Introduction

Nashorn est un moteur JavaScript moderne introduit dans Java 8. Il permet d'exécuter du code JavaScript directement à l'intérieur d'applications Java, offrant ainsi la possibilité d'ajouter des fonctionnalités dynamiques et de personnaliser le comportement de votre application.

## Utilisation de base

### Importation des classes nécessaires

Pour utiliser Nashorn dans votre application Java, commencez par importer les classes nécessaires :

```java
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
```

### Création d'une instance de `ScriptEngine`

Créez une instance de `ScriptEngine` pour Nashorn :

```java
ScriptEngineManager engineManager = new ScriptEngineManager();
ScriptEngine engine = engineManager.getEngineByName("nashorn");
```

### Exécution de code JavaScript

Vous pouvez exécuter du code JavaScript en utilisant la méthode `eval` de l'`engine` :

```java
try {
    engine.eval("print('Hello, Nashorn!')");
} catch (ScriptException e) {
    e.printStackTrace();
}
```

### Interaction avec des objets Java

Nashorn permet une interaction fluide entre Java et JavaScript. Vous pouvez définir des variables JavaScript et accéder à des objets Java depuis vos scripts JavaScript :

```java
// Définir une variable JavaScript
engine.eval("var message = 'Hello from JavaScript';");

// Récupérer la valeur de la variable JavaScript dans Java
String messageFromJS = (String) engine.eval("message;");
```

### Gestion des exceptions

N'oubliez pas de gérer les exceptions qui pourraient être levées lors de l'exécution de code JavaScript. Les erreurs JavaScript peuvent être capturées et gérées dans un bloc `try-catch`.

## Avantages de Nashorn

- **Performance améliorée** : Nashorn est généralement plus rapide que le moteur JavaScript précédent (Rhino) grâce à des optimisations.

- **Compatibilité ECMAScript 5.1** : Nashorn prend en charge la spécification ECMAScript 5.1, ce qui le rend compatible avec de nombreuses fonctionnalités modernes du langage JavaScript.

- **Intégration avec Java** : Vous pouvez facilement intégrer du code JavaScript dans une application Java existante, ce qui permet d'ajouter des fonctionnalités dynamiques ou de personnaliser le comportement de l'application.

## Cas d'utilisation courants

- **Personnalisation de scripts** : Vous pouvez permettre aux utilisateurs de personnaliser le comportement de votre application en écrivant des scripts JavaScript.

- **Tests unitaires** : Nashorn peut être utilisé pour exécuter des tests unitaires en JavaScript dans le cadre de votre suite de tests Java.

- **Manipulation de données** : Vous pouvez utiliser JavaScript pour manipuler des données ou effectuer des calculs complexes dans une application Java.

## Exemple d'utilisation

Un exemple complet d'utilisation de Nashorn se trouve dans le fichier `Example.java` du projet.

## Documentation

Pour en savoir plus sur Nashorn, consultez la documentation officielle de Java :
[Documentation Oracle sur Nashorn](https://docs.oracle.com/en/java/javase/8/docs/technotes/guides/scripting/nashorn/)

---
