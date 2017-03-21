<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: joliveros
  Date: 21/03/2017
  Time: 01:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="persona" action="verPersona" method="post">
    Nombre:<form:input id="" path="nombre" />
    Edad:<form:input id="" path="edad"/>
    <form:button value="Enviar">Enviar</form:button>
</form:form>
</body>
</html>
