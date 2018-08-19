<%-- 
    Document   : Interest
    Created on : Jul 8, 2018, 3:15:34 PM
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
             
              HttpSession session2=request.getSession(false);    
              String nic=(String)session2.getAttribute("nic"); 
            
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
              
               String event_id=request.getParameter("num");
               
               String state=request.getParameter("state");
               
               
            if( event_id!="" && state!="" && nic!=""){
                
               
                try{
                    
                  
                     
                     
                String sql1="SELECT  * FROM interest where event_id='"+event_id+"' and nic='"+nic+"'";
         
               pst=con.prepareStatement(sql1);
                rs = pst.executeQuery();
                
            if(rs.next()){
           
                  String sql="UPDATE interest SET status='"+state+"'  where nic='"+nic+"' and event_id='"+event_id+"'";
                   pst=con.prepareStatement(sql);
                    pst.execute();
             
                
            }
            else{
                    
                    String sql="INSERT INTO interest (event_id,nic,status) VALUES ('"+event_id+"','"+nic+"','"+state+"')";
        
               pst=con.prepareStatement(sql);
                pst.execute();
                
            }
                
                }
            catch(Exception e){
                out.print("something went wrong");
            }
            
             response.sendRedirect("events.jsp");
            }
            else{
                
                 response.sendRedirect("EventInterest.jsp");
             
            }
         
         %>
    </body>
</html>
