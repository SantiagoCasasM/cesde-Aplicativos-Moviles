/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jarepasojava1;

/**
 *
 * @author 108
 */
public class JCrepasoJAVA4 {
    public static void main(String[] args) {
        
        int estrato = 1;
        int bono;
        switch (estrato) {
            case 1:
                bono = 50000;
                break;
            case 2:
                bono = 30000;
                break;    
            case 3:
                bono = 20000;
                break;
            case 4:
                bono = 10000;
                break;   
            default:
                bono = 0;
                break;
        }
        System.out.println("El valor del bono es: "+bono);
    }
}
