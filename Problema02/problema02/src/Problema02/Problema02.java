/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problema02;

/**
 * Dadas las siguientes estructuras:
equipos <-- {
 "Barcelona", "Emelec", "Liga de Quito", "Independiente del Valle", "Delfin", "Macará", "Deportivo Cuenca", "Orense",
}
goles <-- {
 {1, 2, 2, 5}, {4, 1, 1, 4}, {8, 0, 1, 3}, {7, 1, 1, 2}, {6, 0, 1, 2}, {5, 2, 1, 1}, {4, 0, 3, 2}, {3, 1, 2, 1}, }
Donde;
Al equipo Barcelona le corresponden los puntos 1,2,2,5
Al equipo Emelec le corresponden los puntos 4,1,1,4
y así sucesivamente
En un método principal recorrer las estructuras; en cada iteración llamar a un procedimiento llamado presentarReporte que 
reciba 5 parámetros: una cadena y cuatro enteros.
El procedimiento debe presentar la siguiente información; en cada oportunidad que es llamado
Barcelona con puntos: 1,2,2,5 tiene un total de puntos de 10
 * @author LENOVO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    //No se importa el paquete por que la clase esta en el mismo paquete
    //se importa la clases.
    public static void main(String[] args) {
        // TODO code application logic here
        //se declara los arreglos con su valor en especifico 
        String[] equipos = {"Barcelona", "Emelec", "Liga de Quito",
            "Independiente del Valle", "Delfin", "Macara",
            "Deportivo Cuenca", "Orense"};
        int[][] goles = {{1, 2, 2, 5}, {4, 1, 1, 4},
        {8, 0, 1, 3}, {7, 1, 1, 2}, {6, 0, 1, 2},
        {5, 2, 1, 1}, {4, 0, 3, 2}, {3, 1, 2, 1},};
        for (int i = 0; i < goles.length; i++) {
            //Se llama a un procedimiento 
            //en el cual se genere el reporte 
            //se le envia los parametros 
            Reporte.presentarReporte(equipos[i], goles[i][0], goles[i][1], goles[i][2], goles[i][3]);

        }

    }

}
