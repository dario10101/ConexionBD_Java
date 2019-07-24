package AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ruben Dario
 */
public class Acceso {
    private String atrCadenaConexion;
    private Connection atrConexion;
    
    public Acceso(){
        atrCadenaConexion = "";
    }       
    
    public boolean inicializarConexion(String usuario, String host, int port, String pass){
        
        try{
            atrCadenaConexion = String.format("jdbc:oracle:thin:@%s:%s:xe",host, port);           
            atrConexion = DriverManager.getConnection(atrCadenaConexion, usuario, pass);           
            return true;
        }
        catch(Exception ex){
            System.out.println("error: " + ex);
            return false;
        }    
    }  
    public void cerrarConexion() throws SQLException{
        atrConexion.close();
    }
    public ResultSet ejecutarSelect(String consulta){
        ResultSet respuesta;
        try{
            Statement statement = atrConexion.createStatement();
            respuesta = statement.executeQuery(consulta); 
            return respuesta;        
        }
        catch(Exception ex){
          System.out.println("Error: " + ex.getMessage());          
        }
        return null;        
    }  
    public boolean ejecutar(String sentencia){
        try{
            Statement statement = atrConexion.createStatement();
            return statement.execute(sentencia);       
        }
        catch(Exception ex){
          System.out.println("Error: " + ex.getMessage());          
        }
        return false;
    } 
    
}
