/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author 2110540
 */
public class Aplication {
    public Aplication() {
        LinkedList api= new LinkedList();
        api.agregarNodo(160);
        api.agregarNodo(591);
        api.agregarNodo(114);
        api.agregarNodo(229);
        api.agregarNodo(230);
        api.agregarNodo(270);
        api.agregarNodo(128);
        api.agregarNodo(1657);
        api.agregarNodo(624);
        api.agregarNodo(1503);
        float media = api.themedia();
        float desviacion =api.deviationStandar(media);
        System.out.println("La media es :"+media+"La desviacion estandar es :" + desviacion);
    }
}
