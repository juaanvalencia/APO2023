package parcial_punto3;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("978-0590353403", "Harry Potter y la piedra filosofal", "J.K. Rowling", 223);
        Libro libro2 = new Libro("978-0735619678", "Microsoft .NET: Architecting Applications for the Enterprise", "Dino Esposito", 352);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro 1 tiene más páginas que el libro 2.");
        } else if (libro2.getNumPaginas() > libro1.getNumPaginas()) {
            System.out.println("El libro 2 tiene más páginas que el libro 1.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }
    }
}

