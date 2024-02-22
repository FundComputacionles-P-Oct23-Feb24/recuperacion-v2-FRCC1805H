/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import problema04.Multiplicacion;
/**
 *Utilizando una estructura repetitiva diseñe solución para calcular la suma e imprima los términos de la serie:
(1*2)/7
(2*4)/14
(3*6)/21
(4*8)/28
(5*10)/35
(6*12)/42
Debe usar adicional del procedimiento principal, un función como minimo.
 * @author LENOVO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    //no se import apor que estan dentro del mismo paquete 
    //solo se llama a la funcion que esta en el mismo paquete 
    //pero diferente clase
    public static void main(String[] args) {
        // TODO code application logic here
        //se declaran las variables 
        int num = 2;
        int div = 7;
        int [] serie = new int [7];
        int [] divicion = new int [7];
        for (int i = 1; i < serie.length; i++) { 
        //Se genera un ciclo repetitivo en cada uno y  guardar 
        // el resultado de cada multiplicacion 
            serie[i]= Multiplicacion.calcularMultiplicacion(i,num);
            //en esta serio solo multiplicamos 
            //y la divicion solo es para obtener sus datos y guardalos 
            divicion[i]= Multiplicacion.calcularMultiplicacion(i,div);
        }
        for (int i = 1; i < serie.length; i++) {
            //generamos otro ciclo repetitivo que recorar la serie
            //y coneste mismo presentar el mensaje de la serio obtenida 
            System.out.printf ("(%d*%d)/%d\n",i,serie[i],divicion[i]);
        }
    }
    
}
