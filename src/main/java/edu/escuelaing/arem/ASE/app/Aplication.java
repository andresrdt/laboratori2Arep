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

    public Aplication() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        Nodo head = null;
        Nodo Tail = null;
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
                    oldnd.Next(new Nodo(numero));
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
    public int listSize(Nodo head){
        int respuesta=0;
        while(head!=null){
            respuesta+=1;
            head=head.getNext();
        }
        return respuesta;
    }
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
}


