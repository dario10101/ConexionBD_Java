package Negocio;

import AccesoADatos.Acceso;
import AccesoADatos.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Ruben Dario
 */
public class ControladorBD {
    
    //ATRIBUTOS
    private Conexion atrConexion;
    private Acceso atrAcceso;    
    private String atrConsulta;
    
    public ControladorBD(){
        atrAcceso = new Acceso();
    }
    
    public boolean nuevaConexion(Conexion dcs){
        atrConexion = dcs;
        return atrAcceso.inicializarConexion(atrConexion.getUsuario(), atrConexion.getHost(), atrConexion.getPuerto(), atrConexion.getPassword());
    }      
    
    //Datos del diccionario -------------------------------------
    public ResultSet metadatosTabla(String Tabla){
        atrConsulta = "SELECT column_name Nombre_Tabla, concat(concat(concat(data_type,'('),data_length),')') TipoDato, nullable Puede_Ser_Null \n" 
                    +" FROM user_tab_columns \n" 
                     +"WHERE table_name='"+Tabla+"'\n";
        return atrAcceso.ejecutarSelect(atrConsulta);
    }    
    public ResultSet tablasExistentes(){
        atrConsulta = "SELECT table_name \n"                 
                 + "FROM user_tables \n";
                
        return atrAcceso.ejecutarSelect(atrConsulta);
    }    
    //fin Datos del diccionario --------------------------------- 
    
    public ResultSet datosTabla(String Tabla){
        atrConsulta = "SELECT * \n"                 
                 + "FROM "+Tabla+"  \n";
                
        return atrAcceso.ejecutarSelect(atrConsulta);
    }  
    public boolean crearTabla(Vector<String> columnas, String nombre){
        int tam = columnas.size();
        String sentencia = "";
        sentencia += "CREATE TABLE " + nombre + " \n";
        sentencia += "(\n";
        
        for (int i = 0; i < tam-1; i++){
            sentencia += "\t" + columnas.get(i) + ",\n";
        }
        sentencia += "\t" + columnas.get(tam-1) + " \n";        
        sentencia += ")";
        
        System.out.println(sentencia);
        
        try{
            boolean res =  atrAcceso.ejecutar(sentencia);
            return res;
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }    
    public boolean insertarDato(Vector<String>datos, String tabla){
        String sentencia = "";
        sentencia += "insert into " + tabla + " values (";
        int tam = datos.size()-1;
        for(int i = 0; i < tam; i++){
            sentencia += "'" + datos.get(i) + "',";
        }
        sentencia += "'" + datos.get(tam) + "')";
        
        System.out.println(sentencia);
        
        try{
            boolean res = atrAcceso.ejecutar(sentencia);
            System.out.println(res);
            return res;
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return false;
        }        
    }
    
    public void cerrarConexion() throws SQLException{
        atrAcceso.cerrarConexion();
    }
}
