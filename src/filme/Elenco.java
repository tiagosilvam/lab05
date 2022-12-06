package filme;

import java.util.ArrayList;
import java.util.stream.Collectors;

import funcionario.*;
import pessoa.Pessoa;

public class Elenco {

    private Filme filme;
    private ArrayList<Funcionario> atores, diretores, roteiristas, cinegrafistas;

    public Elenco(Filme filme) {
        setFilme(filme);
        setAtores(new ArrayList<>());
        setDiretores(new ArrayList<>());
        setRoteiristas(new ArrayList<>());
        setCinegrafistas(new ArrayList<>());
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public ArrayList<Funcionario> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<Funcionario> atores) {
        this.atores = atores;
    }

    public void addAtor(Pessoa pessoa) {
        Funcionario ator = new Ator(pessoa);
        if(!atores.contains(ator)) atores.add(ator); ator.getPessoa().addCargo(filme.getNome() + ": " + ator.getClass().getSimpleName());
    }

    public ArrayList<Funcionario> getDiretores() {
        return diretores;
    }

    public void setDiretores(ArrayList<Funcionario> diretores) {
        this.diretores = diretores;
    }

    public void addDiretor(Pessoa pessoa) {
        Funcionario diretor = new Diretor(pessoa);
        if(!diretores.contains(diretor)) diretores.add(diretor); diretor.getPessoa().addCargo(filme.getNome() + ": " + diretor.getClass().getSimpleName());
    }

    public ArrayList<Funcionario> getRoteiristas() {
        return roteiristas;
    }

    public void setRoteiristas(ArrayList<Funcionario> roteiristas) {
        this.roteiristas = roteiristas;
    }

    public void addRoteirista(Pessoa pessoa) {
        Funcionario roteirista = new Roteirista(pessoa);
        if(!roteiristas.contains(roteirista)) roteiristas.add(roteirista); roteirista.getPessoa().addCargo(filme.getNome() + ": " + roteirista.getClass().getSimpleName());
    }

    public ArrayList<Funcionario> getCinegrafistas() {
        return cinegrafistas;
    }

    public void setCinegrafistas(ArrayList<Funcionario> cinegrafistas) {
        this.cinegrafistas = cinegrafistas;
    }

    public void addCinegrafista(Pessoa pessoa) {
        Funcionario cinegrafista = new Cinegrafista(pessoa);
        if(!cinegrafistas.contains(cinegrafista)) cinegrafistas.add(cinegrafista); cinegrafista.getPessoa().addCargo(filme.getNome() + ": " + cinegrafista.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Ator(es): " + (getAtores().isEmpty() ? "O filme não possui elenco." : getAtores().stream().map(p -> p.getPessoa().getNome()).collect(Collectors.joining(", "))) + System.lineSeparator() +
                "Diretor(es): " + (getDiretores().isEmpty() ? "Sem diretor(es)." : getDiretores().stream().map(p -> p.getPessoa().getNome()).collect(Collectors.joining(", "))) + System.lineSeparator() +
                "Roteirista(s): " + (getRoteiristas().isEmpty() ? "Sem roteirista(as)." : getRoteiristas().stream().map(p -> p.getPessoa().getNome()).collect(Collectors.joining(", "))) + System.lineSeparator() +
                "Cinegrafista(s): " + (getCinegrafistas().isEmpty() ? "Sem cinegrafista(s)." : getCinegrafistas().stream().map(p -> p.getPessoa().getNome()).collect(Collectors.joining(", "))) + System.lineSeparator();
    }
}