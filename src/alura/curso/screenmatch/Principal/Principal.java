package alura.curso.screenmatch.Principal;

import alura.curso.screenmatch.calculos.CalculadoraDeTempo;
import alura.curso.screenmatch.calculos.FiltroDeRecomendacao;
import alura.curso.screenmatch.modelo.Episodio;
import alura.curso.screenmatch.modelo.Filme;
import alura.curso.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Star Wars", 2000);
       //filme1.setNome("Star Wars");
        //filme1.setAnoDeLancamento(2000);
        filme1.setDuracaoEmMinutos(120);

        //Métodos de String (quando eu puxo o nome da variavel o metodo vem no proximo pontoSystem.out.println(filme1.nome.length())

        filme1.avalia(10);
        filme1.avalia(8);
        filme1.avalia(7);
        filme1.avalia(1);
        filme1.avalia(10);

        //filme1.exibeFichaTecnica();
        //System.out.println("O total de avaliações é de :" + filme1.getTotalAvaliacoes());

        Filme filme2 = new Filme("Avatar", 2023);
        //filme2.setNome("Avatar");
        //filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(180);

        Filme filme3 = new Filme("Pokemon 1", 2000);
        Filme filme4 = new Filme("Digimon 1", 2001);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());


        Serie kimetsu = new Serie("Kimetsu no Yaba", 2019);

        //kimetsu.setNome("Kimetsu no Yaba");
        kimetsu.setEpisodiosPorTemporada(10);
        kimetsu.setTemporadas(3);
        kimetsu.setMinutosPorEpisodio(25);
        kimetsu.isAtiva();
        System.out.println("Duração total da série: " + kimetsu.getDuracaoEmMinutos());


        Serie jujutsu = new Serie("Jujutsu", 2019);

        //jujutsu.setNome("Jujutsu");
        jujutsu.setEpisodiosPorTemporada(24);
        jujutsu.setTemporadas(2);
        jujutsu.setMinutosPorEpisodio(24);

        CalculadoraDeTempo calculadoraSerie = new CalculadoraDeTempo();
        calculadoraSerie.inclui(jujutsu);
        calculadoraSerie.inclui(kimetsu);
        System.out.println("Duração total das Series: " + calculadoraSerie.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(filme1);

        Episodio episodioUmJujutsu = new Episodio();
        episodioUmJujutsu.setNumero(1);
        episodioUmJujutsu.setSerie(jujutsu.getNome());
        filtro.filtra(episodioUmJujutsu);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        listaDeFilmes.add(filme4);
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.toString());
        System.out.println(listaDeFilmes.get(0).toString());
        System.out.println("_____________________________________________________________");

        System.out.println("Lista de Filme completa");

        for (Filme filme : listaDeFilmes){
            System.out.println(filme.getNome());
        }


    }
}