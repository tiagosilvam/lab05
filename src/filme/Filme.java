package filme;

import pessoa.Pessoa;
import produtora.Estudio;

public class Filme {

    private String nome, trilhaSonora, ano;
    private Estudio estudio;
    private Elenco elenco;

    public Filme(String nome, Pessoa diretor, Pessoa roteirista, Pessoa cinegrafista, String trilhaSonora, String ano, Estudio estudio) {
        setElenco(new Elenco(this));
        setNome(nome);
        elenco.addDiretor(diretor);
        elenco.addRoteirista(roteirista);
        elenco.addCinegrafista(cinegrafista);
        setTrilhaSonora(trilhaSonora);
        setAno(ano);
        setEstudio(estudio);
    }

    public Filme(String nome, String trilhaSonora, String ano, Estudio estudio) {
        setElenco(new Elenco(this));
        setNome(nome);
        setTrilhaSonora(trilhaSonora);
        setAno(ano);
        setEstudio(estudio);
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTrilhaSonora() {
        return trilhaSonora;
    }

    public void setTrilhaSonora(String trilhaSonora) {
        this.trilhaSonora = trilhaSonora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void addElenco(Pessoa pessoa) {
        elenco.addAtor(pessoa);
    }

    public void addDiretor(Pessoa pessoa) {
        elenco.addDiretor(pessoa);
    }

    public void addRoteirista(Pessoa pessoa) {
        elenco.addRoteirista(pessoa);
    }

    public void addCinegrafista(Pessoa pessoa) {
        elenco.addCinegrafista(pessoa);
    }

    @Override
    public String toString() {
        return "--> " + getNome() + System.lineSeparator() +
                "- Trilha sonora: " + getTrilhaSonora() + System.lineSeparator() +
                "- Ano: " + getAno() + System.lineSeparator() +
                "- Estudio: " + getEstudio().getNome() + System.lineSeparator() +
                "Elenco ↓" + System.lineSeparator() +
                getElenco();
    }
}