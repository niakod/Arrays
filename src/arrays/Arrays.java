/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author MaR
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a1;
        a1 = new int[3];
        a1[0] = 10;
        a1[1] = 15;
        a1[2] = 20;
        //Mostramos en pantalla el tamaño del array a1:
        System.out.println("El tamaño del array a1 es: "+a1.length);
        int suma = 0; //almacenará la suma de los elementos del array
        for (int i = 0; i < a1.length; i++){
            suma += a1[i]; //sumamos el elemento del indice i actual en cada ciclo
        }
        System.out.println("La suma de los elementos del array a1 es: "+suma);
        
        String[] colores = {"Rojo","Verde","Amarillo"};
        //Lo anterior es igual a declararlo y asignar los valores de esta forma:
        String[] c2 = new String[3];
        c2[0] = "Rojo";
        c2[1] = "Verde";
        c2[2] = "Amarillo";
        //Vamos a recorrer el array colores y mostrar sus valores:
        for(String c:colores){
            System.out.println(c);
        }
    }
    
}
