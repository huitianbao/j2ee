<%-- 
    Document   : demo10_1
    Created on : 2018-5-12, 18:44:48
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
        
        <font color="red">
        
        <%
           String data= application.getAttribute("data").toString();
            out.print(data);
            
                %>
                
                </font>
    </body>
</html>
