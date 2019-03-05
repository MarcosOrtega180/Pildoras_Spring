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
public class SecretarioEmpleado implements Empleados {

    public SecretarioEmpleado() {
    }

    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes";
    }
    
    
}
