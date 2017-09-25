/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import estructurasdedatos.utiles.nodos.NodoPersona;

/**
 *
 * @author tusk
 */
public class Cola {
    
    private NodoPersona dato;
    private NodoPersona tope;
    private NodoPersona ultimo;

    public void crearcola() {
        tope = ultimo = null;
    }

    public boolean vacia() {
        return (this.tope == null);
    }

    public void encolar(int cedula) {       
        NodoPersona nuevo = new NodoPersona();       
        nuevo.setDato(cedula);      
        if (vacia()) {            
            this.tope = nuevo;
            this.ultimo = nuevo;            
        } else {            
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }
  
    public void desencolar() {
        if (vacia()) { 
            System.out.println("Cola vacia");
        } else { 
            tope = tope.getSiguiente();
        }
    }

    public void listar() {
        NodoPersona aux = tope;
        System.out.println("");
        int i = 0;
        while (aux != null) {
            System.out.println(i + "." + " [ " + aux.getDato().getCedula() + " ]");
            aux = aux.getSiguiente();
            i++;
        }
    }

    public int size() {
        NodoPersona aux = tope; 
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    public NodoPersona getDato() {
        return dato;
    }

    public void setDato(int cedula) {
        NodoPersona p = new NodoPersona();
        p = dato;
    }

}
   