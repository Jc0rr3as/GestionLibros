import java.util.Stack;
import java.util.Scanner;
public class metodos {
    Scanner sc = new Scanner(System.in);
    public Stack<libro> registrarLibro(){
        Stack<libro> libros = new Stack<>();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el ISBN del libro: ");
            String isbn = sc.nextLine();
            System.out.println("Ingrese el título del libro: ");
            String titulo = sc.nextLine();
            System.out.println("Ingrese el autor del libro: ");
            String autor = sc.nextLine();
            System.out.println("Ingrese el año de publicación del libro: ");
            String añoPublicacion = sc.nextLine();

            libro nuevoLibro = new libro(isbn, titulo, autor, añoPublicacion);
            libros.push(nuevoLibro);

            System.out.println("¿Desea registrar otro libro? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        return libros;
    }

    public Stack<libro> eliminarUltimo(Stack<libro> libros){
        if (!libros.isEmpty()){
            libro libroEliminado = libros.pop();
            System.out.println("Se ha eliminado el libro: " + libroEliminado.getTitulo());
        }
        else {
            System.out.println("No hay libros para eliminar.");
        }
        return libros;
    }

    public void mostrarUltimo(Stack<libro> libros){
        if (!libros.isEmpty()){
            libro ultimoLibro = libros.peek();
            System.out.println("Último libro registrado:");
            System.out.println("ISBN: " + ultimoLibro.getIsbn());
            System.out.println("Título: " + ultimoLibro.getTitulo());
            System.out.println("Autor: " + ultimoLibro.getAutor());
            System.out.println("Año de publicación: " + ultimoLibro.getAñoPublicacion());
        }
        else {
            System.out.println("No hay libros registrados.");
        }
    }

    public void mostrarTodos(Stack<libro> libros){
        if(!libros.isEmpty()){
            System.out.println("Libros registrados:");
            for(libro l : libros){
                int indice = libros.indexOf(l) + 1;
                System.out.println(indice + ". ISBN: " + l.getIsbn() + " // Título: " + l.getTitulo() + " // Autor: " + l.getAutor() + " // Año de publicación: " + l.getAñoPublicacion());    
            }
        }
        else {
            System.out.println("No hay libros registrados.");
        }
    }
}
