/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.List;

/**
 *
 * @author surfa
 */
public class Proyecto {
    private int codigo;
    private String nombre;
    private Jefe jefe;
    private List<Plano> planos;

    public Proyecto(int codigo, String nombre, Jefe jefe, List<Plano> planos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.jefe = jefe;
        this.planos = planos;
    }

    public Proyecto() {
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public List<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(List<Plano> planos) {
        this.planos = planos;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "codigo=" + codigo + ", nombre=" + nombre + ", jefe=" + jefe + ", planos=" + planos + '}';
    }
    
    
    public void guardad (Plano planos){
        
    }
    
}
