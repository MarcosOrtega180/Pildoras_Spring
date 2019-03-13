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
public class Informe implements CreacionInformes{

    @Override
    public String getInforme() {
        return "Esta es la presentación del informe";
    }
    
}
