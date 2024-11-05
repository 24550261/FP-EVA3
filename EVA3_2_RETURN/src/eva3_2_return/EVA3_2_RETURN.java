/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_2_return;

/**
 *
 * @author Ivan
 */
public class EVA3_2_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //invocar o llamar al metodo
        //SI REGRESA RESULTADOS TENEMOS 2 OPCIONES
        //GUARADARLO U UARLO VARIAS VECES
        int valor;
        valor=sumarDosNumeros(100, 100);
        System.out.println("Resultado= "+valor);
        //USARLO UNA VEZ
        System.out.println("resultado= "+sumarDosNumeros(100, 100));
        //HACER ALGO CON EL VALOR
        //IGNORAR EL VALOR
    }
    public static int sumarDosNumeros (int n1, int n2){
        return n1+n2;
    }
}
