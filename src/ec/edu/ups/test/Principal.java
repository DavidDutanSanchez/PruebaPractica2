/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import ec.edu.ups.controlador.*;
import ec.edu.ups.modelo.*;
import ec.edu.ups.vista.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class Principal {
    public static void main(String []args){
        
        //modelo
        Figura figura=new Figura();
        Jefe jefe=new Jefe();
        Linea linea=new Linea();
        Plano plano = new Plano();
        Poligono poligono = new Poligono();
        Proyecto proyecto=new Proyecto();
       
        //controladores
        ControladorFigura controladroFigura=new ControladorFigura(figura);
        ControladorJefe contrladorJefe=new ControladorJefe(jefe);
        ControladorLinea controladorLinea=new ControladorLinea(linea);
        ControladorPoligono controladorPoligono=new ControladorPoligono(poligono, linea);
        //vistas
        VistaFigura vistaFigura= new VistaFigura(controladroFigura);
        VistaJefe vistaJefe=new VistaJefe(contrladorJefe);
        VistaLinea vistaLinea=new VistaLinea(controladorLinea);
       
       
        Scanner scanner=new Scanner(System.in);
         boolean salir = false;
        boolean salir1 = false;
        boolean salir2 = false;
        boolean salir3 = false;
        boolean salir4 = false;
        boolean salir5 = false;
        boolean salir6 = false;
        int opcion;
        int opcion1;
        int opcion2;
        int opcion3;
        int opcion4;
        int opcion5;
        int opcion6;
        
        while (!salir) {
            System.out.println("Bienvenido al sistema de David Dutan ");
            System.out.println(" 1.gestionar figura\n 2.gestionar Jefe\n 3.gestionar Lineas\n 4.salir");
            try {
                System.out.println("Elija una opcion");
                opcion = scanner.nextInt();

                switch (opcion) {

                    case 1:
                        while (!salir1) {
                            System.out.println("QUE DESEEA HACER");
                            System.out.println("*******************************");
                            System.out.println(
                                    " 1.Crear Figura\n "
                                    + "2.Buscar figuras \n "
                                    + "3.modificar una figura\n "
                                    + "4.Eliminar una figura\n "
                                    + "5.Listar figuras\n "
                                    + "6.salir\n ");

                            try {
                                System.out.println("Elija una opcion: ");
                                opcion1 = scanner.nextInt();
                                switch (opcion1) {
                                    case 1:
                                       vistaFigura.crear();
                                        break;
                                    case 2:
                                       vistaFigura.buscar();
                                        break;
                                    case 3:
                                        vistaFigura.modificar();
                                        break;
                                    case 4:
                                        vistaFigura.Eliminar();
                                        break;
                                    case 5:
                                        vistaFigura.listar();
                                        break;
                                    case 6:
                                        salir1 = true;
                                        break;
                                    default:
                                        System.out.println("Solo numeros entre el 1 y 6");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un numero.");
                                scanner.nextInt();
                            }
                        }
                        break;
                    case 2:
                        while (!salir2) {
                            System.out.println("QUE DESEEA HACER");
                            System.out.println("*******************************");
                            System.out.println(
                                    " 1.Registrar jefe\n "
                                    + "2.buscar jefe\n "
                                    + "3.modificar jefe\n "
                                    + "4.eliminar jefe\n "
                                    + "5.Listar jefe\n "
                                    + "6.salir\n ");
                            try {
                                System.out.println("Elija una opcion");
                                opcion2 = scanner.nextInt();
                                switch (opcion2) {
                                    case 1:
                                        vistaJefe.crear();
                                        break;
                                    case 2:
                                       vistaJefe.buscar();
                                        break;
                                    case 3:
                                       vistaJefe.modificar();
                                        break;
                                    case 4:
                                       vistaFigura.Eliminar();
                                        break;
                                    case 5:
                                        vistaJefe.listar();
                                        break;
                                    case 6:
                                        salir2 = true;
                                        break;
                                    default:
                                        System.out.println("Solo numeros entre el 1 y 6");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un numero.");
                                scanner.nextInt();
                            }
                        }
                        break;
                    case 3:
                        while (!salir3) {
                            System.out.println("QUE DESEEA HACER");
                            System.out.println("*******************************");
                            System.out.println(
                                    " 1.Crear linea\n "
                                    + "2.buscar linea \n "
                                    + "3.modificar linea\n "
                                    + "4.eliminar lineas\n "
                                    + "5. listar lineas\n "     
                                    + "6.salir\n ");
                            try {
                                System.out.println("Elija una opcion");
                                opcion1 = scanner.nextInt();
                                switch (opcion1) {
                                    case 1:
                                       vistaLinea.crear();
                                        break;
                                    case 2:
                                        vistaLinea.buscar();
                                        break;
                                    case 3:
                                        vistaLinea.modificar();
                                        break;
                                    case 4:
                                        vistaLinea.Eliminar();
                                        break;
                                         case 5:
                                        vistaLinea.listar();
                                        break;
                                    case 6:
                                        salir3 = true;
                                        break;
                                    default:
                                        System.out.println("Solo numeros entre el 1 y 5");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un numero.");
                                scanner.nextInt();
                            }
                        }
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numeros entre el 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero.");
                scanner.nextInt();
            }
        }
    }
}
