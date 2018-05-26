<%-- 
    Document   : Login_htb
    Created on : 2018-5-23, 0:13:09
    Author     : 16221
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="<%=request.getContextPath()%>/Login_handle" method="post">
            username:<input type="text" name="username"><br/>
            password:<input type="text" name="password"><br/>
            <input type="submit" value="login">
            
        </form>
    </body>
</html>
