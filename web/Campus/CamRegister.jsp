<%-- 
    Document   : Register
    Created on : Jun 19, 2018, 10:28:07 PM
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
              
               String cam_name=request.getParameter("cam_name");
               String tel_num=request.getParameter("tel_num");
               String cam_add=request.getParameter("cam_add");
               String cam_pass=request.getParameter("cam_pass");
               String confirm=request.getParameter("confirm");
               
            if(cam_name!="" && tel_num!="" && cam_add!="" && cam_pass!=""){
            
            try{
                
                 String sql="INSERT INTO camregi (cam_name,tel_num,cam_add,cam_pass) VALUES ('"+cam_name+"','"+tel_num+"','"+cam_add+"','"+cam_pass+"')";
        
               pst=con.prepareStatement(sql);
                pst.execute();
                
                
                
            }
            catch(Exception e){
            }
            
             response.sendRedirect("CampusLogin.html");
            }
            else{
                
                 response.sendRedirect("CamRegisterForm.jsp"); 
             
            }
         
         %>
    </body>
</html>
