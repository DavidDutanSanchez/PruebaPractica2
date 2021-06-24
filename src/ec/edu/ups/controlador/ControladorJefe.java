/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Figura;
import ec.edu.ups.modelo.Jefe;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author surfa
 */
public class ControladorJefe {
    private Jefe jefes;
     private Map<Integer, Jefe> diccionario;

    public ControladorJefe(Jefe fejes) {
        this.jefes = fejes;
        this.diccionario = new HashMap<Integer, Jefe>();
    }

    public ControladorJefe() {
    }
    
     
     public boolean crear(int codigo,String nombre,String direccion,String telefono) {
       jefes = new Jefe(codigo, nombre, direccion, telefono);
        diccionario.put(codigo, jefes);
            return true;
    }

    public Jefe buscar(int codigo) {
        if (jefes != null) {
            return jefes;
        } else {
            System.out.println("la Figura no existe");
            return null;
        }
    }

    public boolean modificar(int codigo,String nombre,String direccion,String telefono) {
        if (jefes != null) {
          jefes.setNombre(nombre);
          jefes.setDireccion(direccion);
          jefes.setTelefono(telefono);
            diccionario.replace(codigo, jefes);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminar(int codigo) {
        if (buscar(codigo) != null) {
           jefes = new Jefe(codigo, null, null,null);
            diccionario.remove(codigo);
            return true;
        } else {
            return false;
        }
    }

    public Collection<Jefe> findAll() {
        Collection<Jefe> jefes= diccionario.values();
        return jefes;
    } 
}
