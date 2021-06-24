/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorLinea;
import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class VistaLinea {
      private ControladorLinea contraladorLinea;
    Scanner scanner=new Scanner(System.in);

    public VistaLinea(ControladorLinea contraladorLinea) {
        this.contraladorLinea = contraladorLinea;
    }
    
    public void crear(){
        System.out.println(" Ingrese el identifiador:");
        int identificador=scanner.nextInt();
        System.out.println("Ingrese el puntoOrigen:");
       int puntoOrigen=scanner.nextInt();
        System.out.println("Ingrese el punto final:");
        int puntoFinal=scanner.nextInt();
        contraladorLinea.crear(identificador, puntoOrigen, puntoFinal);
        System.out.println("-------Creado------------");
        
    }
    public VistaFigura buscar(){
         System.out.println("Ingrese el identifiacor");
        int identificador=scanner.nextInt();
        if (contraladorLinea.buscar(identificador)!= null){
            System.out.println(contraladorLinea.buscar(identificador).toString());
        }else{
            System.out.println("la linea no existe ");
        } 
        return null;  
    }
    public void modificar(){
       System.out.println("Ingrese el identifiacador de la linea a buscar");
        int identificador=scanner.nextInt();
        if(contraladorLinea.buscar(identificador)!=null){
            System.out.println("----Ingrese los nuevo Datos----");
            System.out.println("Ingrese el nuevo punto de origen");
            int puntoOrigen=scanner.nextInt();
            System.out.println("Ingrese el nuevo punto final");
             int puntoFinal=scanner.nextInt();
            contraladorLinea.modificar(identificador, puntoOrigen, puntoFinal);
            System.out.println("linea modifcada");
        }else{
            System.out.println("la linea no exciste");
        }
    }  
    
    public void Eliminar(){
       System.out.println("Ingrese el identificador a eliminar:");
        int identificador=scanner.nextInt();
       if (contraladorLinea.buscar(identificador)!=null){
            contraladorLinea.eliminar(identificador);
            System.out.println("linea eliminada");
        } else {
            System.out.println("la linea no existe");
        } 
    }
    public void listar(){
         contraladorLinea.findAll().stream().forEach(object -> System.out.println(object));
    }
}
