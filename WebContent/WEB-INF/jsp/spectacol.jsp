<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Spectacol Information</h2>


<form:form method="POST" action="/Proiect/adaugaS">
<table> 
 <tr>
        <td><form:label path="titlu">Titlu</form:label></td>
        <td><form:input path="titlu" /></td>
 </tr>
 <tr>
        <td><form:label path="regia">Regia</form:label></td>
        <td><form:input path="regia" /></td>
 </tr>
 <tr>
        <td><form:label path="distributia">Distributia</form:label></td>
        <td><form:input path="distributia" /></td>
 </tr>
  <tr>
        <td><form:label path="data">Data</form:label></td>
        <td><form:input path="data" /></td>
 </tr>
  <tr>
        <td><form:label path="nrbilete">Nrbilete</form:label></td>
        <td><form:input path="nrbilete" /></td>
 </tr>
 <td colspan="2">
    <input type="submit" value="AdaugaS"/>
   </td>
 </tr>
    </table> 
</form:form>


<form:form method="POST" action="/Proiect/adaugaA">
<table> 
 <td colspan="2">
    <input type="submit" value="AdaugaA"/>
   </td>
   </tr> 
    </table> 
</form:form>
 <form:form method="POST" action="/Proiect/VizualizareS"> 
  <c:if test="${!empty spec}">  
 <table align="center" border="1">  
  <tr>  
   <th>Titlu</th>  
   <th>Regia</th>  
   <th>Distributia</th>  
   <th>Data</th>  
   <th>Nrbilet</th>  
  </tr> 
   

    <c:forEach items="${spec}" var="spec">  
    <tr>  
     <td><c:out value="${spec.getTitlu()}"/></td>  
    <td><c:out value="${spec.getRegia()}"/></td>  
    <td><c:out value="${spec.getDistributia()}"/></td>  
    <td><c:out value="${spec.getData()}"/></td>  
     <td><c:out value="${spec.getNrbilet()}"/></td>  
 
   </tr>  
  </c:forEach>  
 </table>  
</c:if> 
</form:form>
</body>
</html>