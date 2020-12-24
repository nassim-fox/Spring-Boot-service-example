<%-- 
    Document   : etudiantClient
    Created on : Feb 14, 2020, 11:31:38 AM
    Author     : Nassim Bouhadouf <Nassim.Bouhadouf at https://github.com/nassim-fox/>
--%>

<%@page import="service.EtudiantService_Service"%>
<%@page import="service.EtudiantService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="service.Etudiant"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="serv.EtudiantJspService"%>
<!DOCTYPE html>

<%
    
    int id = Integer.parseInt(request.getParameter("id")) ; 
    //ArrayList <Etudiant> etudiants = 
    EtudiantService ejs = new EtudiantService_Service().getEtudiantServicePort() ; 
    Etudiant e = ejs.getEtudiant(id) ; 

%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <label>searched etudiant : <%=e.getNom()%> </label>
    </body>
</html>
