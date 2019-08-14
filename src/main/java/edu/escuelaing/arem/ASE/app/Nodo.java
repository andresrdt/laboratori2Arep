/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

/**
 *
 * @author 2112076
 * Esta clase representa a un nodo y sus componentes.
 */
public class Nodo {
    int valor;
    Nodo next=null;
    /**
     * 
     * @param next la referencia al siguiente nodo a este. 
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
    public Nodo(int valor) {
        this.valor = valor;
    }
    
    /**retorna el valor almacenado en el nodo
     * 
     * @return valor un entetero que el nodo contiene
     */
    public int getValor() {
        return valor;
    }

    /**
     * 
     * @return una referencia al siguiente nodo 
     */
    public Nodo getNext() {
        return next;
    }
    
}
