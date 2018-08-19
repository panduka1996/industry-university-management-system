
package bean;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StudentBean implements Serializable {
    
   
    private String id;
    private String stu_name;
    private String tell;
    private String cam_name;
    private String pass;
    private boolean state;
    
    
   public StudentBean(){
       
       
   }

    public String getId() {
        return id;
    }

    
    public void setId(String id) {
        this.id = id;
    }

   
    public String getStu_name() {
        return stu_name;
    }

    
    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

   
    public String getTell() {
        return tell;
    }

   
    public void setTell(String tell) {
        this.tell = tell;
    }

    
    public String getCam_name() {
        return cam_name;
    }

    
    public void setCam_name(String cam_name) {
        this.cam_name = cam_name;
    }

    
    public String getPass() {
        return pass;
    }

   
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public boolean validate(){
        
            Connection con=null;
              PreparedStatement pst=null;
              ResultSet rs=null;
              
              try{
           
             Class.forName("com.mysql.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp","root",""); 
             }
             catch(Exception e){
                 System.out.println("Connection error");
             }
              
              try{
                  
               String sql="INSERT INTO studentlogin (nic_num,password,stu_name,stu_tell,university) VALUES ('"+id+"','"+pass+"','"+stu_name+"','"+tell+"','"+cam_name+"')";
        
               pst=con.prepareStatement(sql);
               pst.execute();
                
               state=true;
                  
              }
              catch(Exception e){
                  System.out.println("something went wrong");
                  state=false;
              }
        
        return state;
    }
   
   
    
}
