/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Figura;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author surfa
 */
public class ControladorFigura {
     private Map<Integer, Figura> diccionario;
     private Figura figura;

    public ControladorFigura(Figura figura) {
        this.diccionario = new HashMap<Integer, Figura>();
        this.figura = figura;
    }

    public ControladorFigura() {
    }
    
    
     
     public boolean crear(int identificador, String nombre, String color, int base, int altura ) {
        figura = new Figura(identificador, nombre, color, base, altura);
        diccionario.put(identificador, figura);
            return true;
    }

    public Figura buscar(int identificador) {
        if (figura != null) {
            return figura;
        } else {
            System.out.println("la Figura no existe");
            return null;
        }
    }

    public boolean modificar(int identificador, String nombre, String color, int base, int altura ) {
        if (figura != null) {
           figura.setIdentificador(identificador);
           figura.setNombre(nombre);
           figura.setColor(color);
           figura.setBase(base);
           figura.setAltura(altura);
            diccionario.replace(identificador, figura);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(int  identificador) {
        if (buscar(identificador) != null) {
            figura = new Figura(identificador, null, null,0,0);
            diccionario.remove(identificador);
            return true;
        } else {
            return false;
        }
    }

    public Collection<Figura> findAll() {
        Collection<Figura> figura= diccionario.values();
        return figura;
    }
}

     
