import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String opcion;

        do{
            System.out.println("================================");
            System.out.println("Ingrese una opcion:");
            System.out.println("[1] Menu 1");
            System.out.println("[2] Menu 2");
            System.out.println("[3] Menu 3");
            System.out.println("[0] Salir");

            opcion = scan.next();

                switch (opcion){
                    case "1":
                        System.out.println("================================");
                        System.out.println("Menu 1: ");

                        break;

                    case "2":
                        System.out.println("================================");
                        System.out.println("Menu 2: ");

                        break;

                    case "3":
                        System.out.println("================================");
                        System.out.println("Menu 3: ");

                        break;

                    case "0":
                        System.out.println("================================");
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("================================");
                        System.out.println("error");
                        break;
                }

        }while(!opcion.equals("0"));
    }
}

