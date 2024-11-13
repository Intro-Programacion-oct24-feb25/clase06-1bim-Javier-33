/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    
    public static void main(String[] args) {
        String pais;
        
        pais = "Ecuador";
        //      0123456
        //se cuenta desde 0
        //.charAt nos muestra la letra que queremos ver
        char letra = pais.charAt(3);
        System.out.printf("%s\n", letra);
        
    }
}
