package edu.escuelaing.arem.ASE.app;
/**
 * Hello world!
 *
 */
public class main {

    public static void main(String[] args) {
        LinkedList api= new LinkedList();
        api.agregarNodo(1);
        api.agregarNodo(10);
        api.agregarNodo(15);
        Nodo n=api.getHead();
        while(n!=null){
            System.out.println(n.getValor());
            n=n.getNext();
        }
    }
}
