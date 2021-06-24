/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author surfa
 */
public class Poligono extends Figura{
    private int numeroLineas;
    private List<Linea> lineas;

    public Poligono(int numeroLineas, List<Linea> lineas, int identificador, String nombre, String color, int base, int altura) {
        super(identificador, nombre, color, base, altura);
        this.numeroLineas = numeroLineas;
        lineas = new ArrayList<>();
    }

    public Poligono() {
    }
    


    public int getNumeroLineas() {
        return numeroLineas;
    }

    public void setNumeroLineas(int numeroLineas) {
        this.numeroLineas = numeroLineas;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }
    
    

   

    @Override
    public String toString() {
        return "Poligono{" + "numeroLineas=" + numeroLineas + ", lineas=" + lineas + '}';
    }

    public void calcularPerimetro(int numeroLineas){
        
    }
}
