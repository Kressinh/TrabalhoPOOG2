import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
         
    
    Scanner entrada = new Scanner (System.in);
    CadastroUsuario usuario1 = new CadastroUsuario();
    Livraria livraria = new Livraria();
    
    while(true){
        System.out.print("\033[H\033[2J"); // Código para limpar o terminal
        System.out.println("Bem Vindo(a) a Biblioteca!");
        System.out.println("--------------------------");
        System.out.println("Escolha uma opção");
        System.out.println("1- Livros");
        System.out.println("2- Devolução ");
        System.out.println("3- Novo Usuario");
        System.out.println("4- Sair");
        System.out.println("--------------------------");
        System.out.println("Digite sua opção: ");
        int opção = Integer.parseInt(entrada.nextLine()); // formato do caracter
        
        switch (opção) {
            case 1:
            List<Livros> livros = Livraria.getLivros(); // sistema que mostra as opções dos livros na livraria
            System.out.println("Opções de livros");
            
            while(true){
            for (Livros livro: livros){
                System.out.println("Titulo: " + livro.getTitulo());
                    
                
            }
            System.out.println("Digite o código dos livros que deseja");
            opção = Integer.parseInt(entrada.nextLine());
            System.out.println("----------------------------------------------------------------");
            System.out.println("Se deseja adicionar mais livros digite a opção 1 se não digite 2");
            opção = Integer.parseInt(entrada.nextLine());
            

            if (opção == 2) { 
               break; 
                
                
            }
            
           
        }
            break;  
            case 2:
            System.out.println("Didite o código do livro a devolver");
            usuario1.listaLivros();
            opção = Integer.parseInt(entrada.nextLine());
            for (Livros livro : usuario1.livrosUser){
                if(opção == livro.getCodigo()){
                    usuario1.removeLivro(livro);
                };
            }
                

           
        
              
            
            
            

                break;

            case 3:
            System.out.print("\033[H\033[2J"); // Código para limpar o terminal
            System.out.println("Digite seu dados"); // sistema que pega os dados do clieente e amarzena no CadastroUsuario
            System.out.println("Nome: " );
            String saida = entrada.nextLine();
            usuario1.setNome(saida);
            System.out.println("Email: ");
            saida = entrada.nextLine();
            usuario1.setEmail(saida);
            System.out.println("Contato: ");
            int add = entrada.nextInt();
            usuario1.setContato(add);
            System.out.println("-------------------------------");
            System.out.println("Usuário Cadastrado com sucesso!");


            case 4:
            while(true){
                System.out.println("Se deseja sair aperte 1.");
            opção = Integer.parseInt(entrada.nextLine());
            
            if (opção == 1);
            System.out.println("Obrigado por escolher a nossa Biblioteca tenha uma boa leitura!");
            
                   
            break; 
            }
            
         
            
          
            default:
                break;
                
        }


    }
    
    
}
}

