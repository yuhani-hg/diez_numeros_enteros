package diez.numeros.enteros;
import java.util.Scanner;
public class DiezNumerosEnterosYArreglo {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int [] arreglo=new int [10];
        int law;
        for (law=0; law<=9; law++)
        {
            System.out.print ("Ingresa un numero: ");
            arreglo[law]=leer.nextInt();        }
        for (law=0; law<=9; law++)
        {
            System.out.println ("Los numeros son: "+arreglo[law]);
        }
    }
    
}
