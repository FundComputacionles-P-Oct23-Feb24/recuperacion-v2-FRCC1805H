/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema02;

/**
 *Al equipo Barcelona le corresponden los puntos 1,2,2,5
Al equipo Emelec le corresponden los puntos 4,1,1,4
y así sucesivamente
En un método principal recorrer las estructuras; en cada iteración llamar a un procedimiento llamado presentarReporte que 
reciba 5 parámetros: una cadena y cuatro enteros.
El procedimiento debe presentar la siguiente información; en cada oportunidad que es llamado
Barcelona con puntos: 1,2,2,5 tiene un total de puntos de 10
 * @author LENOVO
 */
public class Reporte {
    // el metodo main no lo ocupo por que puede ocupar espacio solo estoy utulizando esta 
    // clase para llamar funciones
    // y sirve como las funciones pero ya tengo dos funciones entonces el metodo mein
    public static void presentarReporte(String eq, int n1, int n2, int n3, int n4) {
       int suma = n1 + n2 + n3 + n4;
       //realizamos la suma 
       //y la presentamos ultima para saber los puntos de cada equipo
        System.out.printf("%s con puntos: %d,%d,%d,%d tiene un total de puntos de %d\n",
                          eq,n1,n2,n3,n4,suma);
    }

}
