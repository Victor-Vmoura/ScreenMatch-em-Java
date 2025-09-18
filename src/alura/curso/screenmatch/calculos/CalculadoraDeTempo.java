package alura.curso.screenmatch.calculos;

import alura.curso.screenmatch.modelo.Filme;
import alura.curso.screenmatch.modelo.Serie;
import alura.curso.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//
//    }
//
//    public void inclui(Serie serie){
//        tempoTotal += serie.getDuracaoEmMinutos();
//
//    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }

}
