/*
Desarrollado por Daniel José Bonilla Guerra
22/septiembre/2021
Parcial Programación II - 1er Corte
Grupo 02
 */
package Parcial;

public class Host {
   private String nombre;
   private String sistema; //Sistema Operativo
   private String msg;
   private Red red;
   
   private Host(){}

    public String getNombre() {
        return nombre;
    }

    public String getSistema() {
        return sistema;
    }

    public String getMsg() {
        return msg;
    }

    public Red getRed() {
        return red;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setRed(Red red) {
        this.red = red;
    }
   
    public void configurar(int a, int b, int c, int d){
    
    }
    
    public boolean conectar(Red red){
        
    }
    
    public void ping(Host Host, String msg){
    
    }
    
    public void ping(String msg){
    
    }
   
}
