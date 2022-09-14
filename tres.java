import java.util.Scanner;

/*
 * 3.- Crea un programa en java que pida dos datos por la consola al usuario: nombre e email. Imprime el valor de estás variables por consola.
 */
public class tres {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        String nombre = new String();
        String email = new String();
        System.out.println("Introduce tu nombre");
        nombre = myScanner.nextLine();
        System.out.println("Introduce tu email");
        email = myScanner.nextLine();
        System.out.println(nombre +": " + email);
        myScanner.close();
    }
}
