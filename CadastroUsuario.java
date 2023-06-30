import java.util.List;
import java.util.ArrayList;

public class CadastroUsuario {
    private String nome;
    private String email;
    private int contato;
    List<Livros> livrosUser;
    public CadastroUsuario(){
        livrosUser = new ArrayList<>();
    }
    public void listaLivros(){
        for (Livros livros : livrosUser) {
            System.out.println("Livro: "+livros.getTitulo()+"   Codigo: "+livros.getCodigo());
        }
    }

    public void addLivro(Livros livro){
        livrosUser.add(livro);
    }

    public void removeLivro(Livros livro){
        livrosUser.remove(livro);
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
   public String getEmail(){
    return email;
   }
   public void setEmail(String novoEmail){
    this.email = novoEmail;
   }
   public int getContato(){
    return contato;
   }
   public void setContato(int novoContato){
    this.contato = novoContato;
   }
    
}
