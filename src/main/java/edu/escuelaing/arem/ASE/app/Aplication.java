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

    /*public Aplication() {
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
    }*/

    private LinkedList lista;
     private double media;
     public Aplication(){
         lista= new LinkedList();
         media=0;
     }
     /**
      * funcion para calcular la media de un conjunto de datos
      * @return entrega la media de la lista dada 
      */
     public double getMedia(){
         Nodo x=lista.getHead();
         while (x.getNext()!=null){
             media+=x.getValor();
             x=x.getNext();
         }
         media+=x.getValor();
         media=media/lista.getNumeroElementos();
         return media;
     }
     /**
      * funcion que calcula la desviacion estandar de la lista
      * @return da la desviacion estandar de la lista 
      */
     public double getDesviacion(){
         double desviacion=0;
         int base=2;
         Nodo x=lista.getHead();
         while (x.getNext()!=null){
             desviacion+=(double) Math.pow(x.getValor()-media,base);
             x=x.getNext();
         }
         desviacion+=(double) Math.pow(x.getValor()-media,base);
         desviacion=Math.sqrt(desviacion/(lista.getNumeroElementos()-1));
         return desviacion;
     }
     /**
      * funcion usada para leer el fichero dado y obtener la lista
      * @param file direccion del archivo .txt que se leera
      */
     public void leer(String file){
         lista.read(file);
     }

    public LinkedList getLista() {
        return lista;
    }
}
