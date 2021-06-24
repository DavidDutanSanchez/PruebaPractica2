/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Figura;
import ec.edu.ups.modelo.Poligono;
import ec.edu.ups.modelo.Linea;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author surfa
 */
public class ControladorPoligono {
    
    private Map<Integer, Poligono> diccionario;
     private Poligono poligono;
     private ControladorPoligono controladorPoligono;
     private Linea lineas;

    public ControladorPoligono(Poligono poligono, Linea lineas) {
        this.diccionario =new HashMap<Integer, Poligono>();
        this.poligono = poligono;
        this.controladorPoligono = controladorPoligono;
        this.lineas = lineas;
    }

    public ControladorPoligono() {
    }
    

   public boolean create(int numeroLineas, int lineas) {
        if (controladorPoligono.buscar(lineas) != null) {
           // poligono = new Poligono(numeroLineas, lineas, lineas, nombre, color, lineas, lineas)
            // Set<DatosCliente> clientes1 = new HashSet<>();
            //for (DatosCliente cliente : clientes1) {
            //  factura.agregarDatosCliente(datosCliente);
            //clientes1.add(cliente);
            diccionario.put(lineas, poligono);

            return true;
            // }
        }
        return false;
    }

    public Poligono buscar(int numeroLineas) {
        if (poligono != null) {
            return poligono;
        } else {
            System.out.println("la factura no existe");
        }
        return null;
    }

    public boolean eliminar(int numeroLineas) {
        if (buscar(numeroLineas) != null) {
           // poligono = new Poligono(numeroLineas, lineas, numeroLineas, nombre, color, numeroLineas, numeroLineas);
            diccionario.clear();
            return true;
        } else {
            return false;
        }
    }
}
   
 

