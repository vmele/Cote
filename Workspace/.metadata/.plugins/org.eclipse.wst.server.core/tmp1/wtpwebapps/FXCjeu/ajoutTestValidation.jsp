<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>TestiJeux - Validation de l'ajout du test</title>
<link rel="stylesheet" href="css/swipebox.css" type="text/css"
	media="all" />
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />

<meta http-equiv="refresh"
	content="2; URL=TestNewServlet?idTest=${idTest}">
</head>



<body>
	<div class="banner-body logn">
		<div class="container">
			<div class="alert alert-info " role="alert">
				<strong>Votre test a bien �t� ajout� !</strong> <br>
				Redirection vers la liste des tests dans quelques secondes. Veuillez
				patienter.
			</div>
			<img class="img-responsiveTest center-block" src="images/accueil.jpg"
				alt=" " />
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>