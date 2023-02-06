/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasesyfunciones;
import java.util.*;
/**
 *
 * @author 108
 */
public class jCRepaso1 {
    
     public static void main(String[] args){
     
         Scanner numero1 = new Scanner(System.in);
         System.out.println("Escriba el numero que quiere multiplicar: ");
         int numero;
         numero = numero1.nextInt();
         Scanner entj = new Scanner(System.in);
         System.out.println("Escriba el numero hasta donde quiere que llegue la tabla de multiplicar: ");
         int j;
         j = entj.nextInt();
         
         if (numero < j) {
            System.out.println("Tabla de multiplicar de: "+ numero);
            for (numero = numero; numero <= j; numero++) {
             for (int i = 1; i <= 11; i++) {
             System.out.println(numero+" * "+ i +" = "+ numero * i);
            }
         } 
         }
         System.out.println("No pudo realizarse, el numero inicial debe ser mayor al final");
         
         
     }
    
}
