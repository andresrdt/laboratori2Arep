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
public class Aplication {
    /**
     * creador de la clase aplicacion.
     * se leeeran una lista de numeros que terminara al escribir -1. cada numero escrito es asignado como valor de un nodo que se crea. 
     * head y tail se refieren a la cola y cabeza de la lista, nd es el nodo que se esta creando y oldnd es uan variable usada para guardar
     * el nodo recien creado.
     */
    Nodo head = null;  
    Nodo Tail = null;
    public Aplication() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        Nodo nd;
        Nodo oldnd = null;
        boolean First = true;
        System.out.println("introduzca los numeros de la lista. Escriba -1 para salir.");
        do {
            numero = sc.nextInt();
            if (First) {
                nd = new Nodo(numero);
                head = nd;
                First = false;
                oldnd = nd;
            } else {
                if (numero != -1) {
                    oldnd.setNext(new Nodo(numero));
                    nd = oldnd.getNext();
                    oldnd = nd;
                } else {

                    Tail = oldnd;
                }

            }
        } while (numero != -1);
        float media= themedia(head);
        float deviation= deviationStandar(head,(int)media);
        System.out.println("The media is : ");
        System.out.println(media);
        System.out.println("The deviation is : ");
        System.out.println(deviation);
        
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
    public float themedia(Nodo head){
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
    public float deviationStandar(Nodo head,int media){
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


