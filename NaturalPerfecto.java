package naturalperfecto;

import java.util.Scanner;

public class NaturalPerfecto {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int sum = 0;

        System.out.println("Inserta un entero");
        int num = lector.nextInt(); //entero

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("Es un natural perfecto");

        } else if (sum != num) {
            System.out.println("NO es un natural perfecto");

        }

    }
}
