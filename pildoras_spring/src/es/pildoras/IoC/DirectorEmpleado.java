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
public class DirectorEmpleado implements Empleados {
    //Creación de campo tipo CreaciónInforme (interfaz)
    private CreacionInformes informeNuevo;
    
    //Creación de constructor que inyecta la dependencia.
    public DirectorEmpleado(CreacionInformes informenuevo){
        this.informeNuevo=informenuevo;
    };
    
    public DirectorEmpleado() {
        
    }

    @Override
    public String getTareas() {
        return "Gestionar la plantilla de la empresa";
        
    }

    @Override
    public String getInforme() {
        return "Informe creado por el Director: "+ informeNuevo.getInforme();
    }
    
}
