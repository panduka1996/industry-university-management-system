package org.apache.jsp.student;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class IdeaForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <title>Idea Hub</title>\n");
      out.write("  <!-- Bootstrap core CSS-->\n");
      out.write("  <link href=\"../css/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Custom fonts for this template-->\n");
      out.write("  <link href=\"../css/vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <!-- Page level plugin CSS-->\n");
      out.write("  <link href=\"../css/vendor/datatables/dataTables.bootstrap4.css\" rel=\"stylesheet\">\n");
      out.write("  <!-- Custom styles for this template-->\n");
      out.write("  <link href=\"../css/css/sb-admin.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fixed-nav sticky-footer bg-dark\" id=\"page-top\">\n");
      out.write("  <!-- Navigation-->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\" id=\"mainNav\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"StudentPage.jsp\">UniHub.lk</a>\n");
      out.write("    <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("      <ul class=\"navbar-nav navbar-sidenav\" id=\"exampleAccordion\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("       \n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Components\">\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseComponents\" data-parent=\"#exampleAccordion\">\n");
      out.write("            <i class=\"fa fa-fw fa-wrench\"></i>\n");
      out.write("            <span class=\"nav-link-text\">Features</span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseComponents\">\n");
      out.write("             <li>\n");
      out.write("              <a href=\"StudentPage.jsp\">Home Page</a>\n");
      out.write("            </li>\n");
      out.write("           <li>\n");
      out.write("              <a href=\"IdeaForm.jsp\">Idea Hub</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"events.jsp\">Events</a>\n");
      out.write("            </li>\n");
      out.write("             <li>\n");
      out.write("              <a href=\"CampusDetails.jsp\">University Details</a>\n");
      out.write("            </li>\n");
      out.write("             <li>\n");
      out.write("              <a href=\"../view_event.jsp\">University Calender</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Example Pages\">\n");
      out.write("          <a class=\"nav-link nav-link-collapse collapsed\" data-toggle=\"collapse\" href=\"#collapseExamplePages\" data-parent=\"#exampleAccordion\">\n");
      out.write("            <i class=\"fa fa-fw fa-file\"></i>\n");
      out.write("            <span class=\"nav-link-text\">Other Profiles</span>\n");
      out.write("          </a>\n");
      out.write("          <ul class=\"sidenav-second-level collapse\" id=\"collapseExamplePages\">\n");
      out.write("             <li>\n");
      out.write("              <a href=\"StudentLogin.html\">Student</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"../Campus/CampusLogin.html\">University</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"../Industry/IndustryLogin.html\">Industry</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <a href=\"../Admin/AdminLogin.html\">Administrator</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("        <li class=\"nav-item\" data-toggle=\"tooltip\" data-placement=\"right\" title=\"Link\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">\n");
      out.write("            <i class=\"fa fa-fw fa-link\"></i>\n");
      out.write("            <span class=\"nav-link-text\">LinkedIn</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"navbar-nav sidenav-toggler\">\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link text-center\" id=\"sidenavToggler\">\n");
      out.write("            <i class=\"fa fa-fw fa-angle-left\"></i>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("   \n");
      out.write("          <li>\n");
      out.write("               ");

            response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
            response.setHeader("Pragma","no-cache");
            response.setHeader("Expires","0");
            
             HttpSession session3=request.getSession(false);
             String university=(String)session3.getAttribute("university"); 
            
            
        HttpSession session1=request.getSession(false);  
        if(session1.getAttribute("stu_name")!=null){  
        String stu_name=(String)session1.getAttribute("stu_name");  
          
        out.print("<h6 style='color:white; padding-top:10px;' > Hello, "+stu_name+" Welcome to Profile</h6>");  
        }  
        else{  
            
           response.sendRedirect("StudentLogin.html"); 
        }  

       
            
      out.write("\n");
      out.write("            \n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle mr-lg-2\" id=\"alertsDropdown\" href=\"#\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("            <i class=\"fa fa-fw fa-bell\"></i>\n");
      out.write("            <span class=\"d-lg-none\">Alerts\n");
      out.write("              <span class=\"badge badge-pill badge-warning\">6 New</span>\n");
      out.write("            </span>\n");
      out.write("            <span class=\"indicator text-warning d-none d-lg-block\">\n");
      out.write("              <i class=\"fa fa-fw fa-circle\"></i>\n");
      out.write("            </span>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"dropdown-menu\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("            <h6 class=\"dropdown-header\">New Alerts:</h6>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("              <span class=\"text-success\">\n");
      out.write("                <strong>\n");
      out.write("                  <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status Update</strong>\n");
      out.write("              </span>\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("              <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("              <span class=\"text-danger\">\n");
      out.write("                <strong>\n");
      out.write("                  <i class=\"fa fa-long-arrow-down fa-fw\"></i>Status Update</strong>\n");
      out.write("              </span>\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("              <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("              <span class=\"text-success\">\n");
      out.write("                <strong>\n");
      out.write("                  <i class=\"fa fa-long-arrow-up fa-fw\"></i>Status Update</strong>\n");
      out.write("              </span>\n");
      out.write("              <span class=\"small float-right text-muted\">11:21 AM</span>\n");
      out.write("              <div class=\"dropdown-message small\">This is an automated server response message. All systems are online.</div>\n");
      out.write("            </a>\n");
      out.write("            <div class=\"dropdown-divider\"></div>\n");
      out.write("            <a class=\"dropdown-item small\" href=\"#\">View all alerts</a>\n");
      out.write("          </div>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <form class=\"form-inline my-2 my-lg-0 mr-lg-2\">\n");
      out.write("            <div class=\"input-group\">\n");
      out.write("              \n");
      out.write("              <span class=\"input-group-append\">\n");
      out.write("                \n");
      out.write("              </span>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" data-toggle=\"modal\" data-target=\"#exampleModal\">\n");
      out.write("            <i class=\"fa fa-fw fa-sign-out\"></i>Logout</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("  <div class=\"content-wrapper\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <!-- Breadcrumbs-->\n");
      out.write("      <ol class=\"breadcrumb\">\n");
      out.write("        <li class=\"breadcrumb-item\">\n");
      out.write("          <a href=\"#\"></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"breadcrumb-item active\">IdeaHub</li>\n");
      out.write("      </ol>\n");
      out.write("      <!-- Example DataTables Card-->\n");
      out.write("      <div class=\"card mb-3\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\n");
      out.write("          <i class=\"fa fa-table\"></i> Ideas of the students\n");
      out.write("        </div><br><br>\n");
      out.write("        <center>\n");
      out.write("\t\t  \n");
      out.write("               <form action=\"IdeaHub.jsp\" class=\"form1\">\n");
      out.write("            \n");
      out.write("            <table>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("                <tr><td>About</td><td><input type=\"text\" name=\"about\" value=\"\" /></td></tr>\n");
      out.write("                <tr><td>Idea</td><td><textarea rows=\"4\" cols=\"50\" name=\"idea\" value=\"\"></textarea></td></tr>\n");
      out.write("                 <tr><td></td><td><input type=\"submit\" value=\"submit\" /></td></tr>\n");
      out.write("             \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("         ");

                
                  Connection con=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              
              try{
           
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root",""); 
            
              }
            
             catch(Exception e){
                out.print("Submition Failed");
            }
              
               String nic=request.getParameter("nic");
               String cam_name=request.getParameter("cam_name");
               String about=request.getParameter("about");
               String idea=request.getParameter("idea");
                
                
                
                    try{
          String sql="SELECT * FROM ideahub where cam_name='"+university+"'";
         
               pst=con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                
      out.write("\n");
      out.write("               \n");
      out.write("         \n");
      out.write("                \n");
      out.write("\t\t  \n");
      out.write("        <div class=\"card-body\">\n");
      out.write("          <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\">\n");
      out.write("              <thead>\n");
      out.write("                <tr>\n");
      out.write("                  <th>Event Id</th>\n");
      out.write("                  <th>Student Name</th>\n");
      out.write("                  <th>University Name</th>\n");
      out.write("                  <th>Topic</th>\n");
      out.write("                  <th>Idea</th>\n");
      out.write("                  <th>Comments</th>\n");
      out.write("                  \n");
      out.write("                </tr>\n");
      out.write("              </thead>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              <tbody>\n");
      out.write("               \n");
      out.write("                ");

                
          while(rs.next()){
                 
              
      out.write("\n");
      out.write("              \n");
      out.write("              <tr>\n");
      out.write("                        <td>");
      out.print( rs.getString(5));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(1));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(2));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(3));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( rs.getString(4));
      out.write("</td>\n");
      out.write("                         <td><a class=\"button\" href='IdeaComment.jsp?id=");
      out.print( rs.getString(5));
      out.write("'>Add Comment</a></td>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("           ");

             
            }
            
      out.write("\n");
      out.write("                 </tbody>\n");
      out.write("                </table>\n");
      out.write("            ");

                
                    con.close();
                
            
            }
            catch(Exception e){
                System.out.println("hello");
            }               

                
      out.write("\n");
      out.write("            \n");
      out.write("               \n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-footer small text-muted\">Updated a few minutes ago</div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container-fluid-->\n");
      out.write("    <!-- /.content-wrapper-->\n");
      out.write("    <footer class=\"sticky-footer\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <small>Copyright © Rawana DevOps 2018</small>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("      <i class=\"fa fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("      <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("          <div class=\"modal-header\">\n");
      out.write("            <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("            <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("              <span aria-hidden=\"true\">×</span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("          <div class=\"modal-footer\">\n");
      out.write("            <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("            <a class=\"btn btn-primary\" href=\"../LogOut\">Logout</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"../css/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"../css/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"../css/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("    <!-- Page level plugin JavaScript-->\n");
      out.write("    <script src=\"../css/vendor/datatables/jquery.dataTables.js\"></script>\n");
      out.write("    <script src=\"../css/vendor/datatables/dataTables.bootstrap4.js\"></script>\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"../css/js/sb-admin.min.js\"></script>\n");
      out.write("    <!-- Custom scripts for this page-->\n");
      out.write("    <script src=\"../css/js/sb-admin-datatables.min.js\"></script>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
