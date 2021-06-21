/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadoracomposicion;

import ico.fes.hardware.CPU;
import ico.fes.hardware.Monitor;
import ico.fes.hardware.Mouse;
import ico.fes.hardware.Teclado;



/**
 *
 * @author Usuario
 */
public class ComputadoraComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Monitor monitor=new Monitor();
       monitor=new Monitor("Samsumg","Profesional",24f);
       
       Mouse mouse=new Mouse();
       mouse=new Mouse("MARVO","Scorpion KM409","Alambrico");
       
       Teclado teclado=new Teclado();
       teclado=new Teclado("MARVO","Scorpion KM409",104f,"si");
       
       CPU cpu=new CPU();
       cpu=new CPU("AMD","Ryzen 5 3400G",3.5f);
       
       System.out.println(monitor);
       System.out.println(mouse);
       System.out.println(teclado);
       System.out.println(cpu);
    }
    
}
