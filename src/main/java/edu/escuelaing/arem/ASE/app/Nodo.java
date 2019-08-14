/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author 2112076
 */
public class Nodo {
    /**
    * @param valor Es el numero que se almacena dentro del nodo.
    * @param next se refiere al siguente nodo en la lista.
    */
    int valor;
    Nodo next=null;

    public void Next(Nodo next) {
        this.next = next;
    }
    public Nodo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getNext() {
        return next;
    }
    
}
