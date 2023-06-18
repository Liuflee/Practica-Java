
import java.util.InputMismatchException;
import java.util.Scanner;

public class javaCopy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lado1 = 0, lado2 = 0, lado3 = 0;
        try{
            System.out.print("Introduce el lado 1: ");
            lado1 = scanner.nextInt();
            System.out.print("Introduce el lado 2: ");
            lado2 = scanner.nextInt();
            System.out.print("Introduce el lado 3: ");
            lado3 = scanner.nextInt();

        } catch(InputMismatchException e){
            System.out.println("Debes ingresar numeros enteros");
            return;
        }

        if (lado1 < 0 || lado2 < 0 || lado3 < 0) {
            System.out.println("Los lados deben ser positivos");
        } else if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
                System.out.println("El triangulo es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
                System.out.println("El triangulo es Isosceles");
            } else {
                System.out.println("El triangulo es escaleno");
            }
        } else {
            System.out.println("No se puede formar un triangulo");
        }
        System.out.println("Fin del programa");
}
}
