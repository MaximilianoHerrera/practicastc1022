
package númeroperfecto;
import java.util.Scanner;

public class NúmeroPerfecto {


    public static void main(String[] args) {
       int i, suma = 0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        n = sc.nextInt();
        for (i = 1; i < n; i++) {  
            if (n % i == 0) {
                suma = suma + i;    
            }
        }
        if (suma == n) {  
            System.out.println("El número "+n+" es un número perfecto");
        } else {
            System.out.println("El número "+n+" no es un número perfecto");

        }
    }
    
}
