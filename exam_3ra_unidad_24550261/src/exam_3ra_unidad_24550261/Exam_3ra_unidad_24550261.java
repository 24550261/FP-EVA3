/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exam_3ra_unidad_24550261;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Exam_3ra_unidad_24550261 {
public static Scanner cap = new Scanner(System.in);
public static int num_est;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double prom;
        System.out.println("Buen día profesor :)");
        System.out.println("    ");
        double[] califas=new double [pedirNumeroDeEstudiantes("Ingrese su numero de estudiantes:")];
        pedirCalifas(califas);
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("        ");
        prom=calcularPromedio(califas);
        System.out.println("        ");
        System.out.println("El promedio de calificacion es: "+prom+" puntos");
        System.out.println("        ");
        System.out.println("El numero de calificaciones mayores o iguales al promedio son: "+calcularCalifasMayoresOIguales(prom, califas));
        System.out.println("        ");
        System.out.println("La calificacion mas alta fue: "+calcularCalificacionMasAlta(califas));
        System.out.println("        ");
        System.out.println("La calificacion mas baja fue: "+calcularCalificacionMasBaja(califas));
        System.out.println("        ");
        
          
    }
    
    
    
    
    public static int pedirNumeroDeEstudiantes(String mensaje){
       int cont=0;
        do{
        System.out.print(mensaje);
        num_est=cap.nextInt();
        cap.nextLine();
        if(num_est<=0){
            System.out.println("Ingrese un numero valido de estudiantes (SUPERIOR A 0)");
        cont=1;
        }else{
            return num_est;
          
        }
}while(cont!=0);
        return num_est;
    }
    
    
    
    
    
    
    
    
    
    public static void pedirCalifas(double []num){
        double califa;
        int cont=0;
      
        for (int i = 0; i < num.length; i++) {
            do{
            System.out.println("Ingrese la calificacion del alumno numero: "+(i+1));
            califa=cap.nextInt();
           if(califa>=0&&califa<=101){
            num[i]=califa;
            cont=0;
        }else{
               System.out.println("Ingrese una calificacion valida (DEL 0 AL 100)");
               cont=1;
           }
 }while(cont!=0);
    }
              
   
    
    
}
    
     public static double calcularPromedio(double[]num){
         double acum=0;
          double prom;
         
         for (int i = 0; i <num.length; i++) {
             acum+=num[i];
         }
         prom=acum/num.length;
         return prom;
    }
     
     
     public static int calcularCalifasMayoresOIguales(double prom,double[]num){
         int cont=0;
         for (int i = 0; i < num.length; i++) {
             if(num[i]>=prom){
                 cont=cont+1;
             }
         }
         
         return cont;
     }
     
     
     
     
     public static double calcularCalificacionMasAlta(double[]num){
         double acumfan;
         acumfan=num[0];
         for (int i = 0; i < num.length; i++) {
             if(acumfan<=num[i]){
                 acumfan=num[i];
                 
             }
         }
         return acumfan;
     }
     
     public static double calcularCalificacionMasBaja(double[]num){
         double acumfan;
         acumfan=num[0];
         for (int i = 0; i < num.length; i++) {
             if(acumfan>=num[i]){
                 acumfan=num[i];
                 
             }
         }
         return acumfan;
     }
     
}