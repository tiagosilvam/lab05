package teste;

import filme.Filme;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pessoa.Pessoa;
import produtora.Estudio;

public class TestFilmografia {

    Filme filme1, filme2;
    Pessoa pessoa1;

    @Before
    public void start() {

        // Filmes
        filme1 = new Filme("A Grande Família - O Filme","A Grande Família", "2007", new Estudio("Globo Filmes"));
        filme2 = new Filme("Assalto ao Banco Central","The Boss", "2011", new Estudio("Globo Filmes"));

        // Pessoas
        pessoa1 = new Pessoa("Milhem Cortaz");
    }

    @Test
    public void testFilmografia() {
        filme1.addElenco(pessoa1);
        filme2.addElenco(pessoa1);

        Assert.assertTrue(pessoa1.getFilmografia().toString().contains(filme1.getNome()));
        Assert.assertTrue(pessoa1.getFilmografia().toString().contains(filme2.getNome()));
    }

}