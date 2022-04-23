
public class Livro extends ExemplarAbs {

   @Override
    public void Alugar(){
       System.out.println("O livro " + getNome() + ", de autoria: "+ getAutor()+ ", lançado no ano de: "+ getAno() + " foi alugado com sucesso!");
   }
    public Livro(String nome, String autor, Integer Ano){
        super(nome, autor, Ano);
    }
}
