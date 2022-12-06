package pessoa;

import java.util.ArrayList;

public class Pessoa {

    private String nome;
    private ArrayList<Object> cargos;

    public Pessoa(String nome) {
        setNome(nome);
        setCargos(new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Object> getCargos() {
        return cargos;
    }

    public void setCargos(ArrayList<Object> cargos) {
        this.cargos = cargos;
    }

    public ArrayList<Object> getFilmografia() {
        return getCargos();
    }

    public void addCargo(Object cargo) {
        if(!getCargos().contains(cargo)) cargos.add(cargo);
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " " + getCargos();
    }
}