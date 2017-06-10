$(document).ready(
		function() {
			$.ajax({
				url : 'RechercheClient',
				method : 'POST',
				success : function(result) {
					var raisonSociale = [];
					var idClient = [];

					$.each(result, function(key, value) {

						raisonSociale.push(value['raisonSociale']);
						idClient.push(value['idClient']);

					});

					var select = document.getElementById("searchClient");
					select.options[select.options.length] = new Option(
							"Tout client", 0);
					for (var i = 0; i < raisonSociale.length; i++) {
						select.options[select.options.length] = new Option(
								raisonSociale[i], idClient[i]);
					}
				}
			});
			$.ajax({
				url : 'RechercheUtilisateur',
				method : 'POST',
				success : function(result) {

					var nom = [];
					var prenom = [];
					var idPersonne = [];

					$.each(result, function(key, value) {
						console.log(result);
						prenom.push(value['prenom']);
						nom.push(value['nom']);
						idPersonne.push(value['idPersonne']);
					});


					console.log("NOMS : " + nom);
					console.log(prenom);
					console.log(idPersonne);
					

					var select = document.getElementById("searchUtilisateur");
					select.options[select.options.length] = new Option(
							"Tout utilisateur", 0);
					for (var i = 0; i < nom.length; i++) {
						select.options[select.options.length] = new Option(
								nom[i] + " " + prenom[i], idPersonne[i]);
					}
				}
			});
			$.ajax({
				url : 'RechercheEtatCommande',
				method : 'POST',
				success : function(result) {

					var idEtat = [];
					var libelle = [];

					$.each(result, function(key, value) {

						idEtat.push(value['idEtat']);
						libelle.push(value['libelle']);
					});


					var select = document.getElementById("searchEtat");
					select.options[select.options.length] = new Option(
							"Tout état", 0);
					for (var i = 0; i < idEtat.length; i++) {
						select.options[select.options.length] = new Option(
								libelle[i], idEtat[i]);
					}
				}
			});
		});


