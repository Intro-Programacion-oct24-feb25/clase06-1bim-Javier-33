/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
//Existe una modificacion en el proceso de la problematica el porcentaje del
//descuento del seguro sera ingresado por teclado. Considerar los valores 
//posibles a ingresar son: entre 1 y 15. Si la persona ingresa un valor fuera de 
//este rango el valor del porcentaje va a ser 10.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ComercioTres {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro = 0;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();        
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        System.out.println("Ingrese el porcentaje del seguro por favor");
        porcentajeSeguro = entrada.nextInt();
        
        
        // opción 1 (yo elegiria mi opcion, opcion1)
        //funciona ya que sea el valor que sea, cumple y nos da el nuevo valor
        //de porcentajeSeguro
        if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            porcentajeSeguro = porcentajeSeguro + 0;
        } else {
            porcentajeSeguro = 10;
        }

        // opción 2
        //funciona, pero si damos un valor menor a 15, cambia su variable y
        //no es lo que se pide
        if (porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }

         // opción 3
         //funciona ya que si damos un valor dentro del rango de 1 y 15 nos
         //proporciona ese valor, mientras que si damos un valor fuera de ese
         //rango nos da 10
        if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }

        // opción 4
        //funciona, pero al utilizar el &&, se convierte en falso cuando no 
        //cumplimos con una de las variables, por lo tanto en algunos valores
        //da 10, y no es lo que queremos
        if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
            porcentajeSeguro = 10;
        }
        
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
        
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>=31 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
        
       
        adicionalSeguro = (sueldoBasico * porcentajeSeguro)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    
}
