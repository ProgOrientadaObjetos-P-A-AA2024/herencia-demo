/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class ParroquiaUrbana extends Parroquia{
    private int numeroParques;
    
    public ParroquiaUrbana(double d, int par){
        super(d);
        numeroParques = par;
    
    }
    
    @Override
    public void establecerNombre(String n){
        nombre = n.toLowerCase();
    }
    
    public void establecerParques(int d){
        numeroParques = d;
    
    }
      
    public double obtenerParques(){
        return numeroParques;
    }
        
    @Override
    public String toString(){
        return String.format("Urbana: %s\nParques: # %d\n",
                nombre, numeroParques);
    }
    
}
