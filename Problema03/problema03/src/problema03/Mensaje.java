/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author LENOVO
 */
public class Mensaje {
           // el metodo main no lo ocupo por que puede ocupar espacio solo estoy utulizando esta 
           // clase para llamar funciones
           // y sirve como las funciones pero ya tengo dos funciones entonces el metodo mein
    public static String obtenerMensaje(String[] meses, int[] ventaNumeroTelevisores, int[] ventaNumeroCelulares) {
        //Aacumulamos los valores en la cade acumuladora 
        //se asigna el primer mensaje del reporte con un salto de linea
        String cadenaAcumuladora = "El reporte del meses es:\n";
          //se genera el ciclo repetitivo para recorrer el arreglo
        for (int i = 0; i < ventaNumeroCelulares.length; i++) {
            //Se comprueva que los numero dentro del arreglo venta numero celulares
            //sean menores o iguales a 35
            if (ventaNumeroCelulares[i] <= 35) {
                //si se cumple la condicion se acumula los datos  
                cadenaAcumuladora = String.format("%s%s: televisor %d - celulares %d\n",
                        cadenaAcumuladora,
                        meses[i],
                        ventaNumeroTelevisores[i],
                        ventaNumeroCelulares[i]);

            }

        }
        //y se retorna el mensaje
        return cadenaAcumuladora;

    }
}
