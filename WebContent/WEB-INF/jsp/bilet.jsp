<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
    <title>Spring MVC Form Handling</title>
  
</head>
<body>

<h2>Bilet Information</h2>
<form:form method="POST" action="/Proiect/AdaugaB">
   <table>
    <tr>
        <td><form:label path="spectacol">Spectacol</form:label></td>
        <td><form:input path="spectacol" /></td>
    </tr>
    <tr>
        <td><form:label path="rand">Rand</form:label></td>
        <td><form:input path="rand" /></td>
    </tr>
    <tr>
        <td><form:label path="numar">Numar</form:label></td>
        <td><form:input path="numar" /></td>
    </tr>
    
    <td colspan="2">
            <input type="submit" value="AdaugaB"/>
      </td>
    
    
</table>  
</form:form>


 <form:form method="POST" action="/Proiect/Vizualizare"> 
  <c:if test="${!empty bilet}">  
 <table align="center" border="1">  
  <tr>  
   <th>Spectacol</th>  
   <th>Rand</th>  
   <th>Numar</th>  
  
  </tr> 
   

    <c:forEach items="${bilet}" var="bilet">  
   <tr>  
    <td><c:out value="${bilet.getSpectacol()}"/></td>  
    <td><c:out value="${bilet.getRand()}"/></td>  
    <td><c:out value="${bilet.getNumar()}"/></td>  
  
 
   </tr>  
  </c:forEach>  
 </table>  
</c:if> 
</form:form>
</body>
</html>