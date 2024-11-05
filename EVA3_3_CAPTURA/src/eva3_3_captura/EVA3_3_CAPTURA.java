/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String Nombre= capturarCadena("Introduzca su Nombre");
       String Apellido= capturarCadena("Introduzca su Apellido");
       int edad= tomaEdad(0);
       int sal=tomaSalario(0);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(Nombre);
        System.out.println(Apellido);
        System.out.println(edad);
        System.out.println(sal);
    }
    
    public static String capturarCadena(String mensaje){
        Scanner cap = new Scanner(System.in);
        String Dt;
        System.out.println(mensaje);
        Dt=cap.nextLine();
        return Dt;
    }
    
    public static int tomaEdad(int E){
        Scanner cap = new Scanner(System.in);
        
        int Dt;
        System.out.println("Ingrese su edad");
        Dt=cap.nextInt();
        return Dt;
    }
    public static int tomaSalario(int s){
        Scanner cap = new Scanner(System.in);
        
        int Dt;
        System.out.println("Ingrese su edad");
        Dt=cap.nextInt();
        return Dt;
    }
    
    
}
