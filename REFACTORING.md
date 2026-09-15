# Journal de refactoring

| Classe/méthode | Problème observé                                                                  | Refactoring appliqué                                                 | Justification                                                      |
|----------------|-----------------------------------------------------------------------------------|----------------------------------------------------------------------|--------------------------------------------------------------------|
| Customer       | getId n'est pas utiliser, setId modifie le id du client                           | suppression de getId et setId, ajout de final à la déclaration du id | l'ajout du final permet de rendre la variable inchangeable         |
| PermissionService | 8 comparaison avec les if énumérant toutes les conditions, imposible à comprendre | Remplacement par une vérification directe                            | exprime directement l'intention                                    |
| Shipment.status | CREATED et READY sans aucune validité, n'importe quel chaîne peut être assigné    | Ajout de ShipmentStatus                                              | le compilateur garanti qu'aucun état invalide ne peut être assigné |
|                |                                                                                   |                                                                      |                                                                    |
