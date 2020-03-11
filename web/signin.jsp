<%-- 
    Document   : signin
    Created on : 11 Mar, 2020, 8:13:21 PM
    Author     : Nagarajan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign In</title>
    </head>
    <body>
        <form action="SigninServlet">

        <label for="name">Name:</label>
        <input type="text" name="name" required>
        <br>
        <br>

        <label for="pass">Password:</label>
        <input type="text" name="pass" required>
        <br>
        <br>
        <p>
            <input type="submit" value="Log In">

            

    </form>
    </body>
</html>
