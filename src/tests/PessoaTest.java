package tests;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
import pessoa.Pessoa;

public class PessoaTest {

    Pessoa pessoa1, pessoa2;

    @Before
    public void start() {
        pessoa1 = new pessoa.Pessoa("João");
        pessoa2 = new pessoa.Pessoa("Maria");
    }

    @Test
    public void testNewPessoa() {
        Assert.assertEquals("João", pessoa1.getNome());
        Assert.assertEquals("Maria", pessoa2.getNome());
    }
}