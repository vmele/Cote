SELECT test.id_test, titre_test, date_test,
test.nb_com, avantage_jeu, inconvenient_jeu, description_test,
test.id_jeu, test.id_utilisateur, test.note_jeu
FROM test, jeu, utilisateur
WHERE test.id_jeu = jeu.id_jeu
AND test.id_utilisateur = utilisateur.id_utilisateur