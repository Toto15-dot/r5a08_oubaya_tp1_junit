Oubaya Tawfiq 12515130

# r5a08_oubaya_tp1_junit

## Dépôt pour les séances de travail pratique pour la ressource R5A08 qualité de développement

## Question sur build.gradle

Le fichier build.gradle contient les dépendances nécessaires pour compiler le projet et exécuter les tests unitaires.

### JUnit Jupiter API

La dépendance :

org.junit.jupiter:junit-jupiter-api:5.8.2

fournit l'API de JUnit 5 utilisée pour écrire les tests unitaires.

Elle permet notamment d'utiliser les annotations comme :

@Test

### JUnit Jupiter Engine

La dépendance :

org.junit.jupiter:junit-jupiter-engine:5.8.2

permet d'exécuter les tests JUnit 5.

L'API permet donc d'écrire les tests et le moteur permet de les exécuter.

### AssertJ

La dépendance :

org.assertj:assertj-core:3.22.0

fournit une bibliothèque d'assertions permettant d'écrire des vérifications dans les tests.

Par exemple :

assertThat(result).isEqualTo("Bonjour, Tawfiq");

### useJUnitPlatform()

Dans build.gradle, on trouve :

test {
    useJUnitPlatform()
}

Cela indique à Gradle d'utiliser la plateforme JUnit pour exécuter les tests.

## Q1 - Création de la méthode formatGreeting

La classe UserGreeting contient la méthode :

formatGreeting(String nom)

Elle retourne :

Bonjour, nom

Par exemple, pour le nom "Tawfiq", le résultat est :

Bonjour, Tawfiq

## Q2 - Test de formatGreeting

Un test JUnit a été créé dans UserGreetingTest.

Le test vérifie que :

UserGreeting.formatGreeting("Tawfiq")

retourne :

Bonjour, Tawfiq

## Q3 - Contraintes sur le nom

La méthode formatGreeting vérifie plusieurs contraintes.

Le nom ne doit pas être vide.

Le nom ne doit pas dépasser 10 caractères.

Le nom ne doit pas contenir d'espaces ou de caractères spéciaux.

Lorsqu'une contrainte n'est pas respectée, la méthode lance une UserGreetingFailureException.

## Q4 - Tests unitaires

Les tests vérifient notamment :

- le fonctionnement avec un nom valide ;
- le refus d'un nom vide ;
- le refus d'un nom de plus de 10 caractères ;
- le refus d'un nom contenant un espace ;
- le refus d'un nom contenant un caractère spécial ;
- l'acceptation d'un nom contenant exactement 10 caractères.

Les tests sont exécutés avec Gradle et JUnit 5.
