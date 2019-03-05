/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.pildoras.IoC;

/**
 *
 * @author maros
 */
public class UsoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creación de objetos de tipo empleado
        Empleados Empleado1 = new DirectorEmpleado();
       
        //uso de los objetos creados
        System.out.println(Empleado1.getTareas());
    }
    
}
