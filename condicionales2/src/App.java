
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String peliculaAlquilar, estado, incidente;
        int pelicula;

        System.out.println("Bienvenido quiere alquilar una pelicula? 'si/no ");
        peliculaAlquilar = teclado.nextLine();

        if (peliculaAlquilar.equals("si")) {
            System.out.println(
                    "Que pelicula desea alquilar 1: One Piece film red 2: Dragon ball super la batalla de los dioses, 3:¿que paso ayer 3?");
            pelicula = teclado.nextInt();
            if (pelicula == 1) {
                System.out.println(
                        "usted acaba de alquilar: One Piece film red ");
                        
              
                  

            } else if (pelicula == 2) {
                System.out.println(
                        "usted acaba de alquilar:  Dragon ball super la batalla");
            } else if (pelicula == 3) {
                System.out.println(
                        "usted acaba de alquilar: ¿Que paso ayer 3?");
            }

        } else {
            System.out.println(
                "Tiene algo que reportar?");
                  estado = teclado.nextLine();
                  if (estado.equals("si")) {
                      System.out.println(
                              "Detalla lo ocurrido");
                      incidente = teclado.nextLine();
                      if (incidente != null) {
                          System.out.println(
                                  "Reporte enviado");
                      }

                  }
                  else {
                    System.out.println(
                    "Gracias por su visita a nuestra tienda");
                }
        }
    }
}
