# Journal de refactoring

| Classe/méthode | Problème observé                                        | Refactoring appliqué                                                 | Justification                                              |
|----------------|---------------------------------------------------------|----------------------------------------------------------------------|------------------------------------------------------------|
| Customer       | getId n'est pas utiliser, setId modifie le id du client | suppression de getId et setId, ajout de final à la déclaration du id | l'ajout du final permet de rendre la variable inchangeable |
