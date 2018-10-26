
package añobisiesto;
import java.util.Scanner;

public class AñoBisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int a = sc.nextInt();
        if (a%4 ==0 && a%100 !=0 || a % 400 ==0){
            System.out.println("El año "+a+" es bisiesto.");
        }else{
            System.out.println("El año "+a+" no es bisiesto.");
        }                
    }    
}
