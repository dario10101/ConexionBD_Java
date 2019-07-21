package AccesoADatos;

/**
 *
 * @author Ruben Dario
 */
public class Conexion {
    private String usuario;
    private String host;
    private int puerto;
    private String password;

    public Conexion() {
        this.usuario = "";
        this.host = "";
        this.puerto = 0;
        this.password = "";
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }    
    public String getHost() {
        return host;
    }
    public void setHost(String Host) {
        this.host = Host;
    }
    public int getPuerto() {
        return puerto;
    }
    public void setPuerto(int Puerto) {
        this.puerto = Puerto;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
