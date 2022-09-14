import java.util.Scanner;

/*
 * 4.- Crea un programa en java que pida introducir un número por consola. El programa pedirá siempre un número mientras que éste no sea el 5 y cuando así sea imprimir "Fin del programa"
terminando asi dicho programa
 */
public class catro {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        int numero;
        do{
        System.out.println("Introduce un número");
        numero = myScanner.nextInt();
        }while(numero !=5);
            System.out.println("Fin del programa");
        myScanner.close();
    }
}
