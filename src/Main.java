import produtora.Estudio;
import pessoa.Pessoa;
import filme.Filme;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6, pessoa7, pessoa8, pessoa9, pessoa10, pessoa11, pessoaCoringa;
        Filme filme1, filme2, filme3;

        // Sistema
        Estudio estudio = new Estudio("Globo Filmes");

        // Pessoas
        pessoa1 = new Pessoa("Milhem Cortaz");
        pessoa2 = new Pessoa("Eriberto Leão");
        pessoa3 = new Pessoa("Hermila Guedes");
        pessoa4 = new Pessoa("Giulia Gam");
        pessoa5 = new Pessoa("Lima Duarte");
        pessoa6 = new Pessoa("Cássio Gabus Mendes");
        pessoa7 = new Pessoa("Antônio Abujamra");
        pessoa8 = new Pessoa("Vinícius de Oliveira");
        pessoa9 = new Pessoa("Tonico Pereira");
        pessoa10 = new Pessoa("Juliano Cazarré");
        pessoa11 = new Pessoa("Vanessa Fernandes");
        pessoaCoringa = new Pessoa("Heitor Martinez");

        // Filme 1
        estudio.addFilme(filme1 = new Filme("A Grande Família - O Filme", "A Grande Família", "2007", estudio));
        filme1.addElenco(pessoa1);
        filme1.addElenco(pessoa2);
        filme1.addElenco(pessoa3);
        filme1.addElenco(pessoaCoringa);
        filme1.addDiretor(pessoa10);
        filme1.addRoteirista(pessoa9);
        filme1.addCinegrafista(pessoa5);
        filme1.addCinegrafista(pessoa11);
        System.out.println(filme1);

        System.out.println("################################ FILME 2 ################################");
        // Filme 2
        estudio.addFilme(filme2 = new Filme("2 Filhos de Francisco","Como Vai Você", "2005", estudio));
        filme2.addElenco(pessoa4);
        filme2.addElenco(pessoa5);
        filme2.addElenco(pessoa6);
        filme2.addDiretor(pessoa10);
        filme2.addRoteirista(pessoa9);
        filme2.addRoteirista(pessoaCoringa);
        filme2.addCinegrafista(pessoa5);
        System.out.println(filme2);

        System.out.println("################################ FILME 3 ################################");
        //Filme 3
        estudio.addFilme(filme3 = new Filme("Assalto ao Banco Central", pessoa10, pessoa9, pessoa5, "The Boss", "2011", estudio));
        filme3.addElenco(pessoa7);
        filme3.addElenco(pessoa8);
        filme3.addElenco(pessoa9);
        filme3.addElenco(pessoa11);
        filme3.addElenco(pessoaCoringa);
        filme3.addCinegrafista(pessoaCoringa);
        System.out.println(filme3);

        System.out.println("############################### PRODUTORA ###############################");
        System.out.println("Filmes do estudio " + estudio.getNome() + ":");
        estudio.getFilmes().stream().map(Filme::getNome).forEach(System.out::println);

        System.out.println("############################## FILMOGRAFIA ##############################");
        System.out.println("Filmes em que " + pessoa10.getNome() + " participou ↓");
        pessoa10.getFilmografia().forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        System.out.println("Filmes em que " + pessoa5.getNome() + " participou ↓");
        pessoa5.getFilmografia().forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        System.out.println("Filmes em que " + pessoa1.getNome() + " participou ↓");
        pessoa1.getFilmografia().forEach(System.out::println);
        System.out.println("------------------------------------------------------------");
        System.out.println("Filmes em que " + pessoaCoringa.getNome() + " participou ↓");
        pessoaCoringa.getFilmografia().forEach(System.out::println);
    }
}