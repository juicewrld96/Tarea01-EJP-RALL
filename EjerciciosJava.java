import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class EjerciciosJava {
   static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Definir variables
        int edad;
        String mensaje;
        //Datos de entrada18
        System.out.println("ingrese la edad;");
        edad=lt.nextInt();
        //Proceso
        if (edad>=18) {
            mensaje="Puede votar por que su edad es "+edad;
        } else {
            mensaje="No puede votar por que su edad es "+edad;
            
        }
        //Datos de salida 
        System.out.println(mensaje);
    }

        


        
    
}