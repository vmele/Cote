<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Connexion</title>
<link rel="stylesheet" href="css/style.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
	integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
	integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ"
	crossorigin="anonymous">
</head>

<body>
	<div class="container">
		<div class="wrapper">
			<form action="LoginServlet" method="POST" name="formulaireConnexion"
				class="form-signin">
				<h3 class="form-signin-heading">Bienvenue chez GSB !</h3>
				<hr class="colorgraph">
				<br> <input type="text" class="form-control" name="LOGIN"
					id="LOGIN" value="${LOGIN}" placeholder="Nom d'utilisateur"
					required="" autofocus="" /> <input type="password"
					class="form-control" name="PASSWORD" id="PASSWORD" value="${MDP}"
					placeholder="Mot de passe" required="" />

				<div class="loginCenter">
					<label for="MEMOIRE">Se souvenir de moi</label> <input
						type="checkbox" id="MEMOIRE" name="MEMOIRE">
					<c:if test="${MEMOIRE eq'OK'}">
					</c:if>
				</div>
				
				<button class="btn btn-lg btn-primary btn-block" name="Submit"
					value="Login" type="Submit">Login</button>
			</form>
		</div>
	</div>
</body>
</html>