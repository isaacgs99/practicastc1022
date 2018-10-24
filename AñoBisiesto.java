
package añobisiesto;

import java.util.Scanner;


public class AñoBisiesto {

   
    public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
         
          System.out.println("Inserta un año");
        int n = lector.nextInt();
        
       if((n%4==0)&&(n%400==0)&&(n%100==0)||(n%4==0)&&(n%400==0)||((n%4==0)&&(n%100!=0))){
           System.out.println("Tu año " + n +" es bisiesto");
       } else{
           System.out.println("Tu año " + n +" no es bisiesto");
       }
    }
    
}
