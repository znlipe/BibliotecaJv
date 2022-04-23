import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int x, i = 0;
        Scanner ler = new Scanner(System.in);
        Livro lv1 = new Livro("Percy Jackson", "Rick Riordan", 2012);
        Livro lv2 = new Livro("O nome do vento", "Patrick Rothfuss", 2007);
        Livro lv3 = new Livro("A arte da Guerra", "Sun Tzu", 1782);
        Filme f1 = new Filme("Pulp Fiction","Quentin Tarantino", 1995);
        Filme f2 = new Filme("O Lobo de Wall Street","Martin Scorsese", 2014);


        Pessoa p1 = new Pessoa();
            System.out.println("Para cadastrar cliente 1 digite o nome: ");
            p1.setNome(ler.nextLine());
            p1.setCod(+1);

        /*Pessoa p2 = new Pessoa();
            System.out.println("Para cadastrar cliente 2 digite o nome: ");
            p2.setNome(ler.nextLine());
            p2.setCod(+2);*/



        do {
            System.out.println("\nDigite 1 para listar livros e filmes e 2 para o registro de pessoas e 3 para alugar ou digite 4 para sair: ");
                x = ler.nextInt();

            if (x == 1)
            {
                //LIVROS
                System.out.println("************************************************************");
                System.out.println("O livro -> 1: " + lv1.getNome() + "\nDo Autor: " + lv1.getAutor() + "\nDe ano:  " + lv1.getAno());
                System.out.println("************************************************************");
                System.out.println("O livro -> 2: " + lv2.getNome() + "\nDo Autor: " + lv2.getAutor() + "\nDe ano:  " + lv2.getAno());
                System.out.println("************************************************************");
                System.out.println("O livro -> 3: " + lv3.getNome() + "\nDo Autor: " + lv3.getAutor() + "\nDe ano:  " + lv3.getAno());
                System.out.println("************************************************************");
                //Filmes

                System.out.println("O filme -> 4: " + f1.getNome() + "\nDo Autor: " + f1.getAutor() + "\nDe ano:  " + f1.getAno());
                System.out.println("************************************************************");
                System.out.println("O filme -> 5: " + f2.getNome() + "\nDo Autor: " + f2.getAutor() + "\nDe ano:  " + f2.getAno());
                System.out.println("************************************************************");

            } else if(x == 2)
            {
                //Pessoa
                System.out.println("Nome cliente: " + p1.getNome() + "\nCódigo do cliente " + p1.getCod());
                System.out.println("************************************************************");
                //System.out.println("Nome cliente: " + p2.getNome() + "\nCódigo do cliente " + p2.getCod());
                //System.out.println("************************************************************");
            } else if(x == 3)
            {
                System.out.println("Escolha de 1 - 5, qual você deseja alugar ");
                i = ler.nextInt();
            }
                if (i == 1)
                {
                lv1.Alugar();
                } else if (i == 2)
                    {
                    lv2.Alugar();
                    } else if (i == 3)
                        {
                        lv3.Alugar();
                        } else if (i == 4)
                            {
                            f1.Alugar();
                            } else if (i == 5)
                                {
                                f2.Alugar();
                                } else if (x > 3 || i > 5)
                                    System.out.println("Digite um número válido!");

        } while (x == 4);

    }
}
