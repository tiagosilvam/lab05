package produtora;

import filme.Filme;

import java.util.ArrayList;

public class Estudio {

    private String nome;
    private ArrayList<Filme> filmes;

    public Estudio(String nome) {
        setNome(nome);
        setFilmes(new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }

    public void addFilme(Filme filme) {
        if(!filmes.contains(filme)) filmes.add(filme);
    }

    @Override
    public String toString() {
        return "Estudio{" +
                "nome='" + nome + '\'' +
                ", filmes=" + filmes +
                '}';
    }
}
