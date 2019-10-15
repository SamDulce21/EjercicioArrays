/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public final class Operaciones1 {
    //Samuel Dulce
    public int[] arreglo = new int[20];
    public int opcion;
    Scanner operaciones1 = new Scanner (System.in);
    //constructor
    public Operaciones1(){
       this.mostrarMenu();
    
    }
    //Muestra el menú en pantalla
    public void mostrarMenu(){
        System.out.println("Escoja Opción\n"
                + "1-Llenar Arrays\n"
                + "2-Escribir Arrays\n"
                + "3-Sumatoria\n"
                + "4-Productoria\n"
                + "5-Tamaño\n"
                + "6-Salir");
        
        
        opcion = operaciones1.nextInt();
        this.cargarOpcion(opcion);
        
    }            
    //Leer arreglo
    public void leerArreglo(){
        System.out.println("Digite los números");
        for (int i = 0; i<10; i++){
        arreglo[i] = operaciones1.nextInt();
        }
    }
    //Escribe el Arreglo
    public void escribirArreglo(){
        System.out.println("Escogió escribir arreglo");
        this.mostrarMenu();
    }
    //Genera sumatoria
    public void sumatoria(){
    int sumatoria = 0;
    
    for (int i = 0; i<10; i++){
    sumatoria = sumatoria + arreglo[1];
      
    }
    
    }
    //Genera productoria
    public void Productoria(){
        int productoria = 0;
        for (int i = 0; i<10; i++){
        productoria = productoria* arreglo[i];
        }
        System.out.println("La productoria es "+productoria);
        this.mostrarMenu();
    }
    public void cargarOpcion(int op){
        switch (op){
            case 1: this.leerArreglo(); break;
            case 2: this.escribirArreglo(); break;
            case 3: this.sumatoria(); break;
            case 4: this.Productoria(); break;
            case 5: System.out.println(this.arreglo.length); break;
            case 6: System.out.println("Usted ah salido");break;
            default: System.out.println("ERROR, POR FAVOR VERIFIQUE SU OPCION");
            
            
            
           //System.out.println("Usted ah escogido la opción: "+opcion); 
        }   
        
        
    }
   
}


