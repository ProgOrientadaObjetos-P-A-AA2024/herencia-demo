/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import paquete02.Parroquia;
import paquete02.ParroquiaUrbana;
import paquete02.ParroquiaRural;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ParroquiaUrbana urbana = new ParroquiaUrbana(20000.1, 10);
        urbana.establecerNombre("El Valle");
        System.out.printf("%s\n", urbana);
        
        ParroquiaRural rural = new ParroquiaRural(20000.1, 5);
        rural.establecerNombre("Malacatos");
        System.out.printf("%s\n", rural);
    }
    
}
