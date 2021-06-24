/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.controlador.ControladorJefe;
import ec.edu.ups.modelo.Jefe;
import java.util.Scanner;

/**
 *
 * @author surfa
 */
public class VistaJefe {
     
    private ControladorJefe contraladorjefe;
    Scanner scanner=new Scanner(System.in);

    public VistaJefe(ControladorJefe contraladorjefe) {
        this.contraladorjefe = contraladorjefe;
    }

    public void crear(){
        System.out.println(" Ingrese el codigo:");
        int codigo=scanner.nextInt();
        System.out.println("Ingrese el nombre:");
        String nombre=scanner.next();
        System.out.println("Ingrese la direccion:");
        String direccion=scanner.next();
        System.out.println("Ingrese la telefono: ");
        String telefono=scanner.next();
        contraladorjefe.crear(codigo, nombre, direccion, telefono);
        System.out.println("-------Creado------------");
        
    }
    public VistaFigura buscar(){
         System.out.println("Ingrese el codigo");
        int codigo=scanner.nextInt();
        if (contraladorjefe.buscar(codigo)!= null){
            System.out.println(contraladorjefe.buscar(codigo).toString());
        }else{
            System.out.println("el jefe no existe ");
        } 
        return null;  
    }
    public void modificar(){
       System.out.println("Ingrese el codigo del jefe  a modificar");
        int codigo=scanner.nextInt();
        if(contraladorjefe.buscar(codigo)!=null){
            System.out.println("----Ingrese los nuevo Datos----");
            System.out.println("Ingrese el nuevo nombre");
            String nombre=scanner.next();
            System.out.println("Ingrese la nueva direccion:");
            String direccion=scanner.next();
            System.out.println("Ingrese el nuevo telefono");
            String telefono=scanner.next();
            contraladorjefe.modificar(codigo, nombre, direccion, telefono);
            System.out.println("jefe modificada");
        }else{
            System.out.println("jefe no existe");
        }
    }  
    
    public void Eliminar(){
       System.out.println("Ingrese el codigo del jefe a eliminar:");
        int codigo=scanner.nextInt();
       if (contraladorjefe.buscar(codigo)!=null){
            contraladorjefe.eliminar(codigo);
            System.out.println("jefe eliminado");
        } else {
            System.out.println("el jefe no existente");
        } 
    }
    public void listar(){
         contraladorjefe.findAll().stream().forEach(object -> System.out.println(object));
    }
}
