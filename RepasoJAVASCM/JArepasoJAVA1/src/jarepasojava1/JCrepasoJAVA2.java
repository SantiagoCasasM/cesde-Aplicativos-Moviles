/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarepasojava1;
import java.util.*;
        
/**
 *
 * @author 108
 */
public class JCrepasoJAVA2 {
     public static void main(String[] args) {
         
    Scanner numerolite1 = new Scanner(System.in);
    System.out.println("¿Que limite quiere para el fibonacci?: ");
    int nrolimite;
    nrolimite = numerolite1.nextInt();
    int nro1 = 0;
    int nro2 = 1;
    int suma = 0;

   while (nro1 <= nrolimite) {
      System.out.print(nro1 + " + ");
      suma = nro1 + nro2;
      nro1 = nro2;
      nro2 = suma;
     }
   
     }
}
