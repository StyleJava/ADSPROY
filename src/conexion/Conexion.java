
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
  
   public static Connection con;
    // Declaramos los datos de conexion a la bd
   
    private static final String user="root";
    private static final String pass="13062002";
    private static final String url="jdbc:mysql://localhost:3305/bd_login";
    // Funcion que va conectarse a mi bd de mysql
    public static Connection conectar(){
      con = null;
      try{
          con = (Connection) DriverManager.getConnection(url, user, pass);
          if(con!=null){
          }
      }
      catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,"Error" + e.toString());
      }
      return con;
    } 
    
}