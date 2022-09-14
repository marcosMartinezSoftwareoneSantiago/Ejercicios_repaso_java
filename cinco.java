import java.util.Scanner;

/*
 * 5.- Crea un programa que pida un número por consola entre el 1 y el 50. Si el número está fuera de este rango imprimir "El número no es válido" y
 *  seguir pidiendo números hasta que el número esté en ese rango. Si el número es válido crea la lógica para verificar si dicho número es par o impar.
 *  Si es par imprimir por consola "Número par" y, si es impar, "Número impar".
 * 
 * La lógica para averiguar si el número es par o impar debe de estar fuera del archivo que contiene el método main en una carpeta llamada "utils"
 *  y en una clase llamada EjercicioCinco Además esta lógica debe estar ejecutada a través de un método.
 */
public class cinco {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numero;
        do{
        System.out.println("Introduce un número entre el 1 y el 50");
        numero = myScanner.nextInt();
        if(numero<1 || numero >50)
            System.out.println("El número no es válido");
        }while(numero<1 || numero >50);
        if(utils.EjercicioCinco.esPaR(numero)){
            System.out.println("Número par");
        }else{
            System.out.println("Número impar");
        }
        myScanner.close();
    }
}
