<!DOCTYPE html>
<html>
<head>
<title>Slam2Ville</title>
<style type="text/css">
@import
	"https://ajax.googleapis.com/ajax/libs/dojo/1.11.2/dojo/resources/dojo.css"
	;

@import
	"https://ajax.googleapis.com/ajax/libs/dojo/1.11.2/dijit/themes/tundra/tundra.css"
	;
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/dojo/1.11.2/dojo/dojo.js"
	type="text/javascript" djConfig="parseOnLoad: true, locale: 'fr'"></script>
<script>
	dojo.require("dijit.form.FilteringSelect");
	dojo.require("dojox.data.QueryReadStore");
</script>
</head>
<body class="tundra">
	<div align="center">
		<h1>PPE4 : Servlet + Dojo + XHR</h1>
		<br> <br> Entrez un nom de Ville
		<!--  La première div est indispensable pour le filteringSelect -->
		<div data-dojo-type="dojox.data.QueryReadStore"
			data-dojo-props="url:'/Slam2Ville/RechercheVilleJson', requestMethod:'get'"
			data-dojo-id="villeStore"></div>
			
		<div data-dojo-type='dijit.form.FilteringSelect'
			data-dojo-props="store:villeStore, searchAttr:'name', pageSize:20, hasDownArrow:false"
			style="width: 25em; overflow: none;"></div>
	</div>
</body>
</html>
