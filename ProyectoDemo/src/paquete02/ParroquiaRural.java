/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class ParroquiaRural extends Parroquia{
    private int numeroSenderos;
    
    public ParroquiaRural(double d, int par){
        super(d);
        numeroSenderos = par;
    
    }
    
    @Override
    public void establecerNombre(String n){
        nombre = n.toUpperCase();
    }
    
    
    public void establecerParques(int d){
        numeroSenderos = d;
    
    }
      
    public double obtenerParques(){
        return numeroSenderos;
    }
        
    @Override
    public String toString(){
        return String.format("Rural: %s\nSenderos: # %d\n",
                nombre, numeroSenderos);
    }
    
}
