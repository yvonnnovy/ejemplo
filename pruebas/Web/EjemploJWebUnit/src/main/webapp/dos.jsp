<%-- 
    Document   : dos
    Created on : 24-oct-2012, 23:41:50
    Author     : jose maria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form name="uno" action="tres.jsp">
            <table border="1">
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nombreUsuario" value="" /></td>
                </tr>
                <tr>
                    <td>Clave</td>
                    <td><input type="text" name="nombreClave" value="" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="Enviar"/></td>
                </tr>
            </table>

        </form>
    </body>
</html>
