package alura.curso.screenmatch.modelo;

import alura.curso.screenmatch.calculos.classificavel;

public class Episodio implements classificavel {
    private int numero;
    private String nome;
    private String serie;
    private int totalDeAvaliações;


    public int getTotalDeAvaliações() {
        return totalDeAvaliações;
    }

    public void setTotalDeAvaliações(int totalDeAvaliações) {
        this.totalDeAvaliações = totalDeAvaliações;
    }


    public String getSerie() {
        return serie;

    }

    public void setSerie(String serie) {
        this.serie = this.serie;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public int getClassifcação() {
        if (totalDeAvaliações > 10) {
            return 4;
        } else {
            return 2;
        }
    }
}
