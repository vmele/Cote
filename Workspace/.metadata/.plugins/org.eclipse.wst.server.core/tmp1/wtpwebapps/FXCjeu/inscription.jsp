<%@ include file="header.jsp"%>
<div class="banner-body regstr">
	<div class="container">
		<!-- header -->
		<%@ include file="entete.jsp"%>
		<!-- //header -->
		<!-- register -->

		<%
				String login_on_use = ""; // Variable qu'on appelera apr�s si le login existe d�ja.
				//if (session.getAttribute("CONTROLE_INSCRIPTION") == null){
				//out.println("Bienvenu ! Veuillez vous inscrire");			
				//}
				//else 
				if (session.getAttribute("CONTROLE_INSCRIPTION") == "NOK")
				{
					login_on_use = "Ce pseudo est d�ja utilis�. Veuillez en choisir un autre.";
					out.println("Le login est d�j� util� ! Veuillez r�essayer");
				}
			%>

		<div class="sign-up-form">
			<h3>S'enregistrer</h3>
			<p>Having hands on experience in creating innovative designs,I do
				offer design solutions which harness</p>
			<div class="sign-up">
				<form action="InscriptionServlet" method="POST"
					name="inscriptionForm">
					<h5>Personal Information</h5>
					<div class="sign-u">
						<div class="sign-up1">
							<h4 class="a">Pseudo* :</h4>
						</div>
						<div class="sign-up2">
							<input type="text" placeholder=" " required name="LOGIN"
								value="<%out.print(login_on_use);%>" />
						</div>
						<div class="clearfix"></div>
					</div>
					<h6>Login Information</h6>
					<div class="sign-u">
						<div class="sign-up1">
							<h4 class="d">Password* :</h4>
						</div>
						<div class="sign-up2">
							<input type="password" placeholder=" " required name="PASSWORD" />
						</div>
						<div class="clearfix"></div>
					</div>

					<input type="submit" value="Submit">
				</form>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
<!-- //register -->
<!-- footer -->
<%@ include file="footer.jsp"%>
<!-- //footer -->
<!-- for bootstrap working -->
<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<form name="inscriptionConnexion" action="InscriptionServlet"
	method="POST">
	<input type="text" name="LOGIN" id="LOGIN"> <input
		type="password" name="PASSWORD" id="PASSWORD"> <input
		type="submit" name="submit" id="submit">
</form>


</body>
</html>