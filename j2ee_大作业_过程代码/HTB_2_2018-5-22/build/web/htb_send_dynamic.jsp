<%-- 
    Document   : htb_send_dynamic
    Created on : 2018-5-22, 20:35:38
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
    <form action="<%=request.getContextPath()%>/Dynamic_handle" method="post">
        <h4>Title  :
            <br/>
            <input type="text" name="title">
        </h4>

        <h4>Content :<br/><input type="text" name="content">
        </h4>

        <input type="submit" value="发表" onclick="jump()">

    </form>
          <script>
              function jump(){
                   window.navigate("/HTB_2_2018-5-22/Dynamic_handle");
              }
              </script>


</body>
</html>
