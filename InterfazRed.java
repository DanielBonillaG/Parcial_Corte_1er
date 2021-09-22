/*
Desarrollado por Daniel José Bonilla Guerra
22/septiembre/2021
Parcial Programación II - 1er Corte
Grupo 02
 */
package Parcial;

public class InterfazRed {
   
    private String ip; //Dirección IP
    private Red red;
    
    public InterfazRed(){}

    public String getIp() {
        return ip;
    }

    public Red getRed() {
        return red;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setRed(Red red) {
        this.red = red;
    } 
}
