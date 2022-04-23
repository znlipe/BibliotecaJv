public abstract class ExemplarAbs {
    private String nome;
    private String autor;
    private Integer ano;
    private String disp;

    public void Alugar(){
            System.out.println("Exemplar "+ nome + " foi alugado com sucesso!");
            //    this.disp = "Objeto Alugado!";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public ExemplarAbs(String nome, String autor, Integer ano) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
    }

    public String getDisp() {
        return disp;
    }

    public void setDisp(String disp) {
        this.disp = disp;
    }

    public ExemplarAbs() {
    }
}
