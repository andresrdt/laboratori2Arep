/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class LinkedList {
    /**
     * creador de la clase aplicacion. 
     * head y tail se refieren a la cola y cabeza de la lista.
     */
    Nodo head = null;  
    Nodo Tail = null;
    public LinkedList() {
        head=null;
        Tail=null;
    }

    public Nodo getHead() {
        return head;
    }

    public Nodo getTail() {
        return Tail;
    }
    /**
     * agrega un nodo a la lista en la cola
     * @param n valor del nodo a agregar 
     */
    public  void agregarNodo(int n){
        if (head==null){
            head=new Nodo(n);
        } else if (listSize(head)==1){
            head.setNext(new Nodo(n));
            Tail= head.getNext();
        } else{
            Tail.setNext(new Nodo(n));
            Tail=Tail.getNext();
        }
    }
    /**
     * 
     * @param head es la cabeza de la lista
     * @return el tamaño de la lista
     */
    public int listSize(Nodo head){
        int respuesta=0;
        while(head!=null){
            respuesta+=1;
            head=head.getNext();
        }
        return respuesta;
    }
    /**
     * 
     * @param head es la cabeza de la lista
     * @return la media de la lista 
     */
    public float themedia(){
        int size=listSize(head);
        int respuesta=0;
        while(head!=null){
            respuesta+=head.getValor();
            head=head.getNext();
        }
        respuesta=respuesta/size;
        return respuesta;
    }
    /**
     * 
     * @param head es la cabeza de la lista
     * @param media media de la lista
     * @return es la desviacion estandar de la lista
     */
    public float deviationStandar(int media){
        int size=listSize(head);
        float respuesta=0;
        while(head!=null){
            respuesta+= (float)Math.pow(Math.abs((head.getValor()-media)),2);
            head=head.getNext();
        }
        respuesta=respuesta/(size-1);
        return (float)Math.sqrt(respuesta);
    }
    /**
     * elimina un nodo de la lista. 
     * @param valor el valor del nodo a eliminar
     */
    public void DeleteNodo(int valor){
        Nodo temp=head;
        Nodo flag=null;
        while (temp!=null){
            if (head.getValor()==valor || temp==head){
                head=temp.getNext();
            if (temp.getNext()==Tail || Tail.getValor()==valor){
                Tail=temp;
                temp.setNext(null);
            }
            if (temp.getNext().getValor()==valor){
                    flag=temp.getNext();
                    temp.setNext(flag.getNext());
                }
            }
        }
    }
}


