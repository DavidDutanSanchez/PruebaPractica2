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
public class Figura {
    private int identificador;
    private String nombre;
    private String color;
    private int base;
    private int altura;

    public Figura(int identificador, String nombre, String color, int base, int altura) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.color = color;
        this.base = base;
        this.altura = altura;
    }

    public Figura() {
    }
    

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Figura{" + "identificador=" + identificador + ", nombre=" + nombre + ", color=" + color + ", base=" + base + ", altura=" + altura + '}';
    }
    
    public void calcularArea(int base, int altura){
        
    }
}
