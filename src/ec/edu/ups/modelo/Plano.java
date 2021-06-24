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
public class Plano {

    private int numeroIdentificacion;
    private String fechaEntrega;
    private String nombreArquitecto;
    private String dibujo;
    private int numeroFiguras;
    private List<Figura> figuras;

    public Plano(int numeroIdentificacion, String fechaEntrega, String nombreArquitecto, String dibujo, int numeroFiguras, List<Figura> figuras) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.fechaEntrega = fechaEntrega;
        this.nombreArquitecto = nombreArquitecto;
        this.dibujo = dibujo;
        this.numeroFiguras = numeroFiguras;
        this.figuras = figuras;
    }

    public Plano() {
    }
    
    

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getNombreArquitecto() {
        return nombreArquitecto;
    }

    public void setNombreArquitecto(String nombreArquitecto) {
        this.nombreArquitecto = nombreArquitecto;
    }

    public String getDibujo() {
        return dibujo;
    }

    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }

    public int getNumeroFiguras() {
        return numeroFiguras;
    }

    public void setNumeroFiguras(int numeroFiguras) {
        this.numeroFiguras = numeroFiguras;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return "Plano{" + "numeroIdentificacion=" + numeroIdentificacion + ", fechaEntrega=" + fechaEntrega + ", nombreArquitecto=" + nombreArquitecto + ", dibujo=" + dibujo + ", numeroFiguras=" + numeroFiguras + ", figuras=" + figuras + '}';
    }
    
    

}
