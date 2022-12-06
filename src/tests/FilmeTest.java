package tests;

import org.junit.Assert;
import org.junit.Before;
import filme.Filme;
import org.junit.Test;
import pessoa.Pessoa;
import produtora.Estudio;

public class FilmeTest {

    Filme filme1, filme2, filme3;
    Pessoa pessoa1, pessoa2, pessoa3, pessoa4, pessoa5;

    @Before
    public void start() {

        // Pessoas
        pessoa1 = new Pessoa("Milhem Cortaz");
        pessoa2 = new Pessoa("Eriberto Leão");
        pessoa3 = new Pessoa("Hermila Guedes");
        pessoa4 = new Pessoa("Giulia Gam");
        pessoa5 = new Pessoa("Lima Duarte");

        // Filmes
        filme1 = new Filme("A Grande Família - O Filme","A Grande Família", "2007", new Estudio("Globo Filmes"));
        filme2 = new Filme("2 Filhos de Francisco","Como Vai Você", "2005", new Estudio("Globo Filmes"));
        filme3 = new Filme("Assalto ao Banco Central", pessoa1, pessoa1, pessoa2,"The Boss", "2011", new Estudio("Globo Filmes"));
    }

    @Test
    public void testFilmeNome() {
        Assert.assertEquals("A Grande Família - O Filme", filme1.getNome());
        Assert.assertEquals("2 Filhos de Francisco", filme2.getNome());
        Assert.assertEquals("Assalto ao Banco Central", filme3.getNome());
    }

    @Test
    public void testFilmeTrilha() {
        Assert.assertEquals("A Grande Família", filme1.getTrilhaSonora());
        Assert.assertEquals("Como Vai Você", filme2.getTrilhaSonora());
        Assert.assertEquals("The Boss", filme3.getTrilhaSonora());
    }

    @Test
    public void testFilmeAno() {
        Assert.assertEquals("2007", filme1.getAno());
        Assert.assertEquals("2005", filme2.getAno());
        Assert.assertEquals("2011", filme3.getAno());
    }

    @Test
    public void testFilmeEstudio() {
        Assert.assertEquals("Globo Filmes", filme1.getEstudio().getNome());
        Assert.assertEquals("Globo Filmes", filme2.getEstudio().getNome());
        Assert.assertEquals("Globo Filmes", filme3.getEstudio().getNome());
    }

    @Test
    public void testFilmeElencoConstrutor() {
        Assert.assertTrue(filme3.getElenco().getDiretores().toString().contains(pessoa1.getNome()));
        Assert.assertTrue(filme3.getElenco().getRoteiristas().toString().contains(pessoa1.getNome()));
        Assert.assertTrue(filme3.getElenco().getCinegrafistas().toString().contains(pessoa2.getNome()));
    }

    @Test
    public void testFilmeElenco() {

        filme1.addElenco(pessoa1);
        filme1.addElenco(pessoa2);
        filme1.addDiretor(pessoa3);
        filme1.addRoteirista(pessoa4);
        filme1.addCinegrafista(pessoa5);

        // Test Elenco Atores
        Assert.assertTrue(filme1.getElenco().getAtores().toString().contains(pessoa1.getNome()));
        Assert.assertTrue(filme1.getElenco().getAtores().toString().contains(pessoa2.getNome()));

        // Test elenco diretores
        Assert.assertTrue(filme1.getElenco().getDiretores().toString().contains(pessoa3.getNome()));
        Assert.assertFalse(filme1.getElenco().getDiretores().toString().contains(pessoa1.getNome()));
        Assert.assertFalse(filme1.getElenco().getDiretores().toString().contains(pessoa2.getNome()));

        // Test elenco roteiristas
        Assert.assertTrue(filme1.getElenco().getRoteiristas().toString().contains(pessoa4.getNome()));
        Assert.assertFalse(filme1.getElenco().getRoteiristas().toString().contains(pessoa1.getNome()));
        Assert.assertFalse(filme1.getElenco().getRoteiristas().toString().contains(pessoa2.getNome()));

        // Test elenco cinegrafistas
        Assert.assertTrue(filme1.getElenco().getCinegrafistas().toString().contains(pessoa5.getNome()));
        Assert.assertFalse(filme1.getElenco().getCinegrafistas().toString().contains(pessoa1.getNome()));
        Assert.assertFalse(filme1.getElenco().getCinegrafistas().toString().contains(pessoa2.getNome()));

        // Test elenco duas funções
        filme1.addDiretor(pessoa1);
        filme1.addRoteirista(pessoa1);
        filme1.addCinegrafista(pessoa1);
        Assert.assertTrue(filme1.getElenco().getDiretores().toString().contains(pessoa1.getNome()));
        Assert.assertTrue(filme1.getElenco().getRoteiristas().toString().contains(pessoa1.getNome()));
        Assert.assertTrue(filme1.getElenco().getCinegrafistas().toString().contains(pessoa1.getNome()));
    }
}