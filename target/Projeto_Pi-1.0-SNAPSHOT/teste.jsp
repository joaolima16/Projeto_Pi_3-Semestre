<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Product" %>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<Product> lsProducts = (ArrayList<Product>)request.getAttribute("teste");
    for(int i = 0; i < lsProducts.size(); i++){
        out.println(lsProducts.get(i).getName());
        out.println(lsProducts.get(i).getImgUrl());
        out.println(lsProducts.get(i).getCategory());
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
