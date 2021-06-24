/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Figura;
import ec.edu.ups.modelo.Linea;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author surfa
 */
public class ControladorLinea {
    
     private Map<Integer, Linea> diccionario;
     private Linea lineas;

    public ControladorLinea( Linea lineas) {
        this.diccionario = new HashMap<Integer, Linea>();
        this.lineas = lineas;
    }
     
     public boolean crear(int identificador, int puntoOrigen, int puntoFinal ) {
        lineas = new Linea(identificador, puntoOrigen, puntoFinal);
        diccionario.put(identificador,lineas);
            return true;
    }

    public Linea buscar(int identificador) {
        if (lineas != null) {
            return lineas;
        } else {
            System.out.println("la linea no existe");
            return null;
        }
    }

    public boolean modificar(int identificador, int puntoOrigen, int puntoFinal) {
        if (lineas != null) {
          
            lineas.setIdentificador(identificador);
            lineas.setPuntoFinal(puntoOrigen);
            lineas.setPuntoFinal(puntoFinal);
            diccionario.replace(identificador, lineas);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(int  indentificador) {
        if (buscar(indentificador) != null) {
            lineas = new Linea(indentificador, 0, 0);
            diccionario.remove(0);
            return true;
        } else {
            return false;
        }
    }

    public Collection<Linea> findAll() {
        Collection<Linea> lineas= diccionario.values();
        return lineas;
    }
}
