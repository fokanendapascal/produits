# Produits
***
Gestion d'un Inventaire de Produits
## Table of contents
1. [General Information](#general-information)
2. [Technology](#technology)
3. [Test](#api test)
### General Information
***
L'application produits est une API qui va permettre de gérer un inventaire de produits avec suivi des stocks. Elle couvre les fonctionalités suivantes:
  1. l'enregistrement des produits,
  2. la mise à jour d'un produit,
  3. la suppression d'un produit,
  4. l'affichage de la liste des produits.
  5. la consultation d'un produit ainsi que le signalement en cas d'atteinte du seuil d'alerte. 
     Un produit doit avoir un nom, un prix et la quantité en stock.
## Technology
***
Comme technologie, nous avons utilisé pour le développemment de notre application les outils suivants:
  1. un IDE tel que Intellij community
  2. un framework Spring-Boot avec les dépendances telles que Spring Data JPA, Spring Web,
  3. une librairie lombok,
  4. une base de données postgresql,
  5. un logiciel openapi ou swagger pour faciliter la documentation notre API.
  6. une langage de programmation Java
  7. Postman, qui est un outil qui permet de tester les différentes fonctionnalités.
## Test
***
Pour tester notre API, vous devez suivre les étapes suivantes:

  1. Se connecter sur Swagger ou Postman à l'adresse: http://localhost:8083/product.
  2. Enregistrer les produits via un POST à l'adresse : http://localhost:8083/product/signup et remplir les champs nécessaires à l'enregistrement("name", "price", "quantity_stock") puis cliquez sur envoyer. Le statut 200 ok marque le succès de l'opération.
  3. Consulter la liste des produits via un GET à l'adresse: http://localhost:8083/product/
  4. Tester la mise à jour via un PUT à l'adresse: http://localhost:8083/product/{name}
  5. Tester la suppression via un DELETE à l'adresse: http://localhost:8083/product/{id}
  
