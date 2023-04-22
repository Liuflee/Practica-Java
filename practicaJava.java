import java.util.Scanner;

public class practicaJava {
    public static void main(String[] args) {

        while (true){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 120 &&  edad > 0){
            System.out.println(String.format("Hola %s tienes %d años.", nombre, edad));
            break;
        } else{
            System.out.println("Usted no deberia existir, intente de nuevo");
        }
        }
    }
}
