# Axopen - Candidature

## Lancement du projet

Pour lancer le projet il vous faut une base de données `MySQL` qui tourne sur votre poste.

Une fois que `MySQL` est lancé vous allez devoir créer une base de données qui s'intitule `candidature`.

La dernière étape avant de pouvoir lancer l'API sera de modifier les fichiers de configuration pour que l'API pointe sur votre base de données.

Rendez-vous dans le fichier `./src/main/resources/application.properties`

Vous allez devoir modifier la section du haut du fichier en remplacent les éléments par vos informations. 

```properties
############################
# ---    DATASOURCE    --- #
############################
spring.datasource.url=jdbc:mysql://localhost:3306/DB_NAME
spring.datasource.username=DB_USERNAME
spring.datasource.password=DB_PASSWORD
```

Vous pouvez maintenant lancer l'application, le contenu de la base de données va se créer tout seul.

## Architecture du projet

Le code java qui va permettre à l'API de fonctionner se trouve dans le repertoire : `/src/main/java/fr/axopen/candidature`.

Nous allons détailler rapidement ce qui se trouve dans chaque dossier.

- `bo` contient les objets Java qui représentent la base de données.
- `config` contient toute la configuration.
- `dto` contient les classes Java utilisé lors des transactions avec l'utilisateur de l'API. DTO (Data Transfert Object).
- `mapper` Contient les classes qui permettent le mapping.
- `repository` contient les interfaces qui permettent d'interagir avec la base de données.
- `rest` contient les controllers qui sont les points d'entrés de l'API.
- `service` contient les services de l'application.

Le repertoire suivant va contenir les ressources de l'application : `/src/main/resources`.

- `application.properties` contient les propriétés liées à l'API, les paramètres de connexion à la base de données ...
- `db/migration` contient les scripts de migration qui permettent de construire automatiquement la base de données au lancement de l'API.

## Swagger

Swagger et un outil de documentation, après avoir lancé l'API vous trouverez une interface décrivant les différents endpoints de l'API à cet url : `http://localhost:8080/swagger-ui/index.html`
