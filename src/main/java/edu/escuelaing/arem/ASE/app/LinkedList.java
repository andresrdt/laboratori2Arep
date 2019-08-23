/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import javax.xml.ws.Response;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 *
 * @author Andres
 */
public class LinkedList {
    private Nodo head;
    private Nodo tail;
    private int numeroElementos;
    private String txt="";
    
    public LinkedList(){
        head=null;
        numeroElementos=0;
    }
    /**
    * A?ade un elemento a la lista
    *@param numero representa el valor que se va agregar en la lista(un numero en este caso)
    */
    public void add(double numero){
        numeroElementos++;
        if (head==null){
            head= new Nodo((int)numero);
            tail=head;
        } else{
            Nodo Temp= new Nodo((int)numero);
            tail.setNext(Temp);
            tail=Temp;
        }
    }
    /**
     * funcion que regresa el primer elemnto agregado
     * @return devuelve el primer elemento de la lista 
     */
    public Nodo getHead() {
        return head;
    }
    /**
     * indica la cantidad de elementos en la lista
     * @return cantidad de elementos en la lista
     */
    public int getNumeroElementos() {
        return numeroElementos;
    }
    /**
     * lee el archivo y mete los elementos de este en la lista, cada numero esta en una linea diferente
     * @param file direccion del arciovo a leer
     */
    public void leer(String file){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String bfRead;
            while ((bfRead=bf.readLine()) != null){
                this.add(Double.parseDouble(bfRead));
            }
        } catch (Exception e){
            System.err.println("No se encontro el archivo ");
        }
    }
    public void read(String string){
        String[] part=string.split(",");
        for(String i:part){
            this.add(Double.parseDouble(i));
        }
    }
    @Override
    public String toString() {
         Nodo temp=head;
         while (temp.getNext()!= null){
            txt=txt+temp.getValor();
            temp=temp.getNext();
         }
        return txt;
    }
}


