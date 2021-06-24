/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorFigura;
import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class VistaFigura {
    
    private ControladorFigura contraladorFigura;
    Scanner scanner=new Scanner(System.in);

    public VistaFigura(ControladorFigura contraladorFigura) {
        this.contraladorFigura = contraladorFigura;
    }

   
    
    public void crear(){
        System.out.println(" Ingrese el Identificador:");
        int identificador=scanner.nextInt();
        System.out.println("Ingrese el nombre:");
        String nombre=scanner.next();
        System.out.println("Ingrese el color:");
        String color=scanner.next();
        System.out.println("Ingrese la Base: ");
        int base=scanner.nextInt();
        System.out.println("Ingrese la altura: ");
        int altura=scanner.nextInt();
       contraladorFigura.crear(identificador, nombre, color, base, altura);
        System.out.println("-------Creado------------");
        
    }
    public VistaFigura buscar(){
         System.out.println("Ingrese el identificador");
        int identificador=scanner.nextInt();
        if (contraladorFigura.buscar(identificador)!= null){
            System.out.println(contraladorFigura.buscar(identificador).toString());
        }else{
            System.out.println("la linea no existe ");
        } 
        return null;  
    }
    public void modificar(){
       System.out.println("Ingrese el identificador a modificar");
        int identificador=scanner.nextInt();
        if(contraladorFigura.buscar(identificador)!=null){
            System.out.println("----Ingrese los nuevo Datos----");
            System.out.println("Ingrese el nuevo nombre");
            String nombre=scanner.next();
            System.out.println("Ingrese la nuevo color:");
            String color=scanner.next();
            System.out.println("Ingrese la nueva base");
            int base=scanner.nextInt();
            System.out.println("Ingrese la nueva altura");
            int altura=scanner.nextInt();
            
            contraladorFigura.modificar(identificador, nombre, color, base, altura);
            System.out.println("Linea modificada");
        }else{
            System.out.println("linea no existe");
        }
    }  
    
    public void Eliminar(){
       System.out.println("Ingrese el identificador:");
        int identificador=scanner.nextInt();
       if (contraladorFigura.buscar(identificador)!=null){
            contraladorFigura.eliminar(identificador);
            System.out.println("Producto eliminado con exito");
        } else {
            System.out.println("Producto no existente");
        } 
    }
    public void listar(){
         contraladorFigura.findAll().stream().forEach(object -> System.out.println(object));
    }
   
}
