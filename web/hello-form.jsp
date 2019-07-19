<%--
  Created by IntelliJ IDEA.
  User: veronnique
  Date: 15/07/19
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>SAISIR</h2>

<form method="post" action="simplehello">
    <label for ="firstname">First name:<br> </label>
    <input type="text" name="firstname" id="firstname">
    <br>
    <label for ="lastname">Last name:<br></label>
    <input type="text" name="lastname" id="lastname">
    <br>
    <label for ="time"> Time:<br></label>
    <input type="time" name="time" id = "time"><br>
    <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
