package parcial_punto3;

public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void Libro11(String iSBN2, String titulo2, String autor2, int numPaginas2) {

	}

	public void Libro1(String iSBN2, String titulo2, String autor2, int numPaginas2) {
		
	}

	public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "El libro con ISBN " + ISBN + " creado por " + autor + " tiene " + numPaginas + " páginas.";
    }
}
