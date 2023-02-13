/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jarepasojava1;
import java.util.*;

public class JArepasoJAVA1 {

    
    public static void main(String[] args) {
        // Generar una app para listar n primeros numeros 
        // Para la serie fibonazi
        
        Scanner numerolite1 = new Scanner(System.in);
        System.out.println("¿Que limite quiere para el fibonacci?: ");
        int nrolimite;
        nrolimite = numerolite1.nextInt();
        int nro1 = 0;
        int nro2 = 1;
        int suma = 0;
        
        // Si i valiera 1 toca ponerle -2
        for (int i = 3; i < nrolimite; i++) {
            suma = nro1 + nro2;
            System.out.println("Esta es la suma: "+ suma);
            nro1 = nro2;
            nro2 = suma;
            System.out.println("Esta es la secuencia: "+ nro2);
        }
        
    }
    
}
