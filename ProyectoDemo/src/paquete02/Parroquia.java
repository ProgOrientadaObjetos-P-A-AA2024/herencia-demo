/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Parroquia {
    protected String nombre;
    protected double presupuesto;
    
    public Parroquia(double d){
        presupuesto = d;
    
    }
    
    public void establecerpresupuesto(double d){
        presupuesto = d;
    
    }
    
    public void establecerNombre(String d){
        nombre = d;
    
    }
    
    public double obtenerpresupuesto(){
        return presupuesto;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s - Presupuesto: %.2f\n",
                nombre, presupuesto);
    }
    
}
