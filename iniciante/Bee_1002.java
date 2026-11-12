import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bee_1002 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double area = Math.pow(sc.nextDouble(), 2) * 3.14159;
        System.out.printf("A=%.4f\n", area);
    }
}