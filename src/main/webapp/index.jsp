<html>
<body>
<h2>Hello World!</h2>

<%

//    String res = (String) request.getAttribute("besked");
//        int res =  response.getStatus();
        String res =   response.getHeader("");


//    String palle(String)

    out.println(res  + "   det her er inden for java tacket ");
    out.println("<br>");

%>

<h2>Nu er vi ude paa jsp'en igen</h2>

<%=res%>





</body>
</html>
