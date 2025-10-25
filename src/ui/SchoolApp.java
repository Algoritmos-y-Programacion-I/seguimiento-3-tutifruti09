package ui;

import java.util.Scanner;
import java.time.LocalDate;
import model.SchoolController;

public class SchoolApp {

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para conectar esta clase con el
     * modelo.
     */

    private Scanner input;
    private SchoolController schoolController;

    public static void main(String[] args) {

        SchoolApp ui = new SchoolApp();
        ui.menu();

    }

    // Constructor
    public SchoolApp() {
        input = new Scanner(System.in);


       System.out.println("Ingrese el nombre de la institucion: ");
         String name = input.nextLine();

         schoolController = new SchoolController (name);
         System.out.println("La institucion " + name + " ha sido creada exitosamente.");
         System.out.println("Pisos" + schoolController.getFLOORS() + "Columanas: " + schoolController.getCOL());


    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue la logica necesaria (instrucciones) para satisfacer los
     * requerimientos
     */

    public void menu() {

        System.out.println("Bienvenido a Computaricemos");

        int option = -1;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("--------------------------------------------------------");
            System.out.println("Digite alguna de las siguientes opciones");
            System.out.println("1) Registrar computador");
            System.out.println("2) Registrar incidente en computador");
            System.out.println("3) Consultar el computador con más incidentes");
            System.out.println("0) Salir del sistema");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    registrarComputador();
                    break;
                case 2:
                    registrarIncidenteEnComputador();
                    break;
                case 3:
                    consultarComputadorConMasIncidentes();
                    break;
                case 0:
                    System.out.println("\nGracias por usar nuestros servicios. Adios!");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente nuevamente.");
                    break;
            }

        } while (option != 0);

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Agregue la logica necesaria (instrucciones) para satisfacer los
     * requerimientos
     */

    public void registrarComputador() {
        System.out.println("Registrar Computador");
        System.out.println("Ingrese el numero serial del computador:");
        String serial = input.nextLine();

        System.out.println("Ingrese el piso donde se ubicara el computador (0 - " + (schoolController.getFLOORS ()- 1) + "): ");
        int floor = input.nextInt();
        input.nextLine(); 

        String resulatado_final = (schoolController.agregarComputador(serial, floor));
        System.out.println(resulatado_final);

    }

    public void registrarIncidenteEnComputador() {

        System.out.println("Registrar Incidente en Computador");
        System.out.println("Ingrese el numero serial del computador:");
        String serial = input.nextLine();

        System.out.println("Ingrese la descripcion del incidente:");
        String description = input.nextLine();

        LocalDate dateReport = LocalDate.now();

        String resulatado_final = (schoolController.agregarIncidenteEnComputador(serial, 0, 0, description, dateReport));
        System.out.println(resulatado_final);


    }

    public void consultarComputadorConMasIncidentes() {
        System.out.println("Consultar Computador con Mas Incidentes");
        String resultado_final = schoolController.getComputerList();
        System.out.println(resultado_final);

    }

}
