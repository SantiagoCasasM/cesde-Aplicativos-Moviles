/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarepasojava1;

/**
 *
 * @author 108
 */
public class JCrepasoJAVA3 {
     public static void main(String[] args) {
         
 /*     boolean estado;
        estado = false;
        
         if (estado == true) {
             System.out.println("Esta activo");
         }else
             System.out.println("Esta inactivo");
     
*/      // OPERADORES TERNARIOS "!"activo es decir: NOACTIVO
/*      boolean estado;
        estado = false;
        System.out.println(estado?" Esta activo":" Esta inactivo");
*/
        boolean estado;
        estado = false;
        
        int subsidio = estado?2000000:0;
         System.out.println("El valor del subsidio es: "+subsidio);
         String destino1 = "Cancun";
         String destino2 = "Coveñas";
         String destino3 = "Miami";
         System.out.println(estado && subsidio >200000?destino1:subsidio==0?destino3:destino2);
    }
}


