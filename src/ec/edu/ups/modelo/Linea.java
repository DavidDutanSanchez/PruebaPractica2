/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author surfa
 */
public class Linea {
    private int identificador;
    private int puntoOrigen;
    private int puntoFinal;

    public Linea(int identificador, int puntoOrigen, int puntoFinal) {
        this.identificador = identificador;
        this.puntoOrigen = puntoOrigen;
        this.puntoFinal = puntoFinal;
        
    }

    public Linea() {
    }
    
    

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(int puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public int getPuntoFinal() {
        return puntoFinal;
    }

    public void setPuntoFinal(int puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    @Override
    public String toString() {
        return "Linea{" + "identificador=" + identificador + ", puntoOrigen=" + puntoOrigen + ", puntoFinal=" + puntoFinal + '}';
    }
    
    
    
   public void calcularLongitud(int puntoOrigen, int puntoFinal){
       
   }
}
