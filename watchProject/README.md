# Meeting Sport
=====

Fonctionnement du site: 

Meeting sport a été créé pour permettre aux gens voulant pratiquer un sport mais n'ayant personne avec qui jouer de trouver des partenaires.
Ce site à pour unique but de mettre en relation les personnes voulant pratiquer un sport.

Une fois inscrit sur la plateforme, vous aurez la possibilité de créer un évènement pour indiquer aux autres utlisateurs:
le lieu, le moment, quel sport sera pratiqué ainsi que le niveau requis de vos partenaires entre autres.

Les utilisateurs auront la possibilité d'avoir accés aux évènements créés en les filtrant par sport.
Lorsqu'un utilisateur voudra indiquer qu'il veut participer à un évènement, il lui suffira de cocher la case de l'évènement en question et de cliquer sur "Participer à l'évenement"
Une fois cette étape éffectuée, un email sera automatiquement envoyé au créateur de l'évènement pour lui indiquer qu'une personne est intéressé et lui envoyer ses coordonnées pour le contacter.

Les utilisateurs de la plateforme pourront voir tous les évènements qu'ils ont créés pour notamment les modifier en cas de besoin.
Les utilisateurs pourront aussi accéder à leur données personnels et les modifiers.

Comment installer le projet: 

1. Cloner le projet en utilisant la commande `git clone https://gitlab.com/pgerard/meeting-sport.git`

2. Importer le projet dans IntelliJ IDEA en important le fichier "pom.xml" à la racine de ce repository.

3. Exécuter votre DB mysql. Si vous avez docker, vous pouvez utiliser la commande suivante:
```
docker run --name mariadb --rm -e MYSQL_ROOT_PASSWORD=toor -e MYSQL_DATABASE=defaultdb -p 3306:3306 -v "`pwd`/initdb:/docker-entrypoint-initdb.d" mariadb
```
4. Tous les scripts sql contenus dans le dossier initdb seront exécutés automatiquement lors du premier chargement de la DB.

Auteurs:

Ce projet a été réalisé par Timothée Nouaille, Bastien Robert et Pierre Gerard



