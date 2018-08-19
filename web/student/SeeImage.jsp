<%-- 
    Document   : SeeImage
    Created on : Jul 3, 2018, 8:29:12 AM
    Author     : User
--%>

<%@page import="java.sql.Blob"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.io.OutputStream"%>
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
            
           Connection conn=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              OutputStream img;
           
            
            try{
           
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root","");
            
            String id=request.getParameter("id");
            System.out.println(id);
            String id1="1";
            
           
       
             pst=conn.prepareStatement("select * from eventimages where contact_id='"+id+"'");
             
             rs=pst.executeQuery();
             if(rs.next()){
                 Blob image=rs.getBlob(4);
                 byte barray[]=image.getBytes(1,(int)image.length());
                 response.setContentType("image/gif");
                 OutputStream os=response.getOutputStream();
                 os.write(barray);
                 os.flush();
                 os.close();
                 
             }
             
         }
         catch(Exception e){
             out.print("something wrong");
         }
            
            
            %>
    </body>
</html>
