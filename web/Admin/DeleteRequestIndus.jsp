<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Industries</title>
  <!-- Bootstrap core CSS-->
  <link href="../css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="../css/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Page level plugin CSS-->
  <link href="../css/vendor/datatables/dataTables.bootstrap4.css" rel="stylesheet">
  <!-- Custom styles for this template-->
  <link href="../css/css/sb-admin.css" rel="stylesheet">
</head>

<body class="fixed-nav sticky-footer bg-dark" id="page-top">
  <!-- Navigation-->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" id="mainNav">
       <a class="navbar-brand" href="AdminPage.jsp">UniHub.lk</a>
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarResponsive">
      <ul class="navbar-nav navbar-sidenav" id="exampleAccordion">
        
       
       
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Components">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseComponents" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-wrench"></i>
           <span class="nav-link-text">Administrator</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseComponents">
            <li>
              <a href="events.jsp">Events</a>
            </li>
            <li>
                <a href="Campus.jsp">Registered Universities</a>
            </li>
            <li>
              <a href="Industry.jsp">Registered Companies</a>
            </li>
            <li>
              <a href="Register.jsp">University Request</a>
            </li>
             <li>
              <a href="IndustRegister.jsp">Industry Request</a>
            </li>
             <li>
              <a href="DeleteCampus.jsp">Delete University</a>
            </li>
             <li>
              <a href="DeleteIndustry.jsp">Delete Company</a>
            </li>
             <li>
              <a href="RecordUpdateCampus.jsp">Update Records in Universities</a>
            </li>
             <li>
              <a href="RecordupdateIndustry.jsp">Update Records in Industry </a>
            </li>
          </ul>
        </li>
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Example Pages">
          <a class="nav-link nav-link-collapse collapsed" data-toggle="collapse" href="#collapseExamplePages" data-parent="#exampleAccordion">
            <i class="fa fa-fw fa-file"></i>
             <span class="nav-link-text">Other Profiles</span>
          </a>
          <ul class="sidenav-second-level collapse" id="collapseExamplePages">
            <li>
              <a href="../student/StudentLogin.html">Student</a>
            </li>
            <li>
              <a href="../Campus/CampusLogin.html">University</a>
            </li>
            <li>
              <a href="../Industry/IndustryLogin.html">Industry</a>
            </li>
            <li>
              <a href="AdminLogin.html">Administrator</a>
            </li>
          </ul>
        </li>
       
        <li class="nav-item" data-toggle="tooltip" data-placement="right" title="Link">
          <a class="nav-link" href="#">
            <i class="fa fa-fw fa-link"></i>
            <span class="nav-link-text">LinkedIn</span>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav sidenav-toggler">
        <li class="nav-item">
          <a class="nav-link text-center" id="sidenavToggler">
            <i class="fa fa-fw fa-angle-left"></i>
          </a>
        </li>
      </ul>
      <ul class="navbar-nav ml-auto">
          
           <li>
			<%
            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");
            
            
            
             HttpSession session1=request.getSession(false);  
        if(session1.getAttribute("admin_name")!=null){  
        String admin_name=(String)session1.getAttribute("admin_name");  
          
       out.print("<h6 style='color:white; padding-top:10px;' > Hello, "+admin_name+" Welcome to Profile</h6>"); 
        }  
        else{  
            
           response.sendRedirect("AdminLogin.html"); 
        }  
            %>  
          </li>

        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle mr-lg-2" id="alertsDropdown" href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
            <i class="fa fa-fw fa-bell"></i>
            <span class="d-lg-none">Alerts
              <span class="badge badge-pill badge-warning">6 New</span>
            </span>
            <span class="indicator text-warning d-none d-lg-block">
              <i class="fa fa-fw fa-circle"></i>
            </span>
          </a>
          <div class="dropdown-menu" aria-labelledby="alertsDropdown">
            <h6 class="dropdown-header">New Alerts:</h6>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-danger">
                <strong>
                  <i class="fa fa-long-arrow-down fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item" href="#">
              <span class="text-success">
                <strong>
                  <i class="fa fa-long-arrow-up fa-fw"></i>Status Update</strong>
              </span>
              <span class="small float-right text-muted">11:21 AM</span>
              <div class="dropdown-message small">This is an automated server response message. All systems are online.</div>
            </a>
            <div class="dropdown-divider"></div>
            <a class="dropdown-item small" href="#">View all alerts</a>
          </div>
        </li>
        <li class="nav-item">
          <form class="form-inline my-2 my-lg-0 mr-lg-2">
            <div class="input-group">
              
              <span class="input-group-append">
                
              </span>
            </div>
          </form>
        </li>
        <li class="nav-item">
          <a class="nav-link" data-toggle="modal" data-target="#exampleModal">
            <i class="fa fa-fw fa-sign-out"></i>Logout</a>
        </li>
      </ul>
    </div>
  </nav>
  <div class="content-wrapper">
    <div class="container-fluid">
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#"></a>
        </li>
        <li class="breadcrumb-item active">Companies</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
		
			
		
          <i class="fa fa-table"></i> Companies
		   </div>
		  

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
        String password=request.getParameter("password");
        String com_add=request.getParameter("com_add");
        String com_tell=request.getParameter("com_tell");
        
        
        if(com_name!="" && password!="" && com_add!="" && com_tell!="" ){
        
        
         
                String sql1="DELETE from induslogin WHERE com_name='"+com_name+"'";
                pst=con.prepareStatement(sql1);
                pst.execute();
                
                
                
                
                String sql2="SELECT * FROM updateinduslogin";
         
               pst=con.prepareStatement(sql2);
                rs = pst.executeQuery();
                
                %>
               
               
          
		  
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                   <th>Company</th>
                  <th>Password</th>
                  <th>Address</th>
                  <th>Telephone Number</th>
                </tr>
              </thead>
              
              <tbody>
                
                    <%
                
          while(rs.next()){
                 
              %>
              
              <tr>
                        <td><%= rs.getString(1)%></td>
                        <td><%= rs.getString(2)%></td>
                        <td><%= rs.getString(3)%></td>
                        <td><%= rs.getString(4)%></td>
                        
                        


                       

                    </tr>
           <%
             
            }
            %>
               
               
              </tbody>
            </table>
            
            <%
            
                con.close();
                   }
              else{
                       
             response.sendRedirect("IndusRegister.jsp"); 
         
                    } 
               
                
           
          

        %>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated a few minutes ago</div>
      </div>
    </div>
    <!-- /.container-fluid-->
    <!-- /.content-wrapper-->
    <footer class="sticky-footer">
      <div class="container">
        <div class="text-center">
          <small>Copyright © Rawana DevOps 2018</small>
        </div>
      </div>
    </footer>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>
    <!-- Logout Modal-->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">×</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="../AdminLogout">Logout</a>
          </div>
        </div>
      </div>
    </div>
    <!-- Bootstrap core JavaScript-->
    <script src="../css/vendor/jquery/jquery.min.js"></script>
    <script src="../css/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <!-- Core plugin JavaScript-->
    <script src="../css/vendor/jquery-easing/jquery.easing.min.js"></script>
    <!-- Page level plugin JavaScript-->
    <script src="../css/vendor/datatables/jquery.dataTables.js"></script>
    <script src="../css/vendor/datatables/dataTables.bootstrap4.js"></script>
    <!-- Custom scripts for all pages-->
    <script src="../css/js/sb-admin.min.js"></script>
    <!-- Custom scripts for this page-->
    <script src="../css/js/sb-admin-datatables.min.js"></script>
  </div>
</body>

</html>
