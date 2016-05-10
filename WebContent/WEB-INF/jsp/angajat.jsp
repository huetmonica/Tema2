<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Angajat Information</h2>
<form:form method="POST" action="/Proiect/adaugaAng">
   <table>
    <tr>
        <td><form:label path="nume">Name</form:label></td>
        <td><form:input path="nume" /></td>
    </tr>
    <tr>
        <td><form:label path="user">Type</form:label></td>
        <td><form:input path="user" /></td>
    </tr>
    <tr>
        <td><form:label path="parola">Password</form:label></td>
        <td><form:input path="parola" /></td>
    </tr>
     <tr>
        <td><form:label path="cnp">Cnp</form:label></td>
        <td><form:input path="cnp" /></td>
    </tr>
    <td colspan="2">
            <input type="submit" value="AdaugaA"/>
      </td>
    
    
</table>  
</form:form>