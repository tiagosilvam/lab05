package funcionario;

import pessoa.Pessoa;

public class Diretor implements Funcionario {

    private Pessoa pessoa;

    public Diretor(Pessoa pessoa) {
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