/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
//        Empleados Empleado1 = new DirectorEmpleado();
        //uso de los objetos creados
//        System.out.println(Empleado1.getTareas());

        //aplicando spring        
        // TODO aquí cargo el xml
        ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("/es/pildoras/IoC/applicationContext.xml");
        
        Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);
        
        System.out.println(Juan.getTareas());
        System.out.println(Juan.getInforme());
        //una vez utilizado el contexto, hay que cerrarlo para liberar recursos
        contexto.close();
    }

}
