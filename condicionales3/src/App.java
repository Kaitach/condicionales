
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);      
        int opcion;
        System.out.println(
                "Bienvenido a la drogueria de la localidad de Suba. Usted quiere comprar nuestros productos digite 1, por devoluciones digite 2, para ver los precios digite 3  ");
        opcion = teclado.nextInt();
        if (opcion == 1) {
            System.out.println(
                    "Digite el numero de producto a comprar 1: pomada antiage, 2: tinta para cabello, 3: lapiz labial ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println(
                        "usted acaba de comprar: pomada antiage ");

            } else if (opcion == 2) {
                System.out.println(
                        "usted acaba de comprar: tinta para cabello ");
            } else if (opcion == 3) {
                System.out.println(
                        "usted acaba de comprar: lapiz labial ");
            } else {
                System.out.println("Seleccion no valida ");
            }
            ;
        }
        else if (opcion == 2) {
            System.out.println(
                    "Digite el numero del articulo a devolver 1: pomada antiage, 2: tinta para cabello, 3: lapiz labial ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                System.out.println(
                        "usted acaba de devolver: pomada antiage  discuple las molestias ");

            } else if (opcion == 2) {
                System.out.println(
                        "usted acaba de devolver: tinta para cabello discuple las molestias  ");
            } else if (opcion == 3) {
                System.out.println(
                        "usted acaba de devolver: lapiz labial discuple las molestias  ");
            } else {
                System.out.println("Seleccion no valida ");
            }            
        }
        else if (opcion == 3) {
            System.out.println(
                    "Precios 1: pomada antiage USD10, 2: tinta para cabello USD20, 3: lapiz labial USD 5 ");

        }
        }
}