import java.util.Scanner;

/*
 * 2.- Crea una estructura condicional que evalúe si una edad introducida por consola es mayor o igual a 18,
 *  si es así, imprimir por la consola: "Eres  mayor de edad" caso contrario imprimir "eres menor de edad".
 */
public class dous {
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in);
        int edad ;
        System.out.println("Introduce tu edad");
        edad = myScanner.nextInt();
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
        myScanner.close();
    }
}
