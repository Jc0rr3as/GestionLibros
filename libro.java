public class libro{
    private String isbn;
    private String titulo;
    private String autor;
    private String añoPublicacion;

    public libro(String isbn, String titulo, String autor, String añoPublicacion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }
}