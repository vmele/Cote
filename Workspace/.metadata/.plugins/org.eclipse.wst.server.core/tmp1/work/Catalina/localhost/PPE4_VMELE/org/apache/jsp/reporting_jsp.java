/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.14
 * Generated at: 2017-06-06 12:30:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reporting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("<!-- <script\r\n");
      out.write("\tsrc=\"https://cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js\"></script> -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/reporting.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js\"\r\n");
      out.write("\tintegrity=\"sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn\"\r\n");
      out.write("\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Reporting</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Btn déconnexion -->\r\n");
      out.write("\t\t<div class=\"col-md-12  text-right\">\r\n");
      out.write("\t\t\t<a href=\"DeconnexionServlet\"><button id=\"deconnexion\"\r\n");
      out.write("\t\t\t\t\ttype=\"button\" class=\"btn\">Déconnexion</button></a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"selecteur\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<select id=\"searchUtilisateur\" class=\"form-control col-md-3\"\r\n");
      out.write("\t\t\t\t\tname=\"searchUtilisateur\">\r\n");
      out.write("\t\t\t\t</select> <select id=\"searchClient\" class=\"form-control col-md-3\"\r\n");
      out.write("\t\t\t\t\tname=\"searchClient\">\r\n");
      out.write("\t\t\t\t</select> <select id=\"searchEtat\" class=\"form-control col-md-3\"\r\n");
      out.write("\t\t\t\t\tname=\"searchEtat\">\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<h6>Date début :</h6>\r\n");
      out.write("\t\t\t<div class=\"search-container\">\r\n");
      out.write("\t\t\t\t<div class=\"ui-widget\">\r\n");
      out.write("\t\t\t\t\t<input type=\"date\" id=\"dateDebut\" name=\"dateDebut\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"search form-control col-md-3\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h6>Date fin :</h6>\r\n");
      out.write("\t\t\t<div class=\"search-container\">\r\n");
      out.write("\t\t\t\t<div class=\"ui-widget\">\r\n");
      out.write("\t\t\t\t\t<input type=\"date\" id=\"dateFin\" name=\"dateFin\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"search form-control col-md-3\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"col-md-12  text-center\">\r\n");
      out.write("\t\t\t<button id=\"searchListe\" onclick=\"viderInfos()\" type=\"button\"\r\n");
      out.write("\t\t\t\tclass=\"btn\">Vider</button>\r\n");
      out.write("\t\t\t<button id=\"searchListe\" onclick=\"sendInfos()\" type=\"button\"\r\n");
      out.write("\t\t\t\tclass=\"btn\">Envoyer</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<br> <br> <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tvar barChart = null;\r\n");
      out.write("\r\n");
      out.write("\t\t\tfunction sendInfos() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar table = document.getElementById(\"dataTable\");\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('#dataTable tbody').empty();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tif (barChart != null) {\r\n");
      out.write("\t\t\t\t\tbarChart.destroy();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar utilisateur = document.getElementById('searchUtilisateur');\r\n");
      out.write("\t\t\t\tvar utilisateurValue = utilisateur.value;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar client = document.getElementById('searchClient');\r\n");
      out.write("\t\t\t\tvar clientValue = client.value;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar etat = document.getElementById('searchEtat');\r\n");
      out.write("\t\t\t\tvar etatValue = etat.value;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar dateDebut = document.getElementById('dateDebut');\r\n");
      out.write("\t\t\t\tvar dateDebutValue = dateDebut.value;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar dateFin = document.getElementById('dateFin');\r\n");
      out.write("\t\t\t\tvar dateFinValue = dateFin.value;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tconsole.log(\"idUtilisateur : \" + utilisateurValue\r\n");
      out.write("\t\t\t\t\t\t+ \" /n idClient : \" + clientValue + \" /n Début : \"\r\n");
      out.write("\t\t\t\t\t\t+ dateDebutValue + \" /n Fin : \" + dateFinValue);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : 'RechercheListe',\r\n");
      out.write("\t\t\t\t\tmethod : 'POST',\r\n");
      out.write("\t\t\t\t\tdata : 'utilisateur=' + utilisateurValue + '&client='\r\n");
      out.write("\t\t\t\t\t\t\t+ clientValue + '&etat=' + etatValue + '&debut='\r\n");
      out.write("\t\t\t\t\t\t\t+ dateDebutValue + '&fin=' + dateFinValue,\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar refCommande = [];\r\n");
      out.write("\t\t\t\t\t\tvar utilisateur = [];\r\n");
      out.write("\t\t\t\t\t\tvar dateCommande = [];\r\n");
      out.write("\t\t\t\t\t\tvar dateDemandee = [];\r\n");
      out.write("\t\t\t\t\t\tvar typeCommande = [];\r\n");
      out.write("\t\t\t\t\t\tvar moyenContact = [];\r\n");
      out.write("\t\t\t\t\t\tvar etatCommande = [];\r\n");
      out.write("\t\t\t\t\t\tvar client = [];\r\n");
      out.write("\t\t\t\t\t\tvar total = [];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$.each(result, function(key, value) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\trefCommande.push(value['refCommande']);\r\n");
      out.write("\t\t\t\t\t\t\tutilisateur.push(value['utilisateur']);\r\n");
      out.write("\t\t\t\t\t\t\tdateCommande.push(value['dateCommande']);\r\n");
      out.write("\t\t\t\t\t\t\tdateDemandee.push(value['dateDemandee']);\r\n");
      out.write("\t\t\t\t\t\t\ttypeCommande.push(value['type']);\r\n");
      out.write("\t\t\t\t\t\t\tmoyenContact.push(value['moyenContact']);\r\n");
      out.write("\t\t\t\t\t\t\tetatCommande.push(value['etatCommande']);\r\n");
      out.write("\t\t\t\t\t\t\tclient.push(value['client']);\r\n");
      out.write("\t\t\t\t\t\t\ttotal.push(value['montant']);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar t = \"\";\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < refCommande.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\tvar tr = \"<tr>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + refCommande[i] + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + utilisateur[i].prenom + \" \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ utilisateur[i].nom + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + etatCommande[i].libelle + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + client[i].raisonSociale + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + dateCommande[i] + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + dateDemandee[i] + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + typeCommande[i].libelle + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"<td>\" + total[i] + \"€\" + \"</td>\";\r\n");
      out.write("\t\t\t\t\t\t\ttr += \"</tr>\";\r\n");
      out.write("\t\t\t\t\t\t\tt += tr;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tdocument.getElementById(\"dataTable\").innerHTML += t;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl : 'RechercheChart',\r\n");
      out.write("\t\t\t\t\tmethod : 'POST',\r\n");
      out.write("\t\t\t\t\tdata : 'utilisateur=' + utilisateurValue + '&client='\r\n");
      out.write("\t\t\t\t\t\t\t+ clientValue + '&etat=' + etatValue + '&debut='\r\n");
      out.write("\t\t\t\t\t\t\t+ dateDebutValue + '&fin=' + dateFinValue,\r\n");
      out.write("\t\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\t\tconsole.log(result);\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tvar nom = [];\r\n");
      out.write("\t\t\t\t\t\tvar prenom = [];\r\n");
      out.write("\t\t\t\t\t\tvar montant = [];\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$.each(result, function(key, value) {\r\n");
      out.write("\t\t\t\t\t\t\tnom.push(value['nom']);\r\n");
      out.write("\t\t\t\t\t\t\tprenom.push(value['prenom']);\r\n");
      out.write("\t\t\t\t\t\t\tmontant.push(value['montant']);\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < utilisateur.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(\"Liste des utilisateurs : \");\r\n");
      out.write("\t\t\t\t\t\t\tconsole.log(nom[i] + \" \" + prenom[i] + \" || \"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ montant[i]);\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t// Bar chart\r\n");
      out.write("\t\t\t\t\t\tbarChart = new Chart(document\r\n");
      out.write("\t\t\t\t\t\t\t\t.getElementById(\"bar-chart\"), {\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\t\t\t\tdata : {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\tlabels : nom,\r\n");
      out.write("\t\t\t\t\t\t\t\tdatasets : [ {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tlabel : \"Recette (€)\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\tbackgroundColor : [ \"#3e95cd\", \"#8e5ea2\",\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\"#3cba9f\", \"#e8c3b9\", \"#c45850\" ],\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdata : montant\r\n");
      out.write("\t\t\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\toptions : {\r\n");
      out.write("\t\t\t\t\t\t\t\tlegend : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdisplay : false\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdisplay : true,\r\n");
      out.write("\t\t\t\t\t\t\t\t\ttext : 'Montant des commandes.'\r\n");
      out.write("\t\t\t\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\t\t\tscales : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\tyAxes : [ {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tticks : {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tbeginAtZero : true\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction viderInfos(){\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchClient').value = 0;\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchUtilisateur').value = 0;\r\n");
      out.write("\t\t\t\tdocument.getElementById('searchEtat').value = 0;\r\n");
      out.write("\t\t\t\tdocument.getElementById('dateDebut').value = \"\";\r\n");
      out.write("\t\t\t\tdocument.getElementById('dateFin').value = \"\";\r\n");
      out.write("\r\n");
      out.write("\t\t\t\tvar table = document.getElementById(\"dataTable\");\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t$('#dataTable tbody').empty();\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\tif (barChart != null) {\r\n");
      out.write("\t\t\t\t\tbarChart.destroy();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t\t<br>\r\n");
      out.write("\t\t<div class=\"table-responsive\">\r\n");
      out.write("\t\t\t<table id=\"dataTable\" cellspacing=\"0\" width=\"100%\"\r\n");
      out.write("\t\t\t\tclass=\"table table-striped\">\r\n");
      out.write("\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>Commande</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Utilisateur</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Etat</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Client</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Date Commande</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Date Demandée</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Type de commande</th>\r\n");
      out.write("\t\t\t\t\t\t<th>Montant total</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<canvas id=\"bar-chart\" width=\"1000\" height=\"450\"></canvas>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
