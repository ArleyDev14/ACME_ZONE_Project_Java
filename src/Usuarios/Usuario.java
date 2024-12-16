package Usuarios;

public class Usuario {
    private long documento;
    private String nombre;
    
    //Constructor del user
    public Usuario(long documento, String nombre){
        this.documento = documento;
        this.nombre = nombre;
    }
    
    public long getDocumento(){
        return documento;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setDocumento(long documento){
        this.documento = documento;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //
    
}
