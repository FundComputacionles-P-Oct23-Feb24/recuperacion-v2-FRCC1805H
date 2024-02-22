/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import problema03.Mensaje;

/**
 * Datos los siguiente arreglos: meses <-- {"Enero", "Febrero", "Marzo",
 * "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre",
 * "Noviembre", "Diciembre"} ventaNumeroTelevisores <-- {100, 130, 150, 200,
 * 100, 190, 200, 200, 300, 100, 400, 1000} ventaNumeroCelulares <-- {20, 30,
 * 22, 50, 100, 35, 90, 80, 10, 40, 50, 60} Generar una solución que permita
 * presentar el siguiente reporte: El reporte de meses es: Enero: televisores
 * 100 - celulares 20 Febrero: televisores 130 - celulares 30 Marzo: televisores
 * 150 - celulares 22 Junio: televisores 190 - celulares 35 Septiembre:
 * televisores 300 - celulares 10 
 * Use un ciclo repetitivo;atención solo se presentan los registros siempre
 * y cuando el número de celulares sea menor o
 * igual a 35; la cadena que se presenta, se la debe obtener a través de una
 * función que reciba tres parámetros: mes, número de televisores y número de
 * celulares.
 *
 * @author LENOVO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    //no se import apor que estan dentro del mismo paquete 
    //solo se llama a la funcion que esta en el mismo paquete 
    //pero diferente clase
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
            "Diciembre"};
        int[] ventaNumeroTelevisores = {100, 130, 150, 200,
            100, 190, 200, 200, 300, 100, 400, 1000};
        int[] ventaNumeroCelulares = {20, 30, 22, 50, 100, 35, 90, 80, 10, 40, 50, 60};
        String cadenaAcumuladora;
        //enviamos los parametros a la funcion
        cadenaAcumuladora = Mensaje.obtenerMensaje(meses, ventaNumeroTelevisores, ventaNumeroCelulares);
        //Se presenta el valor valor obtenido de la funcion 
        System.out.println(cadenaAcumuladora);
    }

}
