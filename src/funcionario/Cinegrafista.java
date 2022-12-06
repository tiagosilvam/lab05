package funcionario;

import pessoa.Pessoa;

public class Cinegrafista implements Funcionario {

    private Pessoa pessoa;

    public Cinegrafista(Pessoa pessoa) {
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