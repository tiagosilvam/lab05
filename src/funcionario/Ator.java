package funcionario;

import pessoa.Pessoa;

public class Ator implements Funcionario {

    private Pessoa pessoa;

    public Ator(Pessoa pessoa) {
        setPessoa(pessoa);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }


    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String toString() {
        return getPessoa().getNome();
    }
}