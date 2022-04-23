public class Filme extends ExemplarAbs {


    @Override
    public void Alugar() {
        System.out.println("O filme " + getNome() + ", de autoria: " + getAutor() + ", lançado em " + getAno() + " foi alugado com sucesso!");
    }

    public Filme(String nome, String autor, Integer Ano){
        super(nome, autor, Ano);
    }
}
