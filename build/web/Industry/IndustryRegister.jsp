<%-- 
    Document   : IndustryRegi
    Created on : Jun 27, 2018, 6:23:28 PM
    Author     : User
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%
             
              Connection con=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              
              try{
           
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root",""); 
             }
             catch(Exception e){
                 out.print("connection failed");
             }
              
               String com_name=request.getParameter("com_name");
               String address=request.getParameter("address");
               String tell=request.getParameter("tell");
               String pass=request.getParameter("pass");
               
            if(com_name!="" && address!="" && tell!="" && pass!="" ){
            
            try{
                
                 String sql="INSERT INTO induslogin (com_name,password,com_add,com_tell) VALUES ('"+com_name+"','"+pass+"','"+address+"','"+tell+"')";
        
               pst=con.prepareStatement(sql);
                pst.execute();
                
                
                
            }
            catch(Exception e){
            }
            
             response.sendRedirect("IndustryLogin.html");
            }
            else{
                
                 response.sendRedirect("IndustryRegi.jsp");
             
            }
         
         %>
        
    </body>
</html>
