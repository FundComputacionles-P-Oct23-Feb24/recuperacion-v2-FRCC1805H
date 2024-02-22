/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import problema02.CalcularLibras;
import problema02.TotalApagar;

/**
 *
 * @author LENOVO
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se importa el paquete llamado promela02 que contiene 
        //las clases con la funciones que se va a utilizar
        //Creamos una entrada .nextLine que el nombres es n y el valor ingresa el usuario
        Scanner entrada = new Scanner(System.in);
        String cadenaAcumuladora = "Pescaderia de la Ciudad\n" ;
        System.out.println("Cuantos pescadores desea ingresar");
        //presenta en pantalla mensajes o texto
        //el usuario ingresa el limite del arreglo 
        //n es el numero de elementos que sera utilizado en cada uno de los arreglos
        int n = entrada.nextInt();
        //creamos arreglos unidimencionales con nombres segun el tipo del problema
        double costo1[] = new double[n];
        double costo2[] = new double[n];
        double total[] = new double[n];
        double camaron [] = new double [n];
        double bacalao [] = new double [n];
        String nombre [] = new String [n];
        //limpieza de buffer 
        //despues de pedir un dato tipo decimal o entero 
        //no permite ingresar un dato tipo cadena , lo ignora
        entrada.nextLine();
        //Se crea un ciclo repetitivo para recorrer los arreglos 
        //el limite de cada arreglo el usuario ya lo ingreso , el valor es n 
        for (int i = 0; i < n; i++) {
            //se piden los datos y se guarda en cada arreglo 
            System.out.println("Ingrese el nombre y apellido del pescador");
            nombre[i] = entrada.nextLine();
            System.out.println("Ingrese el numero de libras de camaron que va acomprar ");
            camaron[i] = entrada.nextDouble();
            System.out.println("Ingrese el numero de libras de bacalao que va acomprar");
            bacalao[i] = entrada.nextDouble();
            //limpieza de buffer 
            //despues de pedir un dato tipo decimal o entero 
            //no permite ingresar un dato tipo cadena , lo ignora
            entrada.nextLine();
            //Llamos a las funciones para calcular su costo 
            //y enviamos los parametros de cada arreglo con la poscion que seria i
            costo1[i] = CalcularLibras.calcularCamaron(camaron[i]);
            costo2[i] = CalcularLibras.calcularBacalao(bacalao[i]);
            
        }
        
        for (int i = 0; i < n; i++) {
            //llamamos ua funcion para sumarlos y saber el costo total 
            //y enviamos los parametros
            total[i] = TotalApagar.calcularTotal(costo1[i], costo2[i]);
        }
        for (int i = 0; i < n; i++) {
           //usando el ciclo repetitivo se acumula el texto en la cadena acumuladora
            cadenaAcumuladora = String.format("%sPescador: %s\nLibras de camaron: "
                    + "%.0f - costo $%.1f\nLibras de bacalao: %.0f - costo $%.1f"
                    + "\nTotal a pagar al pescador: $%.1f\n",
                    cadenaAcumuladora,
                    nombre[i],
                    camaron[i],
                    costo1[i],
                    bacalao[i],
                    costo2[i],
                    total[i]);
             
        }
        //se presenta la cadena acumuladora .
         System.out.println(cadenaAcumuladora);   
    }
}
    
