import java.util.Scanner;
import java.util.Stack;
public class menu {
    public static void main(String[] args) {
        metodos met = new metodos();
        Stack<libro> libros = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Registrar libro");
            System.out.println("2. Eliminar último libro registrado");
            System.out.println("3. Mostrar último libro registrado");
            System.out.println("4. Mostrar todos los libros registrados");
            System.out.println("5. Salir");

            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    libros = met.registrarLibro();
                    break;
                case "2":
                    libros = met.eliminarUltimo(libros);
                    break;
                case "3":
                    met.mostrarUltimo(libros);
                    break;
                case "4":
                    met.mostrarTodos(libros);
                    break;
                case "5":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
        sc.close();
    }
}
