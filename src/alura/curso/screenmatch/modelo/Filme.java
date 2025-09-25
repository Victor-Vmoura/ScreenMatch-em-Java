package alura.curso.screenmatch.modelo;

import alura.curso.screenmatch.calculos.classificavel;

public class Filme extends Titulo implements classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public String getDiretor() { return diretor; }

    public void setDiretor(String diretor) { this.diretor = diretor; }

    @Override
    public int getClassifcação() {
        return (int)pegaMedia() /2 ;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + getAnoDeLancamento() + ")";
    }

    @Override
    public int compareTo(Titulo o) {
        return 0;
    }
}
