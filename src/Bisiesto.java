/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOSE JAVIER
 */
public class Bisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner ingreso = new Scanner(System.in);
    int numero;
   
    System.out.print("Ingresa un año: ");
    numero = ingreso.nextInt();
   
    if(numero % 4 == 0){
      System.out.println("Es bisiesto");
    }
    else{
      System.out.println("No es bisiesto");
    }
    }
    
}
