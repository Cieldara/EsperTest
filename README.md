# EsperTest
Exemple d'utilisation de la librairie Esper

### Configurer un projet Netbeans avec Esper

* Télécharger et extraire le fichier TAR fourni sur le site EsperTech (http://www.espertech.com/downloads-for-registered-users/).
Nécessite un compte Espertech (création gratuite), si nécessaire, demandez moi mes identifiants.
* Créer un nouveau projet Netbeans 
* Ajouter les JAR nécessaires pour l’utilisation de Esper avec JAVA. (Clic droit sur le projet -> Properties->Onglet Librairies->Add JAR/Folder->Ajouter tous les fichiers JAR contenus dans le répertoire esperha-7.0.0\esperha\lib)

### Description du programme

Génère des évènements de bas niveau StockTick, quand la moyenne des valeurs prix des deux derniers évènements StockTick dépasse la valeur 6, affiche un message.

