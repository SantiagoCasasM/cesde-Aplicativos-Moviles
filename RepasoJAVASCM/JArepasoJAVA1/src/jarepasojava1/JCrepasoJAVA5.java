/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarepasojava1;

/**
 *
 * @author 108
 */
public class JCrepasoJAVA5 {
    public static void main(String[] args) {
        
        //arrays
        char arraycontable[];
        arraycontable = new char[10];
        arraycontable[0] = 'a';
        arraycontable[1] = 'b';
        arraycontable[2] = 'c';
        
        String arraynombres[];
        arraynombres = new String[5];
        arraynombres[0] = "Santiago";
        arraynombres[1] = "Santiag";
        arraynombres[2] = "Santia";
        
        for (int x = 0; x < arraynombres.length; x++) {
            if (arraynombres[x] !=null) {
                System.out.println(arraynombres[x]);
            }
        }
    }
}
