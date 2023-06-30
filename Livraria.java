import java.util.ArrayList;
import java.util.List;


class Livraria{
    private static List<Livros> livros;
    public Livraria(){
        livros = new ArrayList<>();
        livros.add (new Livros("cod 1 - Hobbit", 1));
        livros.add (new Livros("cod 2 - Senho dos anéis", 2));
        livros.add (new Livros("cod 3 - O colecionador de ossos", 3));
        livros.add (new Livros("cod 4 - O silêncio dos inocentes", 4));
        livros.add (new Livros("cod 5 - A revolução dos bichos", 5));
        livros.add (new Livros("cod 6 - 1984", 6));
        livros.add (new Livros("cod 7 - Orgulho e Preconceito", 7));
        livros.add (new Livros("cod 8 - Ponte para Terabítia", 8));
        livros.add (new Livros("cod 9 - IT: a coisa ", 9));
        livros.add (new Livros("cod 10 - Cemitério Maldito", 10));
    }
       public static List<Livros> getLivros(){
        return livros;
       }

}