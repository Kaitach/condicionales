
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String  nombre, apellido;
        int edad;

        System.out.println("Ingresa tu nombre");
        nombre = teclado.nextLine();

        System.out.println("Ingresa tu apellido");
        apellido = teclado.nextLine();       

        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();

       

        if (edad >= 18) {
            System.out.println(
                    nombre + " " + apellido + " usted es mayor de edad, por lo tanto puede entrar a la fiesta.");
        }
        else {
            System.out.println(
                    nombre + " " + apellido + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
       }
      

       
    }

