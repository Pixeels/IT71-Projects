<%-- 
    Document   : index
    Created on : Nov 23, 2021, 1:24:58 AM
    Author     : JM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="person.data.PersonInformationWS"%>
<%@page import="person.data.PersonInformationWS_Service"%>
<%@page import="java.util.List"%>



<%
    PersonInformationWS_Service service = new PersonInformationWS_Service();
    PersonInformationWS port = service.getPersonInformationWSPort();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Person's Profile</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body>
        <table class="table table-hover w-75 my-5 mx-auto">
            <thead class="table-dark">
                <tr>
                    <td>First Name</td>
                    <td>Last Name</td>
                    <td>Birth Day</td>
                    <td>Age</td>
                </tr>
            </thead>
            <tbody>
                <%for(int i = 0; i < port.selectAllPersonInformation().size(); i++) {%>
                    <tr>
                    <%List<String> personInfo = port.selectAllPersonInformation().get(i).getItem();
                        for(String e: personInfo) {%>
                            
                            <td><%=e.toString()%></td>
                     <%}%>
                    </tr>
                <%}%>
            </tbody>
        </table>
            
    </body>
</html>
